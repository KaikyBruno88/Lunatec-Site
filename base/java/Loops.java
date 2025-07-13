public class Loops {
    public static void main(String[] args) {
     // O while loop loops através de um bloco de código, desde que uma condição especificada é true

     //No exemplo abaixo, o código no loop será executado, repetidas vezes, desde que uma variável (i) é menor que 5
     
     int i = 0; 
     while (i < 5){
        System.out.println(i);
        i++; 

        // Usams I como um indicie para a conta. 


// Exemplo de Contagem Regressiva
        
/*int countdown = 3; 
while (countdown > 0 ){
    System.out.println(countdown);
    countdown--; 
}*/


// O Do/While Loop 
/*O do/while loop é uma variante do while loop. 
Este loop irá executar o bloco de código uma vezantes de verificar se a condição é verdadeira. 
Então ele vai repita o loop enquanto a condição for verdadeira. */


/*int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
*/



// Quando você sabe exatamente quantas vezes você quer percorrer um bloco de código, 
//use o for loop em vez de um while loop.

// for (statement 1; statement 2; statement 3) {
  // code block to be executed

  for (int a = 0; a <= 10; a = a + 2) {
  System.out.println(a);
}
}
     }
    }
 
