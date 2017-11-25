package br.com.fametro.dsw.servicos;

import java.util.HashMap;

import br.com.fametro.dsw.dao.QuestionarioDAO;
import br.com.fametro.dsw.modelo.Paciente;

public class QuestionarioServico {
	public static Paciente inserirQuestionario(int idCliente, HashMap<String, Integer> map) throws ClassNotFoundException{
		QuestionarioDAO qDAO = new QuestionarioDAO();
				
		return qDAO.inserirQuestionario(idCliente, map);
	} 

}
