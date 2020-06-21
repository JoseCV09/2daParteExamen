package pe.edu.upeu.academico.auth;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		http.authorizeRequests().antMatchers(HttpMethod.GET, "/examen/categoria","/examen/producto").hasRole("USER")
		.antMatchers(HttpMethod.GET, "/examen/categoria/{id}","/examen/producto/{id}").hasRole("USER")
		.antMatchers(HttpMethod.POST, "/examen/categoria","/examen/producto").hasAnyRole("USER")
		.antMatchers(HttpMethod.PUT, "/categoria/modificar/{id}","/producto/modificar/{id}").hasAnyRole("USER")
		.antMatchers(HttpMethod.DELETE, "/examen/categoria/eliminar/{id}","/examen/producto/eliminar/{id}").hasAnyRole("USER")
		.anyRequest().authenticated();
	}
}

