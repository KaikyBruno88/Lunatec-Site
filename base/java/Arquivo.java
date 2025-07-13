public class Arquivo{
    public static void main (String[] args ){ 
   /* String - armazena texto, como "Olá". Os valores de string são cercado por citações duplas
    int armazena inteiros (números inteiros), sem decimais, como 123 ou - 123
    float armazena números de ponto flutuante, com decimais, como 19,99 ou - 19,99
    char armazena caracteres únicos, como 'a' ou 'B'. Os valores de char são cercados por aspas simples
    boolean armazena valores com dois estados: verdadeiro ou falso*/

    String name = "Jonha"; 
    System.out.println("Olá caro senhor " + name);
    int number = 14; 
    int x = 3, y = 4, z = 5; 
    System.out.println("Você tem " + number + " anos");
    System.out.println(x + y + z + " Isso aqui é o resultado da some entre 3 + 4 + 5, sabia? ");

   /*  int myNum = 5;               // Integer (whole number)
    float myFloatNum = 5.99f;    // Floating point number
    char myLetter = 'D';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String* */ 
    byte myNum = 100;
    System.out.println(myNum); 
    float myNumFloat = 5.75f;
    System.out.println(myNumFloat);
    
    boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false

//O char o tipo de dados é usado para armazenar um único personagem. O personagem deve ser cercado por citações simples, como 'A' ou 'c':
char myGrade = 'B';
System.out.println(myGrade);


//Ampliando a Fundição
//A ampliação da fundição é feita automaticamente ao passar um tipo de tamanho menor para um tipo de tamanho maior:
  
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
   
//Fundição Estreita
//A fundição estreita deve ser feita manualmente, colocando o tipo entre parênteses () em frente ao valor:
 
    double myDouble2 = 9.78d;
    int myInt2 = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble2);   // Outputs 9.78
    System.out.println(myInt2);      // Outputs 9
  
    
    /*Aqui está um exemplo da vida real do tipo casting onde criamos um programa para calcule a porcentagem da pontuação de um usuário em relação à pontuação máxima em um jogo.

Usamos o tipo de fundição para garantir que o resultado seja um ponto flutuante valor, em vez de um inteiro:

 */
int maxScore = 500;

// The actual score of the user
int userScore = 423;

/* Calculate the percentage of the user's score in relation to the maximum available score.
Convert userScore to float to make sure that the division is accurate */
float percentage = (float) userScore / maxScore * 100.0f;

System.out.println("User's percentage is " + percentage);
/*Operadores Lógicos Java
Você também pode testar para true ou false valores com operadores lógicos.

Operadores lógicos são usados para determinar a lógica entre variáveis ou valores: */

//&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
//|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
//!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

 String greenting = "Pedro"; 
            //varivel do tipo Escrita
            System.out.println("O comprimento dessa String é de: " + greenting.length());
            //Quantas letra tem a String 1
            System.out.println(greenting.toUpperCase());
            System.out.println(greenting.toLowerCase());
            String aluno = "Julia"; 

            System.out.println(greenting.concat(aluno));
            //Concatecação com 2 Strings diferentes 

    }
}