
public class CriaConta {

	public static void main(String[] args) {
		
		//1º Bank account
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta tem :" + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta tem :" + primeiraConta.saldo);
		
		//2º Bank account
		Conta segundaConta = new Conta();
		segundaConta.saldo = 500;
	}

}
