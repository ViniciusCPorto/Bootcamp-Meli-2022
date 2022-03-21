package Automoveis;

import java.util.ArrayList;
import java.util.List;

public class Garagem {

    private int id;
    private List<Veiculos> veiculos = new ArrayList<>();

    public Garagem(int id, ArrayList<Veiculos> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public Garagem(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculos> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculos> veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculos(Veiculos veiculos) {
        this.veiculos.add(veiculos);
    }

}
