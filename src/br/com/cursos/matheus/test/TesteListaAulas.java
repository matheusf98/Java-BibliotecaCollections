package br.com.cursos.matheus.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaAulas {

	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Matematica", 45);
		Aula aula2 = new Aula("Português", 50);
		Aula aula3 = new Aula("Biologia", 30);
		Aula aula4 = new Aula("Artes", 35);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		for(Aula aula : aulas) {
			System.out.println(aula);
		}
		
		System.out.println("-----------------------------------");
		
		Collections.sort(aulas, Comparator.comparing(Aula :: getTempo));
		
		for(Aula aula : aulas) {
			System.out.println(aula);
		}

	}

}
