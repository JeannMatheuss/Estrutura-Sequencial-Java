import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        
        int a, b;
        double x, y;

        Scanner valor_inteiro = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        a = valor_inteiro.nextInt();
        System.out.println("Digite um valor inteiro: ");
        b = valor_inteiro.nextInt();

        x = a + b / 100;
        y = (a + b) / 100;
        System.out.println("O valor de x é: " + x);
        System.out.println("O valor de y é: " + y);

    }
}
