package com.ucla.models;

// Generated 01/03/2016 02:05:25 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CalendarioFecha generated by hbm2java
 */
public class CalendarioFecha implements java.io.Serializable {

	private int idCalendarioFecha;
	private Evento evento;
	private Reservacion reservacion;
	private String descripcion;
	private Date fecha;
	private boolean activo = true;
	private Set<CalendarioHora> calendarioHoras = new HashSet<CalendarioHora>(0);

	public CalendarioFecha() {
	}

	public CalendarioFecha(int idCalendarioFecha, String descripcion,
			Date fecha, boolean activo) {
		this.idCalendarioFecha = idCalendarioFecha;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.activo = activo;
	}

	public CalendarioFecha(int idCalendarioFecha, Evento evento,
			Reservacion reservacion, String descripcion, Date fecha,
			boolean activo, Set<CalendarioHora> calendarioHoras) {
		this.idCalendarioFecha = idCalendarioFecha;
		this.evento = evento;
		this.reservacion = reservacion;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.activo = activo;
		this.calendarioHoras = calendarioHoras;
	}

	public int getIdCalendarioFecha() {
		return this.idCalendarioFecha;
	}

	public void setIdCalendarioFecha(int idCalendarioFecha) {
		this.idCalendarioFecha = idCalendarioFecha;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Reservacion getReservacion() {
		return this.reservacion;
	}

	public void setReservacion(Reservacion reservacion) {
		this.reservacion = reservacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Set<CalendarioHora> getCalendarioHoras() {
		return this.calendarioHoras;
	}

	public void setCalendarioHoras(Set<CalendarioHora> calendarioHoras) {
		this.calendarioHoras = calendarioHoras;
	}

}
