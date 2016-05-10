package com.ucla.models;

// Generated 19/02/2016 11:51:02 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
/**
 * Patrocinante generated by hbm2java
 */
public class Patrocinante implements java.io.Serializable {

	private int idPatrocinante;
	private String nombre;
	private String direccion;
	private short telefono;
	private short correo;
	private Set<PartocinanteEvento> partocinanteEventos = new HashSet(0);

	public Patrocinante() {
	}

	public Patrocinante(int idPatrocinante, String nombre, String direccion,
			short telefono, short correo) {
		this.idPatrocinante = idPatrocinante;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}

	public Patrocinante(int idPatrocinante, String nombre, String direccion,
			short telefono, short correo, Set<PartocinanteEvento> partocinanteEventos) {
		this.idPatrocinante = idPatrocinante;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.partocinanteEventos = partocinanteEventos;
	}

	public int getIdPatrocinante() {
		return this.idPatrocinante;
	}

	public void setIdPatrocinante(int idPatrocinante) {
		this.idPatrocinante = idPatrocinante;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public short getTelefono() {
		return this.telefono;
	}

	public void setTelefono(short telefono) {
		this.telefono = telefono;
	}

	public short getCorreo() {
		return this.correo;
	}

	public void setCorreo(short correo) {
		this.correo = correo;
	}

	public Set<PartocinanteEvento> getPartocinanteEventos() {
		return this.partocinanteEventos;
	}

	public void setPartocinanteEventos(Set<PartocinanteEvento> partocinanteEventos) {
		this.partocinanteEventos = partocinanteEventos;
	}

}
