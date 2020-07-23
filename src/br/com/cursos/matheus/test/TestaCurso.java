package br.com.cursos.matheus.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaCollections = new Curso("java Collections", "Matheus");
		
		javaCollections.adiciona(new Aula("Trabalhando com arrays", 50));
		javaCollections.adiciona(new Aula("Removendo listas", 25));
		javaCollections.adiciona(new Aula("Implements é confiavel?", 35));
		
		System.out.println(javaCollections.getAulas());
		
		List<Aula> aulasImutaveis = javaCollections.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aula = new ArrayList<Aula>(aulasImutaveis);
		
		Collections.sort(aula);
		System.out.println(aula);
		int total = javaCollections.getTempoTotal();
		System.out.println(total);
		
		System.out.println(javaCollections);
	}
}
