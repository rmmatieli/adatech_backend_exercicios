package ProgramacaoOrientadaObjetosUm.Concessionaria;

public class TesteMoto {

    public static void main(String[] args) {

        Moto moto1 = new Moto();

        moto1.marca = "Yamaha";
        moto1.modelo = "Fazer 150 Ubs";
        moto1.cilindradas = 150;
        moto1.anoDeFabricacao = 2020;
        moto1.cor = "Preto";
        moto1.tipoCombustivel = "Gasolina";
        moto1.preco = 14_900.00;

        System.out.println(moto1);

    }

}
