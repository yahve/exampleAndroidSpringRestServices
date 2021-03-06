package com.ucla.models;

// Generated 01/03/2016 02:05:25 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Evento generated by hbm2java
 */
public class Evento implements java.io.Serializable {

	private int id;
	private EstadoEvento estadoEvento;
	private String nombre;
	private String descripcion;
	private String fechaInicio;
	private String fechaFin;
	private boolean publico;
	private boolean activo = true;
	private Set<Noticia> noticias = new HashSet<Noticia>(0);
	private Set<PreferenciaEvento> preferenciaEventos = new HashSet<PreferenciaEvento>(
			0);
	private Set<MotivoCancelacion> motivoCancelacions = new HashSet<MotivoCancelacion>(
			0);
	private Set<Actividad> actividads = new HashSet<Actividad>(0);
	private Set<InstalacionEvento> instalacionEventos = new HashSet<InstalacionEvento>(
			0);
	private Set<IndicadorEvento> indicadorEventos = new HashSet<IndicadorEvento>(
			0);
	private Set<CalendarioFecha> calendarioFechas = new HashSet<CalendarioFecha>(
			0);

	public Evento() {
	}

	public Evento(int idEvento, EstadoEvento estadoEvento, String nombre,
			String descripcion, String fechaInicio, String fechaFin,
			boolean publico, boolean activo) {
		this.id = idEvento;
		this.estadoEvento = estadoEvento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.publico = publico;
		this.activo = activo;
	}

	public Evento(int idEvento, EstadoEvento estadoEvento, String nombre,
			String descripcion, String fechaInicio, String fechaFin,
			boolean publico, boolean activo, Set<Noticia> noticias,
			Set<PreferenciaEvento> preferenciaEventos,
			Set<MotivoCancelacion> motivoCancelacions,
			Set<Actividad> actividads,
			Set<InstalacionEvento> instalacionEventos,
			Set<IndicadorEvento> indicadorEventos,
			Set<CalendarioFecha> calendarioFechas) {
		this.id = idEvento;
		this.estadoEvento = estadoEvento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.publico = publico;
		this.activo = activo;
		this.noticias = noticias;
		this.preferenciaEventos = preferenciaEventos;
		this.motivoCancelacions = motivoCancelacions;
		this.actividads = actividads;
		this.instalacionEventos = instalacionEventos;
		this.indicadorEventos = indicadorEventos;
		this.calendarioFechas = calendarioFechas;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EstadoEvento getEstadoEvento() {
		return this.estadoEvento;
	}

	public void setEstadoEvento(EstadoEvento estadoEvento) {
		this.estadoEvento = estadoEvento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public boolean isPublico() {
		return this.publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}

	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Set<Noticia> getNoticias() {
		return this.noticias;
	}

	public void setNoticias(Set<Noticia> noticias) {
		this.noticias = noticias;
	}

	public Set<PreferenciaEvento> getPreferenciaEventos() {
		return this.preferenciaEventos;
	}

	public void setPreferenciaEventos(Set<PreferenciaEvento> preferenciaEventos) {
		this.preferenciaEventos = preferenciaEventos;
	}

	public Set<MotivoCancelacion> getMotivoCancelacions() {
		return this.motivoCancelacions;
	}

	public void setMotivoCancelacions(Set<MotivoCancelacion> motivoCancelacions) {
		this.motivoCancelacions = motivoCancelacions;
	}

	public Set<Actividad> getActividads() {
		return this.actividads;
	}

	public void setActividads(Set<Actividad> actividads) {
		this.actividads = actividads;
	}

	public Set<InstalacionEvento> getInstalacionEventos() {
		return this.instalacionEventos;
	}

	public void setInstalacionEventos(Set<InstalacionEvento> instalacionEventos) {
		this.instalacionEventos = instalacionEventos;
	}

	public Set<IndicadorEvento> getIndicadorEventos() {
		return this.indicadorEventos;
	}

	public void setIndicadorEventos(Set<IndicadorEvento> indicadorEventos) {
		this.indicadorEventos = indicadorEventos;
	}

	public Set<CalendarioFecha> getCalendarioFechas() {
		return this.calendarioFechas;
	}

	public void setCalendarioFechas(Set<CalendarioFecha> calendarioFechas) {
		this.calendarioFechas = calendarioFechas;
	}

}
