package aplicacao.Utilitarios;

import aplicacao.Usuarios.ProfessorUniversitario;
import framework.Curso;

public class CursoUniversitario extends Curso {

	private ProfessorUniversitario coordenador;
	private ProfessorUniversitario viceCoordenador;
	private String projPedag;

	public CursoUniversitario(String nome, ProfessorUniversitario coordenador, ProfessorUniversitario viceCoordenador,
			String projPedag) {
		super(nome);
		this.coordenador = coordenador;
		this.viceCoordenador = viceCoordenador;
		this.projPedag = projPedag;
	}

	public ProfessorUniversitario getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(ProfessorUniversitario coordenador) {
		this.coordenador = coordenador;
	}

	public ProfessorUniversitario getViceCoordenador() {
		return viceCoordenador;
	}

	public void setViceCoordenador(ProfessorUniversitario viceCoordenador) {
		this.viceCoordenador = viceCoordenador;
	}

	public String getProjPedag() {
		return projPedag;
	}

	public void setProjPedag(String projPedag) {
		this.projPedag = projPedag;
	}

}
