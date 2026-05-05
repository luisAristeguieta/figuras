package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {
	public static void main(String[] args) {
		
		Graficador graficador = new Graficador();
		Figura figura = new Triangulo("Cuadrado", "Azul", 5,8); 
		Cuadrado cuadrado = new Cuadrado("Perfecto","Verde",5);
		Rectangulo rectangulo = new Rectangulo("Equilatero","Azul",5,3);
		
		graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
		graficador.graficar(new TrianguloRectangulo("Triangulo Rectangulo ", "Amarillo" , 5, 7));
		graficador.graficar(new Hexagono("Hexagono", "Morado", 4));

	}
}
