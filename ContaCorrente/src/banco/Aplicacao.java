package banco;

public class Aplicacao {

	public static void main(String[] args) {
		
		MetodosCaixaEletronico c1 = new MetodosCaixaEletronico(); // Criação de um objeto que se refere a uma conta1.
		MetodosCaixaEletronico c2 = new MetodosCaixaEletronico(); // Criação de um objeto que se refere a uma conta2.
		
		c1.numConta = 1234; // atribuição de um número de conta para o objeto c1
		c2.numConta = 3578; // atribuição de um número de conta para o objeto c2
		c1.depositar(1000); // execução do método que deposita dinheiro em uma conta
		c1.depositar(200); // execução do método que deposita dinheiro em uma conta
		c1.sacar(50); // execução do método que retira dinheiro de uma conta.
		
		c1.transferir(500, c2); // execução de um método que transfere dinheiro de uma conta a outra.
		
		double saldo1 = c1.saldo; // atribuição do atributo do objeto c1 para uma variável saldo1
		double saldo2 = c2.saldo; // atribuição do atributo do objeto c2 para uma variável saldo2
		
		System.out.println(saldo1); // saída mostrando o saldo da primeira conta.
		System.out.println(saldo2); // aída mostrando o saldo da segunda conta.
	}

}
