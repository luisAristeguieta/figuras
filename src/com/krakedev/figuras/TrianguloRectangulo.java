package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {

	private int catetoA;
	private int catetoB;
	private double hipotenusa; // (Valor asignado con el teorema de pitagora)
	
	
	public TrianguloRectangulo(String nombre, String color, int catetoA, int catetoB) {
		super(nombre, color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		this.hipotenusa = Math.hypot(catetoA, catetoB);;
	}
	
	@Override
	public int calcularPerimetro(){ 
		return (int)(catetoA + catetoB + hipotenusa);
	} 
	
	@Override
	public double calcularArea(){ 
		return  (catetoA*catetoB)/2; 
	}
	
}
