package LogicaDeProgramacao.Aula05;

public class NonoExercicio {

    public static void main(String[] args) {

        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        System.out.println(contains(my_array1,2));

        criaMatriz(10,10);

    }

    public static boolean contains(int[] arr, int item) {

        boolean existe = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                existe = true;
            }
        }

        return existe;
    }

    public static int[][] criaMatriz(int linha, int coluna) {

        coluna = coluna * 2;
        int[][] array = new int[linha][coluna];

        int espaco = 0;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (j == espaco){
                    System.out.print("  ");
                    espaco += 2;
                } else {
                    System.out.print(array[i][j]);
                }

            }
            System.out.println();
            espaco = 0;
        }

        return array;
    }



}
