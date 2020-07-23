package br.com.cursos.matheus.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "Curso: " + this.nome + " Tempo Total: " + this.getTempoTotal();
	}

	public void Matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaAluno.put(aluno.getRegistro(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean EstaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscarMatricula(int ra) {
		if(!matriculaAluno.containsKey(ra))
			throw new NoSuchElementException();
		return matriculaAluno.get(ra);
	}
	
	
}
