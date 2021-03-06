package com.ucla.models;

// Generated 01/03/2016 02:05:25 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * MotivoVenta generated by hbm2java
 */
public class MotivoVenta implements java.io.Serializable {

	private int idMotivoVenta;
	private String descripcion;
	private boolean activo = true;
	private Set<SolicitudVenta> solicitudVentas = new HashSet<SolicitudVenta>(0);

	public MotivoVenta() {
	}

	public MotivoVenta(int idMotivoVenta, String descripcion, boolean activo) {
		this.idMotivoVenta = idMotivoVenta;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public MotivoVenta(int idMotivoVenta, String descripcion, boolean activo,
			Set<SolicitudVenta> solicitudVentas) {
		this.idMotivoVenta = idMotivoVenta;
		this.descripcion = descripcion;
		this.activo = activo;
		this.solicitudVentas = solicitudVentas;
	}

	public int getIdMotivoVenta() {
		return this.idMotivoVenta;
	}

	public void setIdMotivoVenta(int idMotivoVenta) {
		this.idMotivoVenta = idMotivoVenta;
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

	public Set<SolicitudVenta> getSolicitudVentas() {
		return this.solicitudVentas;
	}

	public void setSolicitudVentas(Set<SolicitudVenta> solicitudVentas) {
		this.solicitudVentas = solicitudVentas;
	}

}
