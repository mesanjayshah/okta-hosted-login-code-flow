package com.beyondid;

import com.beyondid.data.OktaUsers;
import com.beyondid.utils.OktaConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class HostedLoginCodeFlowApplication {
	OktaConfigurationProperties oktaConfigurationProperties;

	public static void main(String[] args) {
		SpringApplication.run(HostedLoginCodeFlowApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}


	@Configuration

	static class OAuth2SecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
					.antMatchers(HttpMethod.GET,"/custom-login", "/css/okta.css").permitAll()
					.antMatchers(HttpMethod.POST,"/custom-login", "/css/okta.css").permitAll()
					.antMatchers(HttpMethod.GET,"/**").permitAll()
					.antMatchers(HttpMethod.POST,"/**").permitAll()
					.antMatchers("okta/**").permitAll()
					.antMatchers("okta/addOktaUserFormwithPassword").permitAll()
					.anyRequest().authenticated()
				.and().oauth2Client()
				.and().oauth2Login();
		}
	}


}
