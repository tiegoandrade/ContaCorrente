package banco;

public class Aplicacao {

	public static void main(String[] args) {
		
		MetodosCaixaEletronico c1 = new MetodosCaixaEletronico(); // Cria��o de um objeto que se refere a uma conta1.
		MetodosCaixaEletronico c2 = new MetodosCaixaEletronico(); // Cria��o de um objeto que se refere a uma conta2.
		
		c1.depositar(2000); // Cliente realiza um dep�sito em uma determinada conta.
		c1.transferir(500, c2); // Cliente realiza uma transfer�ncia para uma outra conta.
		
		double saldo1 = c1.getSaldo(); // atribui��o do atributo do objeto c1 para uma vari�vel saldo1
		double saldo2 = c2.getSaldo(); // atribui��o do atributo do objeto c2 para uma vari�vel saldo2
		
		System.out.println(saldo1); // sa�da mostrando o saldo da primeira conta.
		System.out.println(saldo2); // a�da mostrando o saldo da segunda conta.
	}

}
