package banco;

public class Aplicacao {

	public static void main(String[] args) {
		
		MetodosCaixaEletronico c1 = new MetodosCaixaEletronico(); // Cria��o de um objeto que se refere a uma conta1.
		MetodosCaixaEletronico c2 = new MetodosCaixaEletronico(); // Cria��o de um objeto que se refere a uma conta2.
		
		c1.numConta = 1234; // atribui��o de um n�mero de conta para o objeto c1
		c2.numConta = 3578; // atribui��o de um n�mero de conta para o objeto c2
		c1.depositar(1000); // execu��o do m�todo que deposita dinheiro em uma conta
		c1.depositar(200); // execu��o do m�todo que deposita dinheiro em uma conta
		c1.sacar(50); // execu��o do m�todo que retira dinheiro de uma conta.
		
		c1.transferir(500, c2); // execu��o de um m�todo que transfere dinheiro de uma conta a outra.
		
		double saldo1 = c1.saldo; // atribui��o do atributo do objeto c1 para uma vari�vel saldo1
		double saldo2 = c2.saldo; // atribui��o do atributo do objeto c2 para uma vari�vel saldo2
		
		System.out.println(saldo1); // sa�da mostrando o saldo da primeira conta.
		System.out.println(saldo2); // a�da mostrando o saldo da segunda conta.
	}

}
