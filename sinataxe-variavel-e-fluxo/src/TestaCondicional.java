
public class TestaCondicional {
	public static void main(String[] args) {
		// atalho sysout
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoa = 1;
		
		if(idade >= 18) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("ok");
		}
		else {
			if (quantidadePessoa >= 2) {
				System.out.println("vou poder ir");
			} else {
				System.out.println("nao");
			}
			
		}
	}

}
