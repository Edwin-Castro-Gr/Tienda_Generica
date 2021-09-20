package com.co.edu.unibosque;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import com.co.edu.unibosque.DAO.UsuarioRepository;
import com.co.edu.unibosque.entity.Usuarios;


@DataJpaTest
@EnableAutoConfiguration
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UsuarioRepositoryTest {
	
	@Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UsuarioRepository repo;
     
    // test methods go below
    @Test
    public void testCreateUser() {
        Usuarios user = new Usuarios();
        user.setCedula(7598802);
        user.setNombre("Edwin Castro");
        user.setEmail("edwincas_17@hotmail.com");
        user.setUsuario("admininicial");
        user.setPassword("admin123456");
        
        Usuarios savedUser = repo.save(user);
         
        Usuarios existUser = entityManager.find(Usuarios.class, savedUser.getId());
         
        assertThat(user.getUsuario()).isEqualTo(existUser.getUsuario());
         
    }

}