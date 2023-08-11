
public class main {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.agencia = "3345";
		c1.numero = 999999999;
		c1.titular = "Renato Luiz";
		c1.dataAbertura = "19/04/2004";
		c1.saldo = 100;

		c2.agencia = "22323";
		c2.numero = 999999999;
		c2.titular = "Luiz Nerd";
		c2.dataAbertura = "12/02/2009";
		c2.saldo = 200;
		
		c1.imprimirDadosBancarios();
		c2.imprimirDadosBancarios();

		


	}

}
