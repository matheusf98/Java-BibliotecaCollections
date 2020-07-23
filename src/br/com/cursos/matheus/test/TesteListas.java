package br.com.cursos.matheus.test;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListas {
	public static void main(String[] args) {
		
		ArrayList<String> listas = new ArrayList<String>();
		String lista1 = "Português";
		String lista2 = "Matematica";
		String lista3 = "Historia";
		String lista4 = "Biologia";
		
		listas.add(lista1);
		listas.add(lista2);
		listas.add(lista3);
		listas.add(lista4);
		
		System.out.println(listas);
		
		listas.remove(1);
		
		System.out.println(listas);
		
		for(String Aula : listas) {
			System.out.println("(Usando ForEach)Aula : " + Aula);
		}
		
		for(int i = 0; i < listas.size(); i++) {
			System.out.println("(Usando For)Aula : " + listas.get(i));
		}
		
		listas.forEach(lista -> {System.out.println("(Usando ForEach Lambda)Aula : " + lista);});
		
		System.out.println("Antes do metodo sort : " + listas);
		Collections.sort(listas);
		System.out.println("Depois do metodo sort : " + listas);
	}
}
