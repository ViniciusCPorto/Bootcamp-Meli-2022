public class Pessoa {

    private String nome;
    private int idade;
    private String id;
    private double peso;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int calcularIMC() {
        double imc = this.peso / (this.altura * this.altura);
        if (imc < 20.0D) {
            return -1;
        } else {
            return imc < 25.0D ? 0 : 1;
        }
    }

    public String nivelIMC() {
        switch(this.calcularIMC()) {
            case -1:
                return "Abaixo do peso";
            case 0:
                return "Peso saudavel";
            case 1:
                return "Sobre peso";
            default:
                return null;
        }
    }

    public boolean maioridade() {
        return this.idade >= 18;
    }

    public String toString() {
        return "Pessoa{nome='" + this.nome + "', idade=" + this.idade + ", id='" + this.id + "', peso=" + this.peso + ", peso=" + this.altura + "}";
    }

}
