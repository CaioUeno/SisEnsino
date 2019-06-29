package framework;

public abstract class SalaHorario {

	private String sala, horario;

	public SalaHorario(String sala, String horario) {
		this.sala = sala;
		this.horario = horario;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String toString() {
		return "Sala: " + this.getSala() + ", Horário: " + this.getHorario();
	}

}
