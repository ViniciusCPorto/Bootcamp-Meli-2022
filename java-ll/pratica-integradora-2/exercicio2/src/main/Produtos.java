package main;

public class Produtos {

    protected String nome;
    protected double preco;

    public Produtos (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString(){
        return "Produto{" +
                "Nome:" + nome + '\'' +
                "Preço: " + preco +
                "}";
    }

    public double calcular(int quantidadeDeProdutos){
        return preco * quantidadeDeProdutos;
    }

}
