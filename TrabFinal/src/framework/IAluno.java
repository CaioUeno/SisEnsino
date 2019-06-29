package framework;

import java.util.List;

public interface IAluno {

	public List<Turma> getTurmas();

	public void removeTurma(int ID);

	public Turma getTurma(int ID);

	public String getNome();

	public double getNotaDisciplina(int ID);

	public NotaDisciplina getnotaT(Turma turma);

	public List<NotaDisciplina> getNotasTurmas();
}
