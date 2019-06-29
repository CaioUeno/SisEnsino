package aplicacao.Usuarios;

import framework.Professor;

public class ProfessorUniversitario extends Professor {

	private double salariobase;
	private String cpf, rg;
	private double bonus;
	private String grupoPesquisa;

	public ProfessorUniversitario(int ID, String nome, String email, String areaFormacao, double d, String cpf,
			String rg, double e, String grupoPesquisa) {
		super(ID, nome, email, areaFormacao);
		this.salariobase = d;
		this.cpf = cpf;
		this.rg = rg;
		this.bonus = e;
		this.grupoPesquisa = grupoPesquisa;
	}

	public double getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(float salariobase) {
		this.salariobase = salariobase;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public String getGrupoPesquisa() {
		return grupoPesquisa;
	}

	public void setGrupoPesquisa(String grupoPesquisa) {
		this.grupoPesquisa = grupoPesquisa;
	}

}
