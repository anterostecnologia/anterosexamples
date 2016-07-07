package br.com.anteros.demo.hotel.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("WEB-INF/anterosHotel.properties")
@ComponentScan(basePackages = { "br.com.anteros.security" })
public final class AnterosHotelConfigurationUtil {

	@Value("${system.name}")
	private static String systemName;

	@Value("${system.description}")
	private static String description;

	@Value("${system.version}")
	private static String version;

	@Value("${admin.needs.permission}")
	private static String adminNeedsPermission;

	@Value("${package.scan.security}")
	private static String packageToScanSecurity;

	public static String getSystemName() {
		return systemName;
	}

	public static String getDescription() {
		return systemName;
	}

	public static String getVersion() {
		return version;
	}

	public static Boolean getAdminNeedsPermission() {
		return Boolean.valueOf(adminNeedsPermission);
	}

	public static String getPackageToScanSecurity() {
		return packageToScanSecurity;
	}
}
