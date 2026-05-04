package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestGraficar {
	public static void main(String[] args) {
		
		Graficador graficador = new Graficador();
		Figura figura = new Figura("Ovalo","Rojo");
		Cuadrado cuadrado = new Cuadrado("Perfecto","Verde");
		Rectangulo rectangulo = new Rectangulo("Equilatero","Azul");
		
		graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
		
	}
}
