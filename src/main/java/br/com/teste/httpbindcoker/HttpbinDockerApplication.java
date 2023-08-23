package br.com.teste.httpbindcoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class HttpbinDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpbinDockerApplication.class, args);
	}

}
