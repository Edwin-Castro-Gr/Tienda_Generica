package com.co.edu.unibosque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.co.edu.unibosque.DAO.UsuarioRepository;
import com.co.edu.unibosque.entity.Usuarios;

@Service

@ComponentScan({"com.co.edu.unibosque.Controller","com.co.edu.unibosque.DAO","com.co.edu.unibosque.Service"})
@EnableJpaRepositories(basePackages = {"com.co.edu.unibosque.DAO.UsuarioRepository1"})
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
    private UsuarioRepository Repo;
	
	@Override
	public UserDetails loadUserByUsername(String Username) throws UsernameNotFoundException {
		Usuarios user = Repo.findByUsuario(Username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }
}

