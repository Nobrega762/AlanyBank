package br.com.caelum.alanybank.main;

import br.com.caelum.alanybank.modelo.Conta;
import br.com.caelum.alanybank.modelo.Data;

public class main {

	public static void main(String[] args) {
		Conta c1 = new Conta("Renato Nobrega",123456,0);
		
		Data data = new Data();

		

		c1.setDataAbertura(18, 12, 1992);
		
		c1.setDepositar(440);
		c1.getSacar(200);
		
		String result = c1.getImprimirDadosBancarios();
		System.out.println(result);
		
	

		


	}

}
