package contador;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int numeroInicial = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int numeroFinal = sc.nextInt();

            if (numeroInicial >= numeroFinal) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = numeroInicial; i <= numeroFinal; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Os valores inseridos devem ser números inteiros.");
        }
        
        sc.close();
    }
}
