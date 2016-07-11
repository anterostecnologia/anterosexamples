package br.com.anteros.demo.hotel.service;

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
import br.com.anteros.demo.hotel.model.Hotel;
import br.com.anteros.demo.hotel.model.type.CategoriaHotel;
import br.com.anteros.demo.hotel.model.type.Estado;
import br.com.anteros.demo.hotel.utils.AnterosHotelConfigurationUtil;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.security.spring.util.AnterosSecurityUtil;

@Rollback
public class HotelServiceTest extends AbstractTest {

	@Autowired
	private AnterosSecurityService securityService;

	@Autowired
	private HotelService hotelService;

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
	}

	@Test
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	public void deveInserirHotelComSucesso() {
		Hotel hotel = Hotel.of("Anteros", "Rod. PR 465, km 13", "87260000", "04499556896", "Araruna", Estado.PR,
				"15568795000159", CategoriaHotel.HOTEL, "anteros@anteros.com", "www.anteroshotel.com.br");
		hotelService.save(hotel);
		hotelService.flush();
		Assert.assertNotNull(hotel.getId());
	}

	@Test
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	public void deveCompararCategoriaHotel() {
		Hotel hotel = Hotel.of("Anteros", "Rod. PR 465, km 13", "87260000", "04499556896", "Araruna", Estado.PR,
				"15568795000159", CategoriaHotel.HOTEL, "anteros@anteros.com", "www.anteroshotel.com.br");
		hotelService.save(hotel);
		hotelService.flush();
		Assert.assertNotNull(hotel.getId());
		Assert.assertEquals(CategoriaHotel.HOTEL, hotelService.findOne(hotel.getId()).getCategoria());
	}

	@Test
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	public void deveRemoverHotelPorObjetoComSucesso() {
		Hotel hotel = Hotel.of("Anteros", "Rod. PR 465, km 13", "87260000", "04499556896", "Araruna", Estado.PR,
				"15568795000159", CategoriaHotel.HOTEL, "anteros@anteros.com", "www.anteroshotel.com.br");
		hotelService.save(hotel);
		hotelService.flush();
		Assert.assertNotNull(hotel.getId());
		hotelService.remove(hotel);
		Assert.assertNull(hotelService.findOne(hotel.getId()));
	}

	@Test
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	public void deveRemoverHotelPorIdComSucesso() {
		Hotel hotel = Hotel.of("Anteros", "Rod. PR 465, km 13", "87260000", "04499556896", "Araruna", Estado.PR,
				"15568795000159", CategoriaHotel.HOTEL, "anteros@anteros.com", "www.anteroshotel.com.br");
		hotelService.save(hotel);
		hotelService.flush();
		Assert.assertNotNull(hotel.getId());
		hotelService.remove(hotel.getId());
		Assert.assertNull(hotelService.findOne(hotel.getId()));
	}

	@Test
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	public void deveRetornarQuatroHoteis() {
		for (int i = 0; i < 4; i++) {
			Hotel hotel = Hotel.of("Anteros", "Rod. PR 465, km 13", "87260000", "04499556896", "Araruna", Estado.PR,
					"15568795000159", CategoriaHotel.HOTEL, "anteros@anteros.com", "www.anteroshotel.com.br");
			hotelService.save(hotel);
			Assert.assertNotNull(hotel.getId());
		}
		hotelService.flush();

		Assert.assertEquals(4, hotelService.findAll().size());
	}

	@AfterClass
	public static void runAfterTest() {
		AnterosSecurityUtil.clearAuthentication();
	}
}
