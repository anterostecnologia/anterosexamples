package br.com.anteros.demo.hotel.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.anteros.demo.hotel.AbstractTest;
import br.com.anteros.demo.hotel.utils.AnterosHotelConfigurationUtil;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.security.spring.util.AnterosSecurityUtil;

public class HotelServiceTest extends AbstractTest {

	private static AnterosSecurityService securityService;

	@Autowired
	public void setSecurityService(AnterosSecurityService service) {
		HotelServiceTest.securityService = service;
	}

	@Autowired
	private HotelService hotelService;

	@Before
	public void deveRealizarAutenticacao() {
		Assert.assertNotNull(securityService);
		UserDetails user = securityService.loadUserByUsername("RAFAEL");
		AnterosSecurityUtil.manualAuthentication(user, AnterosHotelConfigurationUtil.getSystemName(),
				AnterosHotelConfigurationUtil.getVersion(), AnterosHotelConfigurationUtil.getAdminNeedsPermission());
	}

	@Test
	public void deveVerificarUsuarioLogado() {
		Assert.assertNotNull(AnterosSecurityUtil.getLoggedUser());
		Assert.assertEquals("RAFAEL", AnterosSecurityUtil.getLoggedUser().getUsername());
	}

	@Test
	public void deveRetornarUmHotel() {
		Assert.assertNotNull(AnterosSecurityUtil.getLoggedUser());
		Assert.assertEquals("RAFAEL", AnterosSecurityUtil.getLoggedUser().getUsername());
		// Assert.assertNotNull(hotelService.findOne(5L));
	}

	@After
	public void deveLimparAutenticacao() {
		AnterosSecurityUtil.clearAuthentication();
	}
}
