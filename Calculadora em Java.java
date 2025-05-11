import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora Simples!");

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = entrada.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        double resultado = 0;

        if (operador == '+') {
            resultado = numero1 + numero2;
        } else if (operador == '-') {
            resultado = numero1 - numero2;
        } else if (operador == '*') {
            resultado = numero1 * numero2;
        } else if (operador == '/') {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Erro: Divisão por zero não permitida.");
                entrada.close();
                return; // Encerra o programa se houver divisão por zero
            }
        } else {
            System.out.println("Operador inválido.");
            entrada.close();
            return; // Encerra o programa se o operador for inválido
        }

        System.out.println("O resultado é: " + resultado);

        entrada.close();
    }
}
