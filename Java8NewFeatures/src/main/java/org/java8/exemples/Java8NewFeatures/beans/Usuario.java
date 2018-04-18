package org.java8.exemples.Java8NewFeatures.beans;

/**
 * testando novamente
 * @author rafael.carmo
 *
 */
public class Usuario {
	private String name;
	private int points;
	private boolean moderator;
	private int numero;

	public Usuario(String name, int points) {
		this.points = points;
		this.name = name;
		this.moderator = false;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void tornaModerator() {
		this.moderator = true;
	}
	
	public boolean isModerator() {
		return moderator;
	}

	public void becameModerator() {
		this.moderator = true;
	}
}
