package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graficador graficador = new Graficador();
		Figura figura = new Triangulo("Cuadrado", "Azul", 5,7); 
		Cuadrado cuadrado = new Cuadrado("Perfecto","Verde",5);
		Rectangulo rectangulo = new Rectangulo("Equilatero","Azul",5,3);
		
		graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);

	}

}
