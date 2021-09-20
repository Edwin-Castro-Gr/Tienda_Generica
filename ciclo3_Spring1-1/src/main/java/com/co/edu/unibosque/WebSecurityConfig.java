package com.co.edu.unibosque;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import com.co.edu.unibosque.services.CustomUserDetailsService;
 
@Configuration

@ComponentScan({"com.co.edu.unibosque.Controller","com.co.edu.unibosque.DAO","com.co.edu.unibosque.Service"})
@EnableJpaRepositories(basePackages = {"com.co.edu.unibosque.DAO.UsuarioRepository1"})

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
		    
    @Bean
    public UserDetailsService userDetailsService() {
        return new CustomUserDetailsService();
    }
    
      
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
     
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
         
        return authProvider;
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/users").authenticated()
            .anyRequest().permitAll()
            .and()
            .formLogin()
                .usernameParameter("usuario")
                .defaultSuccessUrl("/users")
                .permitAll()
            .and()
            .logout().logoutSuccessUrl("/").permitAll();
    }
     
}
