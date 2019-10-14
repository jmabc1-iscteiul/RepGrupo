package Exercicio1;

public class AlunoPL extends Aluno {
	
	boolean pL;
	
	public AlunoPL(int num_aluno, String nome, String curso, boolean pL) {
		super(num_aluno, nome, curso);
		this.pL = pL;
		
	}
	
	public void mudar(AlunoPL aluno) {
		this.pL = !pL;
	}
}
