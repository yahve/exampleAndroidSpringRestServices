package com.ucla.models;

// Generated 19/02/2016 11:51:02 PM by Hibernate Tools 4.3.1

/**
 * InvitadoAlquiler generated by hbm2java
 */
public class InvitadoAlquiler implements java.io.Serializable {

	private int idInvitadoAlquiler;
	private Alquiler alquiler;
	private Invitado invitado;

	public InvitadoAlquiler() {
	}

	public InvitadoAlquiler(int idInvitadoAlquiler, Alquiler alquiler,
			Invitado invitado) {
		this.idInvitadoAlquiler = idInvitadoAlquiler;
		this.alquiler = alquiler;
		this.invitado = invitado;
	}

	public int getIdInvitadoAlquiler() {
		return this.idInvitadoAlquiler;
	}

	public void setIdInvitadoAlquiler(int idInvitadoAlquiler) {
		this.idInvitadoAlquiler = idInvitadoAlquiler;
	}

	public Alquiler getAlquiler() {
		return this.alquiler;
	}

	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}

	public Invitado getInvitado() {
		return this.invitado;
	}

	public void setInvitado(Invitado invitado) {
		this.invitado = invitado;
	}

}
