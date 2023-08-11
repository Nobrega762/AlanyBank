
public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	String dataAbertura;

	void sacar(double quantidade) {
		if (quantidade > this.saldo) {
			System.out.println("Saldo insuficiente.");
		} else {
			this.saldo -= quantidade;
			System.out.println("Saque de " + quantidade + " Efeutado com sucesso" + "\nSaldo Atual: " + this.saldo);
		}
	}

	void depositar(double quantidade) {
		this.saldo += quantidade;
		System.out.println("Valor depositado " + quantidade + "\nSaldo atual: " + this.saldo);
	}
	
	void rendimento() {
		this.saldo += this.saldo * 0.1;
		System.out.println("Sua conta rendeu 0.1% e agora você tem: " + this.saldo);
		
	}

	void imprimirDadosBancarios(){
		System.out.println("Titular: " +this.titular+"\nAgencia: " + this.agencia+"\nConta Corrente: " +this.numero+"\nSaldo: "+ this.saldo+ "\nData de Abertura: " +this.dataAbertura);
		rendimento();
	}

}
