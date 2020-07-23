package br.com.cursos.matheus.test;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaCollections = new Curso("java Collections", "Matheus");

		javaCollections.adiciona(new Aula("Trabalhando com arrays", 50));
		javaCollections.adiciona(new Aula("Removendo listas", 25));
		javaCollections.adiciona(new Aula("Implements é confiavel?", 35));
		
		Aluno aluno1 = new Aluno("Ronaldo", 10000);
		Aluno aluno2 = new Aluno("Leandro", 11203);
		Aluno aluno3 = new Aluno("Clayson", 23555);
		
		javaCollections.Matricular(aluno1);
		javaCollections.Matricular(aluno2);
		javaCollections.Matricular(aluno3);
		
		javaCollections.getAlunos().forEach(matriculados -> {
			System.out.println(matriculados);
		});
		
		boolean esta = javaCollections.EstaMatriculado(aluno1);
		
		System.out.println(esta);
		
		
		
		

	}

}
