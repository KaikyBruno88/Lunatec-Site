public class Match {
    public static void main (String [] args ){
    double numero = 9.0;

        double raizQuadrada = Math.sqrt(numero);
        double potencia = Math.pow(numero, 2);
        double seno = Math.sin(Math.toRadians(30)); // Convertendo graus para radianos

        System.out.println("Raiz quadrada: " + raizQuadrada);
        System.out.println("Potência: " + potencia);
        System.out.println("Seno de 30 graus: " + seno);

        Math.max(3, 68); 
        Math.min(4, 34); 
        //Valores para Seno e Cons par amaximos e minimos 

        //O método retorna a raiz quadrada de x:Math.sqrt(x)
        Math.sqrt(64);

        //O método retorna o valor absoluto (positivo) de x:Math.abs(x)
        Math.abs(-4.7);

        //Math.random()retorna um número aleatório entre 0,0 (inclusive) e 1,0 (exclusive):
        Math.random();

        //Para obter mais controle sobre o número aleatório, por exemplo, 
        //se você quiser apenas um número aleatório número entre 0 e 100, você pode usar a seguinte fórmula

        int randomNum = (int)(Math.random() * 101);  // 0 to 100

        


    }
}
