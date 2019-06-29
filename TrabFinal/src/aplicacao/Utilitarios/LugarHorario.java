package aplicacao.Utilitarios;

import framework.SalaHorario;

public class LugarHorario extends SalaHorario {

	private String at;

	public LugarHorario(String sala, String horario, String at) {
		super(sala, horario);
		this.at = at;
	}

	public String getAt() {
		return at;
	}

	public void setAt(String at) {
		this.at = at;
	}

}
