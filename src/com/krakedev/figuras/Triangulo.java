package com.krakedev.figuras;

public class Triangulo extends Figura {

	private int base;
	private int altura;

	public Triangulo(String nombre, String color, int base, int altura) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;

	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}

	// En la implemetacion de cambiar figuras a abstrato faltaria este metodo, se
	// sabe que hay varios tipo de triangulos, para este caso aplico que se un
	// triangulo isosceles y le agrego el metodo que permite calcular el perimetro
	@Override
	public int calcularPerimetro() {
		double lado = Math.sqrt(Math.pow(base / 2.0, 2) + Math.pow(altura, 2));
		return (int) (base + 2 * lado);
	}
}
