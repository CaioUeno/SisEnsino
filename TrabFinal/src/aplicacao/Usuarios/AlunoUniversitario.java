package aplicacao.Usuarios;

import framework.Aluno;
import framework.Grade;
import framework.NotaDisciplina;

public class AlunoUniversitario extends Aluno implements IAlunoUniversitario {

	private String cpf, rg;
	private String dataNasc;
	private int ira;
	private String endereco;

	public AlunoUniversitario(int ID, String nome, String email, Grade grade, String cpf, String rg, String datanasc,
			int ira, String endereco) {
		super(ID, nome, email, grade);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNasc = datanasc;
		this.ira = ira;
		this.endereco = endereco;
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

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public float getIra() {
		return ira;
	}

	public void setIra(int ira) {
		this.ira = ira;
	}

	public int calculaIra() {

		int soma = 0;
		int i = 0;
		for (NotaDisciplina nd : this.notasDisciplinas) {
			soma += nd.getNota();
			i += 1;
		}

		return soma / i;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void updateGrade() {
		for (NotaDisciplina nd : notasDisciplinas) {
			if (nd.getNota() >= 6) {
				this.grade.changeStatusDisciplina(nd.getDisciplina(), nd.getNota());
			}
		}
	}

	public double getNotaDisciplina(int ID) {

		for (NotaDisciplina nd : notasDisciplinas) {
			if (nd.getDisciplina().getID() == ID) {
				return nd.getNota();
			}
		}

		return 0;
	}

}
