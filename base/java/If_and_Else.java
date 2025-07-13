public class If_and_Else {
    public static void main (String [] args){
        int condition = 3; 
        /*
         * ocê já sabe que Java suporta as condições lógicas usuais da matemática:

Menos do que: a < b
Menor ou igual a: a <= b
Maior que: a > b
Maior ou igual a: a >= b
Igual a a == b
Não é igual a: a!= b
         */

         /*
          * Java tem as seguintes instruções condicionais:

Usar if para especificar um bloco de código a ser executado, se uma condição especificada for verdadeira
Usar else para especificar um bloco de código a ser executado, se a mesma condição for falsa
Usar else if para especificar uma nova condição a ser testada, se a primeira condição for falsa
Usar switch para especificar muitos blocos alternativos de código a serem executados


          */

          if (condition <= 54) {
System.out.println("Sim, aconteceu algo aqui.");
  // block of code to be executed if the condition is true
}else {
    System.out.println("Aconteceu algo aqui também");
}
    /*if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
*/ 
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."

int time2 = 14; 
if (time2 > 13) {
    System.out.println("Bom dia");
}else if (time2 < 17){
    System.out.println("Boa Noite");
}else{
    System.out.println("Boa Madrugada");
}

    }
}
