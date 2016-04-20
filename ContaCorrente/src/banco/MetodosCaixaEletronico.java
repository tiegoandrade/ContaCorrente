package banco;

public class MetodosCaixaEletronico {
	
	private int numConta; //atributo que identifica o n�mero da conta do cliente.
	private int cpf; // atributo que identifica o cpf do cliente
	private boolean ativa; // atributo que identifica se a conta est� ativa ou n�o.
	private double saldo; // atributo que identifica o saldo da conta de um determinado cliente.
	
	public void sacar (double valor){ //M�todo que retira dinheiro de uma conta
		saldo = saldo - valor;
	}
	
	public void depositar (double valor){ //M�todo que deposita dinheiro de uma conta.
		saldo = saldo + valor;
	}
	
	public void transferir (double valor, MetodosCaixaEletronico contaDestino){ //M�todo que transfere dinheiro de uma conta para outra
		sacar(valor);
		contaDestino.depositar(valor);
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public int getNumConta() {
		return numConta;
	}

	public int getCpf() {
		return cpf;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public double getSaldo() {
		return saldo;
	}
}
