package br.com.fametro.dsw.servicos;

import java.util.HashMap;

import br.com.fametro.dsw.dao.LoginDAO;
import br.com.fametro.dsw.modelo.Paciente;
import br.com.fametro.dsw.modelo.Usuario;

public class LoginService {
	public static HashMap<String, String> buscarUsuario(String usuario, String senha) throws ClassNotFoundException {
		Paciente paRes = LoginDAO.buscarPaciente(usuario, senha);
		Usuario paUsr = LoginDAO.buscarUsuario(usuario, senha);
		
		if(paRes != null){
			HashMap<String, String> map = new HashMap<String, String>();			
			map.put("id", Integer.toString(paRes.getIdCliente()));
			map.put("nome", paRes.getNome());
			map.put("imc", Float.toString(paRes.getImc()));
			map.put("idadeCrono", (paRes.getIdadeCronologica() == null) ? "-" :  paRes.getIdadeCronologica());
			map.put("idadeBio", (paRes.getIdadeBiologica() == null) ? "-" :  paRes.getIdadeBiologica());
			map.put("tipo", "paciente");
					
			return map;
		}
		
		if(paUsr != null){
			HashMap<String, String> map = new HashMap<String, String>();			
			map.put("id", Integer.toString(paUsr.getIdUsuario()));
			map.put("nome", paUsr.getLogin());
			map.put("imc", "-");
			map.put("idadeCrono", "-");
			map.put("idadeBio", "-");
			map.put("tipo", "admin");
					
			return map;
		}
		
		return null;
	}
}
