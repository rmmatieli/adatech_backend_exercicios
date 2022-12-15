package Aula02;

import java.util.Scanner;

public class TerceiroExercicio {

    public static double numeroUm;
    public static double numeroDois;
    public static double numeroTres;

    public static void recebeDouble() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero 1: ");
        numeroUm = scanner.nextDouble();

        System.out.println("Informe o numero 2: ");
        numeroDois = scanner.nextDouble();

        System.out.println("Informe o numero 3: ");
        numeroTres = scanner.nextDouble();
    }

    public static void calculaMenor() {

        recebeDouble();

        System.out.println("O menor valor informado é: " + Math.min(Math.min(numeroUm, numeroDois),numeroTres));
    }
}
