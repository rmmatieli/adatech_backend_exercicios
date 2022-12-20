package LogicaDeProgramacao.Aula04;

import java.util.Scanner;

public class SextoExercicio {

    /*
    Desenvolver um método que defina um inteiro (nota) e um char que é a notaFinal

    >= 90 = 'A'
    >= 80 = 'B'
    >= 70 = 'C'
    >= 60 = 'D'
    < 60 = 'F
     */
    public static double recebeNota() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota do aluno: ");
        double nota = scanner.nextDouble();

        return nota;

    }

    public static void resultadoNotaAluno() {

        double nota = recebeNota();
        char resultado;

        if (nota >= 90) {
            resultado = 'A';
        } else if (nota >= 80) {
            resultado = 'B';
        } else if (nota >= 70) {
            resultado = 'C';
        } else if (nota >= 60) {
            resultado = 'D';
        } else {
            resultado = 'F';
        }

        System.out.println("O resultado do Aluno é: " + resultado);

    }

}
