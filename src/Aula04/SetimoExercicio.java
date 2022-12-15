package Aula04;

public class SetimoExercicio {

    /*
    Crie um método que defina um atributo do tipo int e um atributo do tipo String.
    Caso esse número seja correspondente a algum mês do ano, retorne o nome do mês.
    Entrada: 8
    Saída: "Agosto"
     */


    public static String validaMesDoAno(int numeroDoMes) {

        String mes;

        switch (numeroDoMes){
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "Valor inválido. Não existe mês " + numeroDoMes;
                break;
        }

        return mes;
    }
}
