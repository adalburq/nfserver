package br.com.serproserv;

import java.util.HashMap;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	HashMap<String, Object> props = new HashMap<>();
		
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		props.put("server.port", 9994);
		
		return application.sources(SerproservApplication.class)
			    .properties(props);
	}

}
