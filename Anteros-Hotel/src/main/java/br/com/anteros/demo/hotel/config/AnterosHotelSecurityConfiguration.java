package br.com.anteros.demo.hotel.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import br.com.anteros.security.spring.config.AnterosSpringSecurityConfiguration;

@Configuration
@PropertySource("WEB-INF/anterosHotel.properties")
@ComponentScan(basePackages = { "br.com.anteros.security" })
public class AnterosHotelSecurityConfiguration extends AnterosSpringSecurityConfiguration {

	@Value("${system.name}")
	private String systemName;

	@Value("${system.description}")
	private String description;

	@Value("${system.version}")
	private String version;

	@Value("${admin.needs.permission}")
	private String adminNeedsPermission;

	@Value("${package.scan.security}")
	private String packageToScanSecurity;

	@Override
	public String systemName() {
		return systemName;
	}

	@Override
	public String description() {
		return description;
	}

	@Override
	public String version() {
		return version;
	}

	@Override
	public Boolean adminNeedsPermission() {
		return Boolean.valueOf(adminNeedsPermission);
	}

	@Override
	public String packageToScanSecurity() {
		return packageToScanSecurity;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/index.html").permitAll()
		                        .antMatchers("/assets/**").permitAll()
		                        .antMatchers("/app/**").permitAll()
		                        .antMatchers("/login*").permitAll()
				                .anyRequest().authenticated().and()
	        .formLogin().and()
	        .httpBasic();
	}

}
