package Exercicio1;

public class Main {

	public static void main(String[] args) {
		Sala s = new Sala(3, 'A', 0);
		
		Aluno a = new Aluno(11223, "Pedro", "ETI");
		Aluno a1 = new Aluno(36663, "Miguel", "LEI");
		Aluno a2 = new Aluno(38274, "Ana", "LEI");
		Aluno a3 = new Aluno(22100, "Maria", "ETI");
		
		s.addAluno(a);
		s.addAluno(a1);
		s.addAluno(a2);
		s.addAluno(a3);
		
		s.removeAluno(a2);
		s.addAluno(a3);
		
		
		
	}

}
