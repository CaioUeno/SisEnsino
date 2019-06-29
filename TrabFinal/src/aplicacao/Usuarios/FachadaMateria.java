package aplicacao.Usuarios;

import framework.FachadaDisciplina;

public class FachadaMateria extends FachadaDisciplina {

	public static IMateria getMateria(int ID) {
		Materia materia = new Materia(1, 4, "POOA", "Grande Ementa");
		return materia;
	}
}
