package com.ucla.models;

// Generated 01/03/2016 02:05:25 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * MotivoPostulacion generated by hbm2java
 */
public class MotivoPostulacion implements java.io.Serializable {

	private int id;
	private String descripcion;
	private boolean activo = true;
	private Set<Postulacion> postulacions = new HashSet<Postulacion>(0);

	public MotivoPostulacion() {
	}

	public MotivoPostulacion(int idMotivoPostulacion, String descripcion,
			boolean activo) {
		this.id = idMotivoPostulacion;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public MotivoPostulacion(int idMotivoPostulacion, String descripcion,
			boolean activo, Set<Postulacion> postulacions) {
		this.id = idMotivoPostulacion;
		this.descripcion = descripcion;
		this.activo = activo;
		this.postulacions = postulacions;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Set<Postulacion> getPostulacions() {
		return this.postulacions;
	}

	public void setPostulacions(Set<Postulacion> postulacions) {
		this.postulacions = postulacions;
	}

}
