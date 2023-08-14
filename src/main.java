
public class main {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		Data data = new Data();

		
		c1.setDataAbertura(18, 12, 1992);
		c1.setAgencia("3345");
		c1.setNumero(999999999);
		c1.setTitular("Renato Luiz");
		c1.setSaldo(100);

		c1.setDepositar(440);
		c1.getSacar(200);
		
		String result = c1.getImprimirDadosBancarios();
		System.out.println(result);
		
	

		


	}

}
