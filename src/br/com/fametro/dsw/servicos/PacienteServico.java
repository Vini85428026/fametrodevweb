package br.com.fametro.dsw.servicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import br.com.fametro.dsw.dao.PacienteDAO;
import br.com.fametro.dsw.modelo.Paciente;

public class PacienteServico {

	public static boolean inserirPaciente(HashMap<String, String> mapper) throws ClassNotFoundException, ParseException{
		PacienteDAO paDao = new PacienteDAO();
		Paciente pa = new Paciente();
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
		Date dataNascimento = (Date) formato.parse(mapper.get("dataNasc")); 
		
		pa.setNome(mapper.get("nome"));
		pa.setDataDeNascimento(dataNascimento);
		pa.setPeso(Float.parseFloat(mapper.get("peso")));
		pa.setAltura(Float.parseFloat(mapper.get("altura")));
		pa.setImc(Float.parseFloat(mapper.get("imc")));
		pa.setGenero(mapper.get("genero"));
		pa.setEmail(mapper.get("email"));
		pa.setCpf(mapper.get("cpf"));
		pa.setSenha(mapper.get("senha"));
		pa.setNome(mapper.get("nome"));
				
		return paDao.inserir(pa);
	}
	
	public static HashMap<String, String> buscarPaciente(String pesquisa) throws ClassNotFoundException, ParseException{
		PacienteDAO paDAO = new PacienteDAO();
		Paciente paRes = paDAO.buscar(pesquisa);
		
		if(paRes != null){
			HashMap<String, String> map = new HashMap<String, String>();			
			map.put("nome", paRes.getNome());
			map.put("idadeCrono", (paRes.getIdadeCronologica() == null) ? "-" :  paRes.getIdadeCronologica());
			map.put("idadeBio", (paRes.getIdadeBiologica() == null) ? "-" :  paRes.getIdadeBiologica());
			
			return map;
		}
		
		return null;
	}
}
