
public class Main {
;
	public static void main(String[] args) {
		System.out.println("APENAS CADASTRAR ");		
		

        // Arrays SIMPLES - só para testar o cadastro
        String[] nomes = new String[5];
        double[] precos = new double[5];
        int total = 0;

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Vamos cadastrar 3 produtos para testar:");

        // Cadastrar 3 produtos fixos para testar
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Produto " + (i + 1) + " ---");

            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Preço: R$ ");
            precos[i] = scanner.nextDouble();
            scanner.nextLine(); // limpar buffer

            total++;
            System.out.println("Cadastrado: " + nomes[i] + " - R$ " + precos[i]);
        }

        System.out.println("Total cadastrado: " + total + " produtos");
        System.out.println("Próxima fase: adicionar LISTAGEM");
        
        for (int i = 0; i < total; i++) {
            System.out.println("\n--- Produto " + (i + 1) + " - " + nomes[i] +" - " +  precos[i]);
            }


        scanner.close();

	}

}
