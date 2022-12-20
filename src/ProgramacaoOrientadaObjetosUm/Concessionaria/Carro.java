package ProgramacaoOrientadaObjetosUm.Concessionaria;

public class Carro {

    public String dono;
    String motor;
    int numeroDeRodas;
    int aroRoda;
    int anoDeFabricacao;
    String cor;
    String marca;
    String modelo;
    String tipoCombustivel;
    double preco;

    @Override
    public String toString() {
        return "Carro\n" +
                "Motor: " + this.dono + "\n" +
                "Numero de rodas: " + this.motor + "\n" +
                "Aro: " + this.aroRoda + "\n" +
                "Ano de Fabricação: " + this.anoDeFabricacao + "\n" +
                "Cor: " + this.cor + "\n" +
                "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Tipo Combustível: " + this.tipoCombustivel + "\n" +
                "Preço: " + this.preco;
    }

}
