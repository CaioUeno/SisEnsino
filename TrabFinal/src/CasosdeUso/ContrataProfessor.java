package CasosdeUso;

import aplicacao.Entidades.FachadaDepartamento;
import aplicacao.Entidades.IDepartamento;
import aplicacao.Usuarios.ProfessorUniversitario;
import framework.Professor;


public class ContrataProfessor {

	public static void main(String[] args) {
		
		IDepartamento dep = FachadaDepartamento.getDepartamento(3);
		
		System.out.println("Professores presentes no departamento: ");
		for(Professor p : dep.getProfessores()) {
			System.out.println("ID : " + p.getID()+ ", " + p.getNome());
		}
		System.out.println();
		//ATÉ AQUI INFOS DO BANCO DE DADOS
		
		//Entrada de Dados
		ProfessorUniversitario Professor2 = new ProfessorUniversitario(6, "Henrique Pedro", "fAugusto@gmail.com", 
				"Computação", 3000, "13869130795", "3109376583", 1200, null);
		
		dep.addProfessor(Professor2);
		System.out.println("Professor " + Professor2.getNome() + " contratado!");
		
		System.out.println();
		
		System.out.println("Professores presentes no departamento: ");
		for(Professor p : dep.getProfessores()) {
			System.out.println("ID : " + p.getID()+ ", " + p.getNome());
		}
		
		
		

	}

}
