package aplicacao.Usuarios;

import aplicacao.Utilitarios.CursoUniversitario;
import framework.FachadaGrade;

public class FachadaGradeUniversitaria extends FachadaGrade {

	public static IGradeUniversitaria getGrade(int ID) {
		// Lógica de bnaco de dados através do ID...
		ProfessorUniversitario Professor2 = new ProfessorUniversitario(12, "Antônio Silva", "AntonioS@gmail.com",
				"Computação", 3000, "43899120795", "312370983", 1200, "Midas");

		ProfessorUniversitario Professor1 = new ProfessorUniversitario(18, "Fernando Augusto", "fAugusto@gmail.com",
				"Computação", 3000, "43899120795", "312370983", 1200, "GRupC");

		CursoUniversitario bcc = new CursoUniversitario("Ciêcia da Computação", Professor1, Professor2,
				"Projeto Pedagógico BCC");

		GradeUniversitaria grade = new GradeUniversitaria(bcc);

		Materia logica = new Materia(20, 4, "Introdução à lógica", "Ementa...");
		Materia cal = new Materia(20, 4, "Cálculo 1", "Ementa...");
		Materia cap = new Materia(20, 4, "Construção de Algoritmos e Programação", "Ementa...");
		Materia pc = new Materia(20, 4, "Programação de Computadores", "Ementa...");

		grade.addDisciplina(logica);
		grade.addDisciplina(cal);
		grade.addDisciplina(cap);
		grade.addDisciplina(pc);

		AlunoUniversitario aluno = new AlunoUniversitario(132, "Jorge A.", "jorgeA@hotmail.com", grade, "78632198076",
				"886591025", "09/04/1994", 16540, "Rua Antonio Alberto, 432");

		NotaDisciplinaUniversitaria notaT1 = new NotaDisciplinaUniversitaria(aluno, logica, 0);
		NotaDisciplinaUniversitaria notaT2 = new NotaDisciplinaUniversitaria(aluno, cal, 0);
		NotaDisciplinaUniversitaria notaT3 = new NotaDisciplinaUniversitaria(aluno, cap, 0);
		NotaDisciplinaUniversitaria notaT4 = new NotaDisciplinaUniversitaria(aluno, pc, 0);

		TurmaUniversidade t1 = new TurmaUniversidade(10, logica, "28/03/2019", "28/07/2019");
		TurmaUniversidade t2 = new TurmaUniversidade(12, cal, "28/03/2019", "28/07/2019");
		TurmaUniversidade t3 = new TurmaUniversidade(29, cap, "28/03/2019", "28/07/2019");
		TurmaUniversidade t4 = new TurmaUniversidade(0, pc, "28/03/2019", "28/07/2019");

		aluno.addTurma(t1, notaT1);
		aluno.addTurma(t2, notaT2);
		aluno.addTurma(t3, notaT3);
		aluno.addTurma(t4, notaT4);

		notaT1.setNota(2); // Lógica
		notaT2.setNota(6); // Cálculo 1
		notaT3.setNota(10); // CAP
		notaT4.setNota(1); // PC


		return grade;

	}
}
