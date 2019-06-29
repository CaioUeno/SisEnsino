package CasosdeUso;

import aplicacao.Usuarios.FachadaAlunoUniversitario;
import aplicacao.Usuarios.IAlunoUniversitario;
import aplicacao.Usuarios.TurmaUniversidade;
import framework.Escola;

public class CriaTurma {

	public static void main(String[] args) {
		
		Escola escola = new Escola("UFScar");

		IAlunoUniversitario a = FachadaAlunoUniversitario.getAluno(1);
		
		TurmaUniversidade turma = new TurmaUniversidade(1, a.getTurma(3).getDisciplina(), "10/01/2020", "01/08/2020");
		TurmaUniversidade turma1 = new TurmaUniversidade(2, a.getTurma(4).getDisciplina(), "10/01/2020", "01/08/2020");
		TurmaUniversidade turma2 = new TurmaUniversidade(3, a.getTurma(20).getDisciplina(), "10/01/2020", "01/08/2020");
		
		System.out.println("Criando turma para a materia " + turma.getDisciplina().getNome() + " : " + turma.getDataInicio() + " ate " + turma.getDataFim());
		System.out.println("Criando turma para a materia " + turma1.getDisciplina().getNome() + " : " + turma1.getDataInicio() + " ate " + turma1.getDataFim());
		System.out.println("Criando turma para a materia " + turma2.getDisciplina().getNome() + " : " + turma2.getDataInicio() + " ate " + turma2.getDataFim());


		escola.addTurma(turma);
		escola.addTurma(turma1);
		escola.addTurma(turma2);
		

	}

}
