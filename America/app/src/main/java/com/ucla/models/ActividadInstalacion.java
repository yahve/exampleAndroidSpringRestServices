package com.ucla.models;

// Generated 19/02/2016 11:51:02 PM by Hibernate Tools 4.3.1

/**
 * ActividadInstalacion generated by hbm2java
 */
public class ActividadInstalacion implements java.io.Serializable {

	private int idActividadInstalacion;
	private Actividad actividad;
	private Instalacion instalacion;

	public ActividadInstalacion() {
	}

	public ActividadInstalacion(int idActividadInstalacion,
			Actividad actividad, Instalacion instalacion) {
		this.idActividadInstalacion = idActividadInstalacion;
		this.actividad = actividad;
		this.instalacion = instalacion;
	}

	public int getIdActividadInstalacion() {
		return this.idActividadInstalacion;
	}

	public void setIdActividadInstalacion(int idActividadInstalacion) {
		this.idActividadInstalacion = idActividadInstalacion;
	}

	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public Instalacion getInstalacion() {
		return this.instalacion;
	}

	public void setInstalacion(Instalacion instalacion) {
		this.instalacion = instalacion;
	}

}
