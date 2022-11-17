
public class testaMetodo {

	public static void main(String[] args) {
		Conta contaDaBianca = new Conta();
		contaDaBianca.saldo = 100;
		contaDaBianca.deposita(1300);
		System.out.println(contaDaBianca.saldo);

	}

}
