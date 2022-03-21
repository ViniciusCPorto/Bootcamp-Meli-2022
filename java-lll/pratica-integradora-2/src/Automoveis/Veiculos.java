package Automoveis;

import java.math.BigDecimal;

public class Veiculos {

    private String marca;
    private String modelo;
    private BigDecimal preco;

    public Veiculos(String marca, String modelo, BigDecimal preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preço= R$ " + preco +
                '}';
    }
}
