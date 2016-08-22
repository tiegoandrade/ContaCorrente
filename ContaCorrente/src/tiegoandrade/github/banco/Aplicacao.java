package tiegoandrade.github.banco;

/**
 * Classe que executa a lógica da aplicação.
 * 
 * @version 1.0 05-06-2016
 * @author Tiego
 *
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		/* Objetos que represetam uma conta bancária. */
		MetodosCaixaEletronico c1 = new MetodosCaixaEletronico(); 
		MetodosCaixaEletronico c2 = new MetodosCaixaEletronico(); 
		
		/* Cliente realiza um depósito em uma determinada conta. */
		c1.depositar(2000);  
		
		/* Cliente realiza uma transferência para uma outra conta. */
		c1.transferir(500, c2); 
		
		/* Recupera o saldo de uma determina conta bancária. */
		double saldo1 = c1.getSaldo(); 
		double saldo2 = c2.getSaldo(); 
		
		/* Apresentação do Saldo para o cliente. */
		System.out.println(saldo1);
		System.out.println(saldo2); 
	}
}
