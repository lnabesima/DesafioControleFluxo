import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Insira dois números e a aplicação imprimirá a diferença entre eles, linha a linha.");
                System.out.print("Insira o primeiro número: ");
                int num1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Insira o segundo número: ");
                int num2 = Integer.parseInt(scanner.nextLine());

                count(num1, num2);
                break;
            } catch (InvalidParametersException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Um dos números informados estão acima da capacidade de processamento desta aplicação. Por favor, tente novamente com um número menor.");
            }
        }
    }

    public static void count(int num1, int num2) throws InvalidParametersException {
        if (num1 < 0 || num2 < 0) throw new InvalidParametersException();
        if (num1 > num2) throw new InvalidParametersException("O primeiro argumento deve ser maior que o segundo.");

        int counter = num2 - num1;
        System.out.printf("Vou imprimir todos os números de 1 até %d.%n", counter);

        for (int i = 1; i <= counter; i++) {
            System.out.printf("Imprimindo o número %d%n", i);
        }
    }
}
