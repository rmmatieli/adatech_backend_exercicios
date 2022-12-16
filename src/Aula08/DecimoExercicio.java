package Aula08;

import java.util.Scanner;

public class DecimoExercicio {

    /*
    Escreva um programa Java para converter minutos em um número de anos e dias.
    Exemplo:
    Entrada: 3456789
    Saida: 6 anos e 210 dias
     */

    public static void main(String[] args) {

        converteMinutosEmDiasAnos();

    }

    public static void converteMinutosEmDiasAnos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de minutos: ");
        int minutos = scanner.nextInt();


        double dias = (double) (minutos/60)/24;
        double ano = dias / 365;

        //System.out.println(dias);

        int anoInt = (int) ano;
        double restoAno = ano % 1;
        double diasResto = restoAno * 365;
        //System.out.println(diasResto);
        System.out.println(anoInt + " ano(s) e " + Math.round(diasResto) + " e dia(s).");
    }

}
