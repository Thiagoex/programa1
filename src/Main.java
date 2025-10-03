import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("APENAS CADASTRAR ");		
		

        // Arrays SIMPLES - só para testar o cadastro
        String[] nomes = new String[5];
        double[] precos = new double[5];
                int total = 0;

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Vamos cadastrar 3 produtos para testar:");

        // Cadastrar 3 produtos fixos para testar
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Produto " + (i + 1) + " ---");

            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Preco: R$ ");
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
        try{
        	// obtendo posição 
        	System.out.println("Digite a posição (0 a 4) que deseja atualizar: ");
        	int posicao = scanner.nextInt();
	        //obtem o novo valor
	        if (posicao >=0 && posicao <= total){
	
	            System.out.println("qual o novo valor para a posicao, ponei" + posicao + ":");
	            int novoValor = scanner.nextInt();
	            //atualiza o array
	            precos[posicao] = novoValor;
	            //
	            System.out.println("Array atualizado:" + Arrays.toString(precos));
	        } else{
		            System.out.println("Erro: ponei digitou entrada invalida");
			
		    }
	        scanner.close();
        }catch(Exception e) {
        	 System.out.println(e.getMessage());
        }
		       
		          
	        	

	}

}

      

	


