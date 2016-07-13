package br.com.anteros.demo.hotel.service;

import java.time.LocalDate;
import java.time.Month;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.anteros.demo.hotel.AbstractTest;
import br.com.anteros.demo.hotel.model.Cliente;
import br.com.anteros.demo.hotel.model.Hotel;
import br.com.anteros.demo.hotel.model.type.CategoriaHotel;
import br.com.anteros.demo.hotel.model.type.Estado;
import br.com.anteros.demo.hotel.utils.AnterosHotelConfigurationUtil;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.security.spring.util.AnterosSecurityUtil;

@Rollback
public class ClienteServiceTest extends AbstractTest {

	@Autowired
	private AnterosSecurityService securityService;

	@Autowired
	private HotelService hotelService;

	@Autowired
	private ClienteService clienteService;

	private Hotel hotel;

	@Before
	public void runBeforeTest() {
		Assert.assertNotNull(securityService);
		if (AnterosSecurityUtil.getLoggedUser() == null) {
			UserDetails user = securityService.loadUserByUsername("RAFAEL");
			AnterosSecurityUtil.manualAuthentication(user, AnterosHotelConfigurationUtil.getSystemName(),
					AnterosHotelConfigurationUtil.getVersion(),
					AnterosHotelConfigurationUtil.getAdminNeedsPermission());
		}
		Assert.assertNotNull(AnterosSecurityUtil.getLoggedUser());
		Assert.assertEquals("RAFAEL", AnterosSecurityUtil.getLoggedUser().getUsername());

		hotel = Hotel.of("Anteros", "Rod. PR 465, km 13", "87260000", "04499556896", "Araruna", Estado.PR,
				"15568795000159", CategoriaHotel.HOTEL, "anteros@anteros.com", "www.anteroshotel.com.br");
		hotelService.save(hotel);
		hotelService.flush();
		Assert.assertNotNull(hotel.getId());
	}

	@Test
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	public void deveInserirClienteComSucesso() {
		Cliente cliente = Cliente.of("Anteros", "Rod. PR 465, km 13", "87260000", "Araruna", Estado.PR, "044568696688",
				"04495654679", "125489465", LocalDate.of(1993, Month.FEBRUARY, 22), "anteros@anteros.com",
				"56569458000125", null, "AAS-5696", null, hotel);
		clienteService.save(cliente);
		clienteService.flush();
		Assert.assertNotNull(cliente.getId());
	}

	@Test
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	public void deveCompararEnderecoCliente() {
		Cliente cliente = Cliente.of("Anteros", "Rod. PR 465, km 13", "87260000", "Araruna", Estado.PR, "044568696688",
				"04495654679", "125489465", LocalDate.of(1993, Month.FEBRUARY, 22), "anteros@anteros.com",
				"56569458000125", null, "AAS-5696", null, hotel);
		clienteService.save(cliente);
		clienteService.flush();
		Assert.assertNotNull(cliente.getId());
		Assert.assertEquals("Rod. PR 465, km 13", clienteService.findOne(cliente.getId()).getEndereco());
	}

	@Test
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	public void deveRemoverClientePorObjetoComSucesso() {
		Cliente cliente = Cliente.of("Anteros", "Rod. PR 465, km 13", "87260000", "Araruna", Estado.PR, "044568696688",
				"04495654679", "125489465", LocalDate.of(1993, Month.FEBRUARY, 22), "anteros@anteros.com",
				"56569458000125", null, "AAS-5696", null, hotel);
		clienteService.save(cliente);
		clienteService.flush();
		Assert.assertNotNull(cliente.getId());

		clienteService.remove(cliente);
		Assert.assertNull(clienteService.findOne(cliente.getId()));
	}

	@Test
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	public void deveRemoverClientePorIdComSucesso() {
		Cliente cliente = Cliente.of("Anteros", "Rod. PR 465, km 13", "87260000", "Araruna", Estado.PR, "044568696688",
				"04495654679", "125489465", LocalDate.of(1993, Month.FEBRUARY, 22), "anteros@anteros.com",
				"56569458000125", null, "AAS-5696", null, hotel);
		clienteService.save(cliente);
		clienteService.flush();

		clienteService.remove(cliente.getId());
		Assert.assertNull(clienteService.findOne(cliente.getId()));
	}

	@Test
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	public void deveRetornarQuatroClientes() {
		for (int i = 0; i < 4; i++) {
			Cliente cliente = Cliente.of("Anteros", "Rod. PR 465, km 13", "87260000", "Araruna", Estado.PR,
					"044568696688", "04495654679", "125489465", LocalDate.of(1993, Month.FEBRUARY, 22),
					"anteros@anteros.com", "56569458000125", null, "AAS-5696", null, hotel);
			clienteService.save(cliente);
			Assert.assertNotNull(cliente.getId());
		}
		hotelService.flush();

		Assert.assertEquals(4, clienteService.findAll().size());
	}

	@AfterClass
	public static void runAfterTest() {
		AnterosSecurityUtil.clearAuthentication();
	}
}
