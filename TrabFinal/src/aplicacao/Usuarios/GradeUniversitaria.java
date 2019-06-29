package aplicacao.Usuarios;

import java.util.HashMap;
import java.util.Map;

import framework.Curso;
import framework.Disciplina;
import framework.Grade;

class GradeUniversitaria extends Grade implements IGradeUniversitaria {

	private Map<Disciplina, Double> historico = new HashMap<Disciplina, Double>();

	public GradeUniversitaria(Curso curso) {
		super(curso);
	}

	public void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
		historico.put(disciplina, (double) 0);
	}

	public void removeDisciplina(Disciplina disciplina) {
		this.disciplinas.remove(disciplina);
		historico.remove(disciplina);
	}

	public void changeStatusDisciplina(Disciplina disciplina, double nota) {
		historico.put(disciplina, nota);
	}

	public void gerarHistorico() {
		for (Map.Entry<Disciplina, Double> pair : historico.entrySet()) {
			System.out.println(pair.getKey().getNome());
			if (pair.getValue() >= 6) {
				System.out.println("Aprovado com : " + pair.getValue());
			} else {
				System.out.println("Reprovado");
			}
			System.out.println();
		}
	}

}
