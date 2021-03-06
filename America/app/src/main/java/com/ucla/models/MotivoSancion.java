package com.ucla.models;

// Generated 01/03/2016 02:05:25 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * MotivoSancion generated by hbm2java
 */
public class MotivoSancion implements java.io.Serializable {

	private int idMotivoSancion;
	private String motivo;
	private String descripcion;
	private boolean activo = true;
	private Set<Sancion> sancions = new HashSet<Sancion>(0);

	public MotivoSancion() {
	}

	public MotivoSancion(int idMotivoSancion, String motivo,
			String descripcion, boolean activo) {
		this.idMotivoSancion = idMotivoSancion;
		this.motivo = motivo;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public MotivoSancion(int idMotivoSancion, String motivo,
			String descripcion, boolean activo, Set<Sancion> sancions) {
		this.idMotivoSancion = idMotivoSancion;
		this.motivo = motivo;
		this.descripcion = descripcion;
		this.activo = activo;
		this.sancions = sancions;
	}

	public int getIdMotivoSancion() {
		return this.idMotivoSancion;
	}

	public void setIdMotivoSancion(int idMotivoSancion) {
		this.idMotivoSancion = idMotivoSancion;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
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

	public Set<Sancion> getSancions() {
		return this.sancions;
	}

	public void setSancions(Set<Sancion> sancions) {
		this.sancions = sancions;
	}

}
