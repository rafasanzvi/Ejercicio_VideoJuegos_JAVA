package com.curso.clases;

public class VideoJuego {

	private int codigo;
	private String titulo;
	private String consola;
	private int canJugadores;
	private String categoria;
	
	
	//Constructores
	
	//Constructor vacío
	public VideoJuego() {
		super();
	}
	
	
	//Constructor atributos
	public VideoJuego(int codigo, String titulo, String consola, int canJugadores, String categoria) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.consola = consola;
		this.canJugadores = canJugadores;
		this.categoria = categoria;
	}


	//Getters and setters
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getConsola() {
		return consola;
	}


	public void setConsola(String consola) {
		this.consola = consola;
	}


	public int getCanJugadores() {
		return canJugadores;
	}


	public void setCanJugadores(int canJugadores) {
		this.canJugadores = canJugadores;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Los video juegos de Nintendo 64 son: " + titulo;
	}

    
	
	
	
}
