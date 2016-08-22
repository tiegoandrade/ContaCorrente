package tiegoandrade.github.banco;

/**
 * Classe que possui funções para manipular dinheiro em uma conta bancária.
 * 
 * @version 1.0 05-06-2016
 * @author Tiego
 *
 */
public class MetodosCaixaEletronico {

	/** Atributo que identifica o número da conta do cliente. */
	private int numConta;

	/** Atributo que identifica o cpf do cliente */
	private int cpf;

	/** Atributo que identifica se a conta bancária está ativa ou não. */
	private boolean ativa;

	/** Atributo que identifica o saldo da conta de um determinado cliente. */
	private double saldo;

	/**
	 * Método que retira dinheiro de uma conta
	 * 
	 * @param valor O valor a ser sacado.
	 */
	public void sacar(double valor) {
		saldo = saldo - valor;
	}

	/**
	 * Método que deposita dinheiro de uma conta.
	 * 
	 * @param valor O valor depositado.
	 */
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	/**
	 * Método que transfere dinheiro de uma conta para outra.
	 * 
	 * @param valor O valor a ser transferido para a outra conta.
	 * @param contaDestino Conta que irá receber o dinheiro transferido.
	 */
	public void transferir(double valor, MetodosCaixaEletronico contaDestino) { 
		sacar(valor);
		contaDestino.depositar(valor);
	}
	
	/**
	 * Atribui o Número da conta de uma determinada conta bancária.
	 * 
	 * @param numConta O número da conta.
	 */
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	/**
	 * Atribui o CPF do dono de uma conta bancária.
	 * 
	 * @param cpf O CPF do dono da conta.
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Informa se a conta está ativa ou não.
	 * 
	 * @param ativa Informação se a conta está ativa ou não.
	 */
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	/**
	 * Resgata o número da conta de determinada pessoa.
	 * 
	 * @return Número da Conta.
	 */
	public int getNumConta() {
		return numConta;
	}
	
	/**
	 * Resgata o CPF do dono de determinada conta bancária.
	 * 
	 * @return CPF do dono da conta bancária.
	 */
	public int getCpf() {
		return cpf;
	}
	
	/**
	 * Informa se a conta está ativa ou nao.
	 * 
	 * @return Falso ou Verdadeiro caso a conta está ativa.
	 */
	public boolean isAtiva() {
		return ativa;
	}
	
	/**
	 * Recupera o saldo de determina conta bancária.
	 * 
	 * @return A quantidade de dinheiro que tem em uma conta bancária.
	 */
	public double getSaldo() {
		return saldo;
	}
}
