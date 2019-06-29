package aplicacao.Entidades;

import aplicacao.Usuarios.ProfessorUniversitario;
import aplicacao.Utilitarios.CursoUniversitario;
import framework.FachadaEntidadeResponsavel;

public class FachadaDepartamento extends FachadaEntidadeResponsavel {
	public static IDepartamento getDepartamento(int ID) {

		// Lógica de buscar o departamento no banco com o ID
		ProfessorUniversitario profR = new ProfessorUniversitario(12, "Antônio Silva", "AntonioS@gmail.com",
				"Computação", 3000, "43899120795", "312370983", 1200, "Midas");

		ProfessorUniversitario Professor1 = new ProfessorUniversitario(18, "Fernando Augusto", "fAugusto@gmail.com",
				"Computação", 3000, "43899120795", "312370983", 1200, "GRupC");

		Departamento dep = new Departamento("DC", "Departamento de Computação", "Ciências Exatas", profR);

		CursoUniversitario bcc = new CursoUniversitario("BCC", Professor1, profR, "ProjetoPedagogicoBCC");

		dep.addCurso(bcc);

		dep.addProfessor(Professor1);
		dep.addProfessor(profR);
		
		return dep;
	}
}
