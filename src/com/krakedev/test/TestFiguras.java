package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// Valida los objetos figura, cuadrado, triangulo: 
		
		Figura figura = new Figura("Ovalo","Rojo");
		Cuadrado cuadrado = new Cuadrado("Perfecto","Verde",5);
		Triangulo triangulo = new Triangulo("Equilatero","Azul");
		
		System.out.println(figura);
		System.out.println(cuadrado);
		System.out.println(triangulo);
	}

}
