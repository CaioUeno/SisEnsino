package aplicacao.Usuarios;

import framework.Disciplina;

class Materia extends Disciplina implements IMateria {

	public Materia(int ID, int credito, String nome, String ementa) {
		super(ID, credito, nome, ementa);
	}

}
