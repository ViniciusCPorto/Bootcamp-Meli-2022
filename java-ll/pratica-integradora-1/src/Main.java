public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println("Sem parametros: " + pessoa);
        Pessoa dadosPessoa = new Pessoa("Vinicius", 22, "1");
        System.out.println("Nome, idade  e ID:" + dadosPessoa.toString());
        Pessoa bioimpedancia = new Pessoa("Vinicius", 22, "1", 85.0D, 1.75D);
        System.out.println("Todos os parametros: " + bioimpedancia.toString());
        new Pessoa("Vinicius", 22);
    }
}