package br.com.anteros.demo.hotel.config;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import br.com.anteros.demo.hotel.config.doc.AnterosHotelJSONDocConfiguration;
import br.com.anteros.demo.hotel.config.doc.AnterosHotelSwaggerConfiguration;
import br.com.anteros.demo.hotel.listener.AnterosHotelApplicationContextListener;
import br.com.anteros.security.spring.config.AnterosSpringSecurityMvcConfiguration;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "br.com.anteros.demo.hotel.repository.impl", "br.com.anteros.demo.hotel.service.impl",
		"br.com.anteros.demo.hotel.controller" })
public class AnterosHotelMvcConfiguration extends AnterosSpringSecurityMvcConfiguration implements WebApplicationInitializer {

	@Override
	public Class<?>[] registerFirstConfigurationClasses() {
		return null;
	}

	@Override
	public Class<?>[] registerLastConfigurationClasses() {
		return null;
	}

	@Override
	public void addListener(ServletContext servletContext) {
		servletContext.addListener(new AnterosHotelApplicationContextListener());
	}

	@Override
	public String getDisplayName() {
		return "Anteros Hotel";
	}

	@Override
	public Class<?> persistenceConfigurationClass() {
		return AnterosHotelPersistenceConfiguration.class;
	}

	@Override
	public Class<?> mvcConfigurationClass() {
		return this.getClass();
	}

	@Override
	public Class<?> swaggerConfigurationClass() {
		return AnterosHotelSwaggerConfiguration.class;
	}

	@Override
	public Class<?> securityConfigurationClass() {
		return AnterosHotelSecurityConfiguration.class;
	}

	@Override
	public Class<?> jsonDocConfigurationClass() {
		return AnterosHotelJSONDocConfiguration.class;
	}

	@Override
	public Class<?> globalMethodSecurityConfigurationClass() {
		return AnterosHotelGlobalMethodSecurityConfiguration.class;
	}
	
	@Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/");
        viewResolver.setSuffix(".html");
        registry.viewResolver(viewResolver);
    }
 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/");
    }

	@Override
	public void addServlet(ServletContext servletContext, AnnotationConfigWebApplicationContext appContext) {
	}


}
