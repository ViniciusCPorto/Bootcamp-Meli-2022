package corrida.selva;

public class Corredor {
    private String circuito;
    private String rg;
    private String nome;
    private String sobrenome;
    private int idade;
    private String numeroCelular;
    private String numeroEmergencia;
    private String tipoSanguineo;
    private String valor;

    public Corredor(String Circuito, String rg, String nome, String sobrenome, int idade, String numeroCelular, String numeroEmergencia, String tipoSanguineo, String valor) {
        this.numeroCelular = numeroCelular;
        this.circuito = this.circuito;
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numeroEmergencia = numeroEmergencia;
        this.tipoSanguineo = tipoSanguineo;
        this.valor = valor;
    }

    public String getCircuito() {
        return this.circuito;
    }

    public void setCircuito(int codigoCorredor) {
        this.circuito = this.circuito;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroCelular() {
        return this.numeroCelular;
    }

    public void setNumeroCelular(String numeroEmergencia) {
        this.numeroCelular = numeroEmergencia;
    }

    public String getNumeroEmergencia() {
        return this.numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String numeroEmergencia) {
        this.valor = this.valor;
    }

    public String getTipoSanguineo() {
        return this.tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}
