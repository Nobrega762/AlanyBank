
public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void setDataAbertura(int dia, int mes, int ano){
		Data data = new Data();
		dataAbertura = data.dataFormat(dia,mes,ano);

	}
	
	public void getSacar(double quantidade) {
		if (quantidade > this.saldo) {
			System.out.println("Saldo insuficiente.");
		} else {
			this.saldo -= quantidade;
			System.out.println("Saque de " + quantidade + " Efeutado com sucesso" + "\nSaldo Atual: " + this.saldo);
		}
	}

	public void setDepositar(double quantidade) {
		this.saldo += quantidade;
		System.out.println("Valor depositado " + quantidade + "\nSaldo atual: " + this.saldo);
	}
	
	public double getRendimento() {
		this.saldo += this.saldo * 0.1;
		return this.saldo;
		
	}

	String getImprimirDadosBancarios(){
		
		String dados = "Data de Abertura da Conta: "+getDataAbertura() + "\nTitular: " +getTitular()+"\nAgencia: " + getAgencia()+"\nConta Corrente: " +getNumero()+"\nSaldo: "+ getSaldo() + "\nRendimento: " +getRendimento();
		
		return dados;
		
	}

}
