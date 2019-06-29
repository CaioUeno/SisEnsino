package CasosdeUso;

import aplicacao.Usuarios.FachadaAlunoUniversitario;
import aplicacao.Usuarios.IAlunoUniversitario;
import framework.Turma;

public class CancelaMateria {

	public static void main(String[] args) {

		IAlunoUniversitario a = FachadaAlunoUniversitario.getAluno(1);

		System.out.println("Minhas Turmas: ");
		for (Turma t : a.getTurmas()) {
			System.out.println(t.getDisciplina());
		}
		System.out.println();

		// DAQUI PRA CIMA VEIO DO BANCO DE DADOS
		// Entrada de Dados
		System.out.println("Turma " + a.getTurma(3).getID() + " da disciplina de "
				+ a.getTurma(3).getDisciplina().getNome() + " foi cancelada!");
		a.removeTurma(3);

		System.out.println();

		// RESULTADO
		System.out.println("Minhas Turmas: ");
		for (Turma t : a.getTurmas()) {
			System.out.println(t.getDisciplina());
		}

	}

}
