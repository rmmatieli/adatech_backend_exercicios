package ProgramacaoOrientadaObjetosUm.Concessionaria;

public class Moto {

    String marca;
    String modelo;
    int cilindradas;
    int anoDeFabricacao;
    String cor;
    String tipoCombustivel;
    double preco;

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                ", anoDeFabricacao=" + anoDeFabricacao +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustivel='" + tipoCombustivel + '\'' +
                ", preco=" + preco +
                '}';
    }

}
