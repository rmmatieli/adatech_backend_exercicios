package LogicaDeProgramacao.Aula05;

public class OitavoExercicio {

    public static void main(String[] args) {

        int[] arrayCom4 = new int[4];

        //int soma = 0;
        for (int i = 0; i < arrayCom4.length; i++) {
            //soma += arrayCom4[i];
            System.out.println(arrayCom4[i]);
        }

        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        int maior = 0;

        for (int i = 0; i < my_array1.length; i++) {
            maior = my_array1[i];
            for (int j = i; j < my_array1.length; j++) {
                if (maior > my_array1[j]){
                    maior = my_array1[j];
                    my_array1[j] = my_array1[i];
                    my_array1[i] = maior;
                }
                //System.out.println(my_array1[i]);
            }
        }

        int soma = 0;

        for (int i = 0; i < my_array1.length; i++) {
            soma += my_array1[i];
            System.out.println(my_array1[i]);
        }

        System.out.println("Media " + soma/my_array1.length);

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };





    }


    boolean contains(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return true;
            }
        }

        return false;
    }

}
