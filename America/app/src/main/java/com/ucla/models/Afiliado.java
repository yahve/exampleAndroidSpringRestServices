package com.ucla.models;

// Generated 01/03/2016 02:05:25 AM by Hibernate Tools 4.3.1

/**
 * Afiliado generated by hbm2java
 */
public class Afiliado implements java.io.Serializable {

	private int idAfilado;
	private Persona persona;
	private Socio socio;
	private TipoAfiliado tipoAfiliado;
	private String nroCarnet;
	private boolean activo = true;

	public Afiliado() {
	}

	public Afiliado(int idAfilado, Persona persona, Socio socio,
			TipoAfiliado tipoAfiliado, String nroCarnet, boolean activo) {
		this.idAfilado = idAfilado;
		this.persona = persona;
		this.socio = socio;
		this.tipoAfiliado = tipoAfiliado;
		this.nroCarnet = nroCarnet;
		this.activo = activo;
	}

	public int getIdAfilado() {
		return this.idAfilado;
	}

	public void setIdAfilado(int idAfilado) {
		this.idAfilado = idAfilado;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Socio getSocio() {
		return this.socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public TipoAfiliado getTipoAfiliado() {
		return this.tipoAfiliado;
	}

	public void setTipoAfiliado(TipoAfiliado tipoAfiliado) {
		this.tipoAfiliado = tipoAfiliado;
	}

	public String getNroCarnet() {
		return this.nroCarnet;
	}

	public void setNroCarnet(String nroCarnet) {
		this.nroCarnet = nroCarnet;
	}

	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
