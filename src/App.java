public class App {
    public static void main(String[] args) throws Exception {
       
        Cliente lucas = new Cliente();
		lucas.setNome("Lucas");
		
		Conta cc = new ContaCorrente(lucas);
		Conta poupanca = new ContaPoupanca(lucas);

		cc.depositar(1000);
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
