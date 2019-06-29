package CasosdeUso;

import aplicacao.Usuarios.FachadaAlunoUniversitario;
import aplicacao.Usuarios.FachadaMateria;
import aplicacao.Usuarios.IAlunoUniversitario;
import aplicacao.Usuarios.IMateria;

public class SetaNota {

	public static void main(String[] args) {

		IAlunoUniversitario aluno = FachadaAlunoUniversitario.getAluno(2);
		IMateria materia = FachadaMateria.getMateria(6);

		System.out.println("Aluno " + aluno.getNome() + " com nota -> " + aluno.getNotaDisciplina(materia.getID()));

		// BANCO DE DADOS

		// Entrada de dados
		aluno.getnotaT(aluno.getTurma(102)).setNota(10);
		System.out.println("Aluno " + aluno.getNome() + " com nota -> " + aluno.getNotaDisciplina(materia.getID()));

	}

}