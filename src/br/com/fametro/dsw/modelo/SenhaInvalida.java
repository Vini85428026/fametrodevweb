package br.com.fametro.dsw.modelo;

public class SenhaInvalida extends Exception {
	
	private static final long serialVersionUID = 1L ;
	
	public SenhaInvalida() {
		super("A senha n�o confere!") ;
	}

}
