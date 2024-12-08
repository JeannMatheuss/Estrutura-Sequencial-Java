import java.util.*;
public class Exercicio3 {
    public static void main(String[] args) {

        double celsiusDigitado;
        Scanner celsius = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsios: ");
        celsiusDigitado = celsius.nextDouble();

        double fahrenheit;
        fahrenheit = (celsiusDigitado * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }
}
