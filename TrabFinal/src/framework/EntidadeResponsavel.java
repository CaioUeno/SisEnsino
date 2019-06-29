package framework;

import java.util.ArrayList;
import java.util.List;

public abstract class EntidadeResponsavel {

	private String sigla, nome, area;
	protected List<Professor> professores = new ArrayList<Professor>();
	private Professor profResponsavel;
	private List<Curso> cursos = new ArrayList<Curso>();

	public EntidadeResponsavel(String sigla, String nome, String area, Professor profResponsavel) {
		this.sigla = sigla;
		this.nome = nome;
		this.area = area;
		this.profResponsavel = profResponsavel;
	}

	public void addCurso(Curso curso) {
		this.cursos.add(curso);
	}

	public void removeCurso(Curso curso) {
		this.cursos.remove(curso);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void addProfessor(Professor professor) {
		this.professores.add(professor);
	}

	public void removeProfessor(Professor professor) {
		this.professores.remove(professor);
	}

	public Professor getProfResponsavel() {
		return profResponsavel;
	}

	public void setProfResponsavel(Professor profResponsavel) {
		this.profResponsavel = profResponsavel;
	}
}
