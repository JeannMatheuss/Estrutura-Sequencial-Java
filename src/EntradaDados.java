import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {

        int base, altura, area;
            Scanner entrada_dados = new Scanner (System.in);
            
            System.out.println("Digite o valor da base: ");
            base = entrada_dados.nextInt();

            System.out.println("Digite o valor da altura: ");
            altura = entrada_dados.nextInt();

            area = base * altura;

            System.out.println("\nArea do quadrilatero = " + area);

    }
}