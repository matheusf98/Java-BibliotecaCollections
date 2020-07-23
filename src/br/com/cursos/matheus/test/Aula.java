package br.com.cursos.matheus.test;

public class Aula implements Comparable<Aula>{
	
	private String materia;
	private int tempo;
	
	public Aula(String materia, int tempo) {
		this.materia = materia;
		this.tempo = tempo;
	}
	
	public String getMateria() {
		return materia;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		
		return "Materia : " + this.materia + " - " + "Duração : " + this.tempo + " Minutos";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.materia.compareTo(outraAula.materia);
	}
}
