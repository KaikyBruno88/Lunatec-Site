import java.util.Scanner;
public class Exerc4 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    
       System.out.println("Digite um número");
       int numero = scanner.nextInt(); 
       
       
       if (numero == 50){
        System.out.println("Você digitou exatamente 50");
       }else if (numero > 50){
        System.out.println("Você digitou um numero maior que 50");
       }else if (numero < 50){
        System.out.println("Você digitou um numero menor que 50");
       }else {
        System.out.println("ERRO! ");
       }
    }
}
