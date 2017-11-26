package br.com.fametro.dsw.servicos;

import java.util.HashMap;

import br.com.fametro.dsw.dao.PacienteDAO;
import br.com.fametro.dsw.dao.QuestionarioDAO;
import br.com.fametro.dsw.modelo.Paciente;

public class QuestionarioServico {
	public static Paciente inserirQuestionario(int idCliente, HashMap<String, Integer> map) throws ClassNotFoundException{
		QuestionarioDAO qDAO = new QuestionarioDAO();
		Paciente paciente = new Paciente();
		int idadeCrono = 30;
		int idadeBio = 20;
		
		boolean res = qDAO.inserirQuestionario(idCliente, map, idadeCrono, idadeBio);
				
		if(res){
			Paciente pac = PacienteDAO.buscarPorId(idCliente);
			if(pac != null){
				paciente.setNome(pac.getNome());
				paciente.setIdadeBiologica(Integer.toString(idadeBio));
				paciente.setIdadeCronologica(Integer.toString(idadeCrono));
				
				return paciente;
			}
		}
		
		return null;
	} 

}
