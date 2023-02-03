package com.app.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TiendaLupitaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaLupitaApplication.class, args);
	}

}
