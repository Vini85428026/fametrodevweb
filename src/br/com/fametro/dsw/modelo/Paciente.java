package br.com.fametro.dsw.modelo;

import java.util.Date;

public class Paciente {
	private int idCliente;
	private String nome;
	private Date dataDeNascimento;
	private float peso;
	private float altura;
	private float imc;
	private String genero;
	private String email;
	private String cpf;
	private String senha;
	private String idadeBiologica;
	private String idadeCronologica;
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
	
	
}
