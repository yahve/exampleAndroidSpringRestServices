package com.ucla.models;

// Generated 19/02/2016 11:51:02 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Invitado generated by hbm2java
 */
public class Invitado implements java.io.Serializable {

	private int idInvitado;
	private Persona persona;
	private Set<Visita> visitas = new HashSet(0);
	private Set<InvitadoAlquiler> invitadoAlquilers = new HashSet(0);

	public Invitado() {
	}

	public Invitado(int idInvitado, Persona persona) {
		this.idInvitado = idInvitado;
		this.persona = persona;
	}

	public Invitado(int idInvitado, Persona persona, Set<Visita> visitas,
			Set<InvitadoAlquiler> invitadoAlquilers) {
		this.idInvitado = idInvitado;
		this.persona = persona;
		this.visitas = visitas;
		this.invitadoAlquilers = invitadoAlquilers;
	}

	public int getIdInvitado() {
		return this.idInvitado;
	}

	public void setIdInvitado(int idInvitado) {
		this.idInvitado = idInvitado;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Set<Visita> getVisitas() {
		return this.visitas;
	}

	public void setVisitas(Set<Visita> visitas) {
		this.visitas = visitas;
	}

	public Set<InvitadoAlquiler> getInvitadoAlquilers() {
		return this.invitadoAlquilers;
	}

	public void setInvitadoAlquilers(Set<InvitadoAlquiler> invitadoAlquilers) {
		this.invitadoAlquilers = invitadoAlquilers;
	}

}
