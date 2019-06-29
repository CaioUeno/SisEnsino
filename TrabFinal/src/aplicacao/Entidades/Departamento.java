package aplicacao.Entidades;

import framework.EntidadeResponsavel;
import framework.Professor;

class Departamento extends EntidadeResponsavel implements IDepartamento {

	public Departamento(String sigla, String nome, String area, Professor profResponsavel) {
		super(sigla, nome, area, profResponsavel);
	}

}
