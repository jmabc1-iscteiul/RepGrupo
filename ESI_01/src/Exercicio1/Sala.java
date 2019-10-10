package Exercicio1;

import java.util.ArrayList;

public class Sala {

	private int capacidade;
	private char nome_bloco;
	private int num_sala;
	
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public Sala(int capacidade, char nome_bloco, int num_sala) {

		this.capacidade=capacidade;
		this.nome_bloco=nome_bloco;
		this.num_sala=num_sala;		
	}
	
	public void addAluno(Aluno a){
		
		if(alunos.size() < capacidade && !alunos.contains(a)){
		alunos.add(a);
		System.out.println("Inseri aluno: "+a);
		}
		else {
			System.out.println("Não inseri aluno: "+a);
		}
	}
	
	public void removeAluno(Aluno a){
		//if(alunos.contains(a)){ ----- Não é necessário pois o remove verifica se existe!
		
		if(alunos.remove(a)){
			System.out.println("Removi aluno: "+a);
		}
		else System.out.println("Não removi o aluno: "+a);
		//}
	}
	
}
