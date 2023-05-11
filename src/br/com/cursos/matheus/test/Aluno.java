package br.com.cursos.matheus.test;

public class Aluno {

	private String sobrenome;

	private String nome;
	private int registro;

	public Aluno(String nome, int registro) {
		if(nome == null) {
			throw new NullPointerException("Nome n�o pode ser Null");
		}
		this.nome = nome;
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public int getRegistro() {
		return registro;
	}
	
	@Override
	public String toString() {
		return "Aluno: " + this.nome + " RA: " + this.registro;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
