package br.com.fametro.dsw.servicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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
		pa.setImc(calcularImc(Float.parseFloat(mapper.get("peso")), Float.parseFloat(mapper.get("altura"))));
		pa.setGenero(mapper.get("genero"));
		pa.setEmail(mapper.get("email"));
		pa.setCpf(mapper.get("cpf"));
		pa.setSenha(mapper.get("senha"));
		pa.setNome(mapper.get("nome"));
				
		return paDao.inserir(pa);
	}
	
	public static List<Paciente> buscarPaciente(String pesquisa) throws ClassNotFoundException, ParseException{
		PacienteDAO paDAO = new PacienteDAO();
		List paRes = paDAO.buscar(pesquisa);
		
		if(paRes != null){
			return paRes;
		}
		
		return null;
	}
	
	public static Float calcularImc(Float peso, Float altura){
		Float imc = peso / (altura*altura);
				
		return imc;
	}
	
	public static String calcularIdadeBiologica(HashMap<String, Integer> map, int idadeCrono){
		float resultadoIdade = 0;
		for(int i = 1;i <= 13;i++){
			int radio = map.get("radio"+i);
			resultadoIdade = resultadoIdade + (radio);
			System.out.println("Valor " + i + " : " + resultadoIdade);
		}
		
		resultadoIdade = idadeCrono + (resultadoIdade/10);
		
		return Float.toString(resultadoIdade);
	}
}
