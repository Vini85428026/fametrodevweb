package br.com.fametro.dsw.servicos;

import java.text.ParseException;
import java.util.Calendar;
import java.util.HashMap;

import br.com.fametro.dsw.dao.PacienteDAO;
import br.com.fametro.dsw.dao.QuestionarioDAO;
import br.com.fametro.dsw.modelo.Paciente;

public class QuestionarioServico {
	public static Paciente inserirQuestionario(int idCliente, HashMap<String, Integer> map) throws ClassNotFoundException, ParseException{
		QuestionarioDAO qDAO = new QuestionarioDAO();
		Paciente paciente = new Paciente();
		Paciente pac = PacienteDAO.buscarPorId(idCliente);
		
		if(pac != null){
			// tratar para pegar idade atual do paciente
			Calendar calPaciente = Calendar.getInstance();
			calPaciente.setTime(pac.getDataDeNascimento());
			
			int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
			int anoPaciente = calPaciente.get(Calendar.YEAR);
			int idadeCrono = anoAtual - anoPaciente;
			
			String idadeBio = PacienteServico.calcularIdadeBiologica(map, idadeCrono);
			boolean res = qDAO.inserirQuestionario(idCliente, map, idadeCrono, idadeBio);
			if(res){
				paciente.setNome(pac.getNome());
				paciente.setIdadeBiologica(idadeBio);
				paciente.setIdadeCronologica(Integer.toString(idadeCrono));
				
				return paciente;
			}
		}
		
		return null;
	} 

}
