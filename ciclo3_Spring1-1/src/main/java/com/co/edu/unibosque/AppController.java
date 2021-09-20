package com.co.edu.unibosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.co.edu.unibosque.DAO.UsuarioRepository1;
import com.co.edu.unibosque.entity.Usuarios;

@Controller

@ComponentScan({"com.co.edu.unibosque.Controller","com.co.edu.unibosque.DAO","com.co.edu.unibosque.Service"})
@EnableJpaRepositories(basePackages = {"com.co.edu.unibosque.DAO.UsuarioRepository1"})
public class AppController {
	
	@Autowired
    private UsuarioRepository1 Repo;
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new Usuarios());
         
        return "register_form";
    }
    
    @PostMapping("/process_register")
    public String processRegister(Usuarios user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
         
        Repo.save(user);
         
        return "register_success";
    }
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<Usuarios> listUsers = Repo.findAll();
        model.addAttribute("listUsers", listUsers);
         
        return "users";
    }
}
