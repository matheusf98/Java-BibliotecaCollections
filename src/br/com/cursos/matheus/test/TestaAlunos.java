package br.com.cursos.matheus.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Collection<String> aluno = new HashSet<String>();
		
		aluno.add("Guilherme");
		aluno.add("Romero");
		aluno.add("Lucas");
		aluno.add("Felipe");
		aluno.add("Vitor");
		aluno.add("Cassio");
		
		boolean existeTrue = aluno.contains("Guilherme");
		System.out.println(existeTrue);
		
		boolean existeFalse = aluno.contains("Matheus");
		System.out.println(existeFalse);
		
		System.out.println(aluno);
		System.out.println("---------------------");
		
		aluno.forEach(alunos -> {
			System.out.println(alunos);
		});
		
		System.out.println("---------------------");
		
		for (String alunos : aluno) {
			System.out.println(alunos);
		}
		
		System.out.println("---------------------");
		
		List<String> alunosEmOrdem = new ArrayList<String>(aluno);
		
		Collections.sort(alunosEmOrdem);
		
		alunosEmOrdem.forEach(alunos -> {
			System.out.println(alunos);
		});

	}
}
