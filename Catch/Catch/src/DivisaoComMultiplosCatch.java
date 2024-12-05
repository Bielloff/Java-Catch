import java.util.Scanner;

public class DivisaoComMultiplosCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Insira o primeiro número: ");
            String input1 = scanner.nextLine();
            int numero1 = Integer.parseInt(input1); // Converte a String para int

            System.out.print("Insira o segundo número: ");
            String input2 = scanner.nextLine();
            int numero2 = Integer.parseInt(input2); // Converte a String para int

            int resultado = numero1 / numero2; // Realiza a divisão
            System.out.println("Resultado da divisão: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Você deve inserir apenas números inteiros.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida. Por favor, insira um divisor diferente de zero.");
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um erro inesperado. " + e.getMessage());
        } finally {
            System.out.println("Execução encerrada.");
            scanner.close();
        }
    }
}