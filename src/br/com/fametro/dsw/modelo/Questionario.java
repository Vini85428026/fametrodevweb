package br.com.fametro.dsw.modelo;

import java.util.Date;

public class Questionario {
	private int idFormulario;
	private String datacriacao;
	private String idadeBiologica;
	private String idadeCronologica;
	private int idCliente;
	public int getIdFormulario() {
		return idFormulario;
	}
	public void setIdFormulario(int idFormulario) {
		this.idFormulario = idFormulario;
	}
	public String getDatacriacao() {
		return datacriacao;
	}
	public void setDatacriacao(String dataCriacao2) {
		this.datacriacao = dataCriacao2;
	}
	public String getIdadeBiologica() {
		return idadeBiologica;
	}
	public void setIdadeBiologica(String idadeBiologica) {
		this.idadeBiologica = idadeBiologica;
	}
	public String getIdadeCronologica() {
		return idadeCronologica;
	}
	public void setIdadeCronologica(String idadeCronologica) {
		this.idadeCronologica = idadeCronologica;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
}
