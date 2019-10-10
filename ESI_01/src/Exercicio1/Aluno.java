package Exercicio1;

public class Aluno {
	
	private int num_aluno;
	private String nome;
	private String curso;

	public Aluno(int num_aluno, String nome, String curso) {
		this.num_aluno=num_aluno;
		this.nome=nome;
		this.curso=curso;
	}
	
	public int getNum_aluno(){
		return num_aluno;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCurso(){
		return curso;
	}
	
	public String toString(){
		return "[" + nome + ", "+ curso + ", " + num_aluno + "]";
	}

}
