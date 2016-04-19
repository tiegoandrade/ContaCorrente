package banco;

public class MetodosCaixaEletronico {
	
	int numConta;
	double saldo;
	
	void sacar (double valor){ //Método que retira dinheiro de uma conta
		saldo = saldo - valor;
	}
	
	void depositar (double valor){ //Método que deposita dinheiro de uma conta.
		saldo = saldo + valor;
	}
	
	void transferir (double valor, MetodosCaixaEletronico contaDestino){ //Método que transfere dinheiro de uma conta para outra
		sacar(valor);
		contaDestino.depositar(valor);
	}
}
