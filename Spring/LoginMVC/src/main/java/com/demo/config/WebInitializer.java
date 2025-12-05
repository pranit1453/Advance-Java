package com.demo.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);

		DispatcherServlet dispserv = new DispatcherServlet(context);
		ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", dispserv);
		registration.setLoadOnStartup(1);
		registration.addMapping("/");

	}

}
