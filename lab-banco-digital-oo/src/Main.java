
public class Main {

	public static void main(String[] args) {
		Cliente elis = new Cliente();
		elis.setNome("Elis");
		
		Conta cc = new ContaCorrente(elis);
		Conta poupanca = new ContaPoupanca(elis);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}