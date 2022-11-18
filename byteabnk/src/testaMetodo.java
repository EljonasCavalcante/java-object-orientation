
public class testaMetodo {

	public static void main(String[] args) {
		Conta contaDaBianca = new Conta();
		contaDaBianca.saldo = 100;
		contaDaBianca.depositar(1300);
		System.out.println(contaDaBianca.saldo);
		
		boolean conseguiuRetirar = contaDaBianca.sacar(100);
		System.out.println(contaDaBianca.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoJonas = new Conta();
		contaDoJonas.depositar(2000);
		
		contaDoJonas.transferir(300,contaDaBianca);
		System.out.println(contaDoJonas.saldo);
		System.out.println(contaDoJonas);
	}

}
