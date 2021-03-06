package com.ucla.models;

// Generated 01/03/2016 02:05:25 AM by Hibernate Tools 4.3.1

/**
 * TipoSugerencia generated by hbm2java
 */
public class TipoSugerencia implements java.io.Serializable {

	private int id;
	private String descripcion;
	private boolean activo = true;


	public TipoSugerencia() {
	}

	public TipoSugerencia(int idTipoSugerencia, String descripcion,
			boolean activo) {
		this.id = idTipoSugerencia;
		this.descripcion = descripcion;
		this.activo = activo;
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



}
