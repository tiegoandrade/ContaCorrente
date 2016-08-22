package tiegoandrade.github.banco;

/**
 * Classe que possui fun��es para manipular dinheiro em uma conta banc�ria.
 * 
 * @version 1.0 05-06-2016
 * @author Tiego
 *
 */
public class MetodosCaixaEletronico {

	/** Atributo que identifica o n�mero da conta do cliente. */
	private int numConta;

	/** Atributo que identifica o cpf do cliente */
	private int cpf;

	/** Atributo que identifica se a conta banc�ria est� ativa ou n�o. */
	private boolean ativa;

	/** Atributo que identifica o saldo da conta de um determinado cliente. */
	private double saldo;

	/**
	 * M�todo que retira dinheiro de uma conta
	 * 
	 * @param valor O valor a ser sacado.
	 */
	public void sacar(double valor) {
		saldo = saldo - valor;
	}

	/**
	 * M�todo que deposita dinheiro de uma conta.
	 * 
	 * @param valor O valor depositado.
	 */
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	/**
	 * M�todo que transfere dinheiro de uma conta para outra.
	 * 
	 * @param valor O valor a ser transferido para a outra conta.
	 * @param contaDestino Conta que ir� receber o dinheiro transferido.
	 */
	public void transferir(double valor, MetodosCaixaEletronico contaDestino) { 
		sacar(valor);
		contaDestino.depositar(valor);
	}
	
	/**
	 * Atribui o N�mero da conta de uma determinada conta banc�ria.
	 * 
	 * @param numConta O n�mero da conta.
	 */
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	/**
	 * Atribui o CPF do dono de uma conta banc�ria.
	 * 
	 * @param cpf O CPF do dono da conta.
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Informa se a conta est� ativa ou n�o.
	 * 
	 * @param ativa Informa��o se a conta est� ativa ou n�o.
	 */
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	/**
	 * Resgata o n�mero da conta de determinada pessoa.
	 * 
	 * @return N�mero da Conta.
	 */
	public int getNumConta() {
		return numConta;
	}
	
	/**
	 * Resgata o CPF do dono de determinada conta banc�ria.
	 * 
	 * @return CPF do dono da conta banc�ria.
	 */
	public int getCpf() {
		return cpf;
	}
	
	/**
	 * Informa se a conta est� ativa ou nao.
	 * 
	 * @return Falso ou Verdadeiro caso a conta est� ativa.
	 */
	public boolean isAtiva() {
		return ativa;
	}
	
	/**
	 * Recupera o saldo de determina conta banc�ria.
	 * 
	 * @return A quantidade de dinheiro que tem em uma conta banc�ria.
	 */
	public double getSaldo() {
		return saldo;
	}
}
