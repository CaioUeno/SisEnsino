package CasosdeUso;

import aplicacao.Usuarios.FachadaGradeUniversitaria;
import aplicacao.Usuarios.IGradeUniversitaria;

public class ImprimeGrade {

	public static void main(String[] args) {
		
		//id do aluno para buscar a grade
		int id = 10;
		IGradeUniversitaria grade = FachadaGradeUniversitaria.getGrade(id);
		
		
		//ALUNO GERA HISTÓRICO
		grade.gerarHistorico();
		

		

	}

}
