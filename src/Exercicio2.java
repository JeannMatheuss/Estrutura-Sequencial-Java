import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        
        double valor_produto;

        Scanner valor_digitado = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        valor_produto = valor_digitado.nextInt();

        System.out.println("O valor digitado vai receber um desconto de 15%");
        valor_produto = valor_produto - (valor_produto * 0.15);
        System.out.println("O valor do produto após o desconto é: " + valor_produto);
        
    }
}
