package com.ucla.models;

// Generated 01/03/2016 02:05:25 AM by Hibernate Tools 4.3.1

/**
 * RedClub generated by hbm2java
 */
public class RedClub implements java.io.Serializable {

	private int idRedClub;
	private Club club;
	private RedSocial redSocial;
	private String enlace;
	private boolean activo = true;

	public RedClub() {
	}

	public RedClub(int idRedClub, Club club, RedSocial redSocial,
			String enlace, boolean activo) {
		this.idRedClub = idRedClub;
		this.club = club;
		this.redSocial = redSocial;
		this.enlace = enlace;
		this.activo = activo;
	}

	public int getIdRedClub() {
		return this.idRedClub;
	}

	public void setIdRedClub(int idRedClub) {
		this.idRedClub = idRedClub;
	}

	public Club getClub() {
		return this.club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public RedSocial getRedSocial() {
		return this.redSocial;
	}

	public void setRedSocial(RedSocial redSocial) {
		this.redSocial = redSocial;
	}

	public String getEnlace() {
		return this.enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
