package aplicacao.Usuarios;

import aplicacao.Utilitarios.CursoUniversitario;
import framework.FachadaAluno;

public class FachadaAlunoUniversitario extends FachadaAluno {

	public static IAlunoUniversitario getAluno(int ID) {

		ProfessorUniversitario Professor1 = new ProfessorUniversitario(8, "Fernando Augusto", "fAugusto@gmail.com",
				"Física", 3000, "43899120795", "312370983", 1200, "GruFi");

		ProfessorUniversitario Professor2 = new ProfessorUniversitario(19, "Henrique Pedro", "fAugusto@gmail.com",
				"Física", 3000, "13869130795", "3109376583", 1200, "GruFi");

		CursoUniversitario cursofisica = new CursoUniversitario("Física", Professor1, Professor2,
				"ProjetoPedagogicoFísica");
		
		Materia materia1 = new Materia(1001, 4, "Cálculo 1", "Ementa Cáuculo 1");
		Materia materia2 = new Materia(1203, 4, "Geometria Analítica", "Ementa Geometria Analítica");
		Materia materia3 = new Materia(1090, 4, "Cálculo 2", "Ementa Cáuculo 2");
		Materia materia4 = new Materia(5007, 4, "Probabilidade", "Ementa Probabilidade");
		
		TurmaUniversidade turma1 = new TurmaUniversidade(3, materia1, "02/03/2019", "02/07/2019");
		TurmaUniversidade turma2 = new TurmaUniversidade(4, materia2, "10/03/2019", "05/07/2019");
		TurmaUniversidade turma3 = new TurmaUniversidade(5, materia3, "04/03/2019", "01/07/2019");
		TurmaUniversidade turma4 = new TurmaUniversidade(20, materia4, "09/03/2019", "02/07/2019");
		
		
		turma1.addProfessor(Professor1);
		turma2.addProfessor(Professor2);
		turma3.addProfessor(Professor1);
		turma4.addProfessor(Professor2);
		
		AlunoUniversitario a = null;

		if (ID == 1) {

			GradeUniversitaria gradeJoao = new GradeUniversitaria(cursofisica);

			a = new AlunoUniversitario(1, "João Souza", "joao@gmail.com", gradeJoao, "40293491345", "441216549",
					"13/11/1995", 17560, "Rua Araguaia, 340");
			
			
			NotaDisciplinaUniversitaria notaT1 = new NotaDisciplinaUniversitaria(a, turma1.getDisciplina(), 0);
			NotaDisciplinaUniversitaria notaT2 = new NotaDisciplinaUniversitaria(a, turma2.getDisciplina(), 0);
			NotaDisciplinaUniversitaria notaT3 = new NotaDisciplinaUniversitaria(a, turma3.getDisciplina(), 0);
			NotaDisciplinaUniversitaria notaT4 = new NotaDisciplinaUniversitaria(a, turma4.getDisciplina(), 0);
			
			
			a.addTurma(turma1, notaT1);
			a.addTurma(turma2, notaT2);
			a.addTurma(turma3, notaT3);
			a.addTurma(turma4, notaT4);
			
		} else if(ID == 2) {
			
			ProfessorUniversitario professor = new ProfessorUniversitario(1, "Valter", "valter@dc.ufscar.br", "POO",
					70000.0, "45299784415", "3946215745", 30000.0, "Programação");

			CursoUniversitario cursobcc = new CursoUniversitario("BCC", professor, professor, "Super Projeto Pedagogico");

			a = new AlunoUniversitario(1, "Gabriel", "gtnardy@gmail.com", new GradeUniversitaria(cursobcc), "45299418863",
					"2948754618", "strng", 20000, "Rua 1");

			Materia materia = new Materia(1, 4, "POOA", "Grande Ementa");

			TurmaUniversidade turma = new TurmaUniversidade(102, materia, "", "");
			turma.setDisciplina(materia);
			turma.addAluno(a);
			turma.addProfessor(professor);

			OfertaUniversitaria oferta = new OfertaUniversitaria(1);
			oferta.addTurma(turma);

			NotaDisciplinaUniversitaria nota = new NotaDisciplinaUniversitaria(a, materia, 0);
			a.addTurma(turma, nota);
		}

		return a;
	}
}
