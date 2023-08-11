
public class main {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		Data data = new Data();

		
		c1.setDataAbertura(18, 12, 1992);
		c1.agencia = "3345";
		c1.numero = 999999999;
		c1.titular = "Renato Luiz";
		c1.saldo = 100;
		
		String result = c1.imprimirDadosBancarios();
		System.out.println(result);
		
	

		


	}

}
