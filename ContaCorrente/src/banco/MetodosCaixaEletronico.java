package banco;

public class MetodosCaixaEletronico {
	
	int numConta;
	double saldo;
	
	void sacar (double valor){ //M�todo que retira dinheiro de uma conta
		saldo = saldo - valor;
	}
	
	void depositar (double valor){ //M�todo que deposita dinheiro de uma conta.
		saldo = saldo + valor;
	}
	
	void transferir (double valor, MetodosCaixaEletronico contaDestino){ //M�todo que transfere dinheiro de uma conta para outra
		sacar(valor);
		contaDestino.depositar(valor);
	}
}
