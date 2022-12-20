package ProgramacaoOrientadaObjetosUm.Concessionaria;

public class TesteConcessionaria {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        //System.out.println(carro1.cor);
        carro1.marca = "Mercedes";
        carro1.modelo = "Sedan";
        carro1.cor = "Prata";
        carro1.numeroDeRodas = 5;
        carro1.aroRoda = 18;
        carro1.anoDeFabricacao = 2022;
        carro1.dono = "Renato Anderson";
        carro1.tipoCombustivel = "Gasolina";
        carro1.motor = "Mercedes Bens 204 Cavalos";
        carro1.preco = 370000.00;

        System.out.println(carro1);

        Carro carro2 = carro1;
        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.cor = "Azul";
        carro2.numeroDeRodas = 5;
        carro2.aroRoda = 18;
        carro2.anoDeFabricacao = 1995;
        carro2.dono = "Anderson";
        carro2.tipoCombustivel = "Gasolina";

        System.out.println(carro2);

    }

}
