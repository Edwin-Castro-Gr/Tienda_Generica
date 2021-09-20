package com.co.edu.unibosque.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.co.edu.unibosque.entity.Usuarios;

@Repository
public interface UsuarioRepository1 extends JpaRepository<Usuarios, Long> {
	@Query ("SELECT u FROM usuarios u WHERE u.usuario = ?1")
    public Usuarios findByUsuario(String usuario); 
}
