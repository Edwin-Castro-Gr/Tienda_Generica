package com.co.edu.unibosque.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	/**
	 * 
	 */
	public Usuarios() {
		
	}
//	private static final long serialVersionUID = -334809342530118799L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "cedula_usuario", nullable = false, unique = true)
	private long cedula;
	
	@Column(name = "nombre_usuario", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "email_usuario", nullable = false, length = 50, unique = true)
	private String email;
	
	@Column(name = "usuario", nullable = false, length = 50, unique = true)
	private String usuario;
	
	@Column(name = "password", nullable = false, length = 50)
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
