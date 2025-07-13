import java.util.Scanner; 
public class Exerc1 {
    public static void main (String[] args){
        // Fazer programa base de falar nome, idade, sala e escola
        // Depois imprimir tudo.
        Scanner scanner = new Scanner(System.in); 
     
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Ótimo! Agora digite a sua idade: ");
        int idade = scanner.nextInt(); 
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Agora digite a sua sala (apenas uma letra): ");
        char sala = scanner.nextLine().charAt(0); 

        System.out.println("Digite o nome da sua Escola: ");
        String nomeScola = scanner.nextLine(); 

        System.out.println("\n--- DADOS INSERIDOS ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sala: " + sala);
        System.out.println("Escola: " + nomeScola);
    }
}
