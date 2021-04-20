package com.elorrieta.objetos;

public class Pokemon {

	// definir atributos de los pokemon
	private String nombre;
	private float precio;
	private int numero;
	private boolean isBrillante;

	// contructor
	public Pokemon() {
		super();
		nombre = "Sin nombre";
		precio = 0;
		numero = 0;
		isBrillante = false;

	}

	public Pokemon(String nombre, float precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}

	public Pokemon(String nombre) {
		this();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		if (isBrillante) {
			return precio + 20;
		} else {
			return precio;
		}
	}

	/**
	 * Setea el precio
	 * 
	 * @param precio float en euros
	 * @throws Exception si el precio < 0
	 */
	public void setPrecio(float precio) throws Exception {

		if (precio < 0) {
			throw new Exception("El precio debe ser 0 o superior");

		} else {
			this.precio = precio;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isBrillante() {
		return isBrillante;
	}

	public void setIsBrillante(boolean isBrillante) {
		this.isBrillante = isBrillante;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + this.nombre + ", precio=" + getPrecio() + ", numero=" + numero + ", isBrillante="
				+ isBrillante + "]";
	}

}
