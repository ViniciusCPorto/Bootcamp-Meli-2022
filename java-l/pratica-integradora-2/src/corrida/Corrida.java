package corrida.selva;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Corrida {

    public static Corredor participantSubscription(Scanner scanner, HashMap<Integer, Corredor> list) {
        System.out.println("Informe o RG: ");
        String rg = scanner.next();
        System.out.println("Informe o nome: ");
        String nome = scanner.next();
        System.out.println("Informe o sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("Informe a idade: ");
        Integer idade = scanner.nextInt();
        System.out.println("Informe o número do celular: ");
        String numeroCelular = scanner.next();
        System.out.println("Informe o número de emergência: ");
        String numeroEmergencia = scanner.next();
        System.out.println("Informe seu grupo sanguineo: ");
        String tipoSanguineo = scanner.next();
        System.out.println("Informe o circuito escolhido: ");
        String circuito = scanner.next();
        if (idade < 18 && circuito.equals("Avancado")) {
            System.out.println("Você não pode se inscrever nesse circuito por não se enquadrar na faixa etária maior de 18 anos.");
            System.out.println("Tente novamente.");
            return null;
        } else {
            boolean check = false;
            Iterator var11 = list.entrySet().iterator();

            while (var11.hasNext()) {
                Map.Entry<Integer, Corredor> entry = (Map.Entry) var11.next();
                if (((Corredor) entry.getValue()).getRg().equals(rg)) {
                    System.out.println("O participante só pode se inscrever uma única vez em um único circuito!");
                    check = true;
                }
            }

            if (check) {
                return null;
            } else {
                String valor = valorCalculator(idade, circuito);
                return new Corredor(circuito, rg, nome, sobrenome, idade, numeroCelular, numeroEmergencia, tipoSanguineo, valor);
            }
        }
    }

    public static String valorCalculator(Integer idade, String circuito) {
        byte var3 = -1;
        switch (circuito.hashCode()) {
            case 78151886:
                if (circuito.equals("Médio")) {
                    var3 = 1;
                }
                break;
            case 985338701:
                if (circuito.equals("Pequeno")) {
                    var3 = 0;
                }
        }

        switch (var3) {
            case 0:
                if (idade < 18) {
                    return "R$ 1.300,00";
                }

                return "R$ 1.500,00";
            case 1:
                if (idade < 18) {
                    return "R$ 2.000,00";
                }

                return "R$ 2.300,00";
            default:
                return "RS 2.800,00";
        }
    }

    public static void listingCorredores(Scanner scanner, HashMap<Integer, Corredor> list) {
        System.out.println("Escolha a categoria de participantes cadastradas que você quer olhar: ");
        System.out.println("1 - Circuito pequeno: 2km pela selva e riachos.");
        System.out.println("2 - Circuito médio: 5km pela selva, riachos e lama.");
        System.out.println("3 - Circuito avançado: 10km pela selva, riachos, lama e escalada.");
        System.out.println("Informe a categoria escolhida: ");
        Integer option = scanner.nextInt();
        switch (option) {
            case 1:
                list.entrySet().forEach((entry) -> {
                    if (((Corredor) entry.getValue()).getCircuito().equals("Pequeno")) {
                        PrintStream var10000 = System.out;
                        Object var10001 = entry.getKey();
                        var10000.println(var10001 + " - " + ((Corredor) entry.getValue()).getNome() + " " + ((Corredor) entry.getValue()).getSobrenome() + ". Valor da Inscricao: " + ((Corredor) entry.getValue()).getValor());
                    }

                });
                break;
            case 2:
                list.entrySet().forEach((entry) -> {
                    if (((Corredor) entry.getValue()).getCircuito().equals("Médio")) {
                        PrintStream var10000 = System.out;
                        Object var10001 = entry.getKey();
                        var10000.println(var10001 + " - " + ((Corredor) entry.getValue()).getNome() + " " + ((Corredor) entry.getValue()).getSobrenome() + ". Valor da Inscricao: " + ((Corredor) entry.getValue()).getValor());
                    }

                });
                break;
            case 3:
                list.entrySet().forEach((entry) -> {
                    if (((Corredor) entry.getValue()).getCircuito().equals("Avancado")) {
                        PrintStream var10000 = System.out;
                        Object var10001 = entry.getKey();
                        var10000.println(var10001 + " - " + ((Corredor) entry.getValue()).getNome() + " " + ((Corredor) entry.getValue()).getSobrenome() + ". Valor da Inscricao: " + ((Corredor) entry.getValue()).getValor());
                    }

                });
                break;
            default:
                System.out.println("Opção inexistente. Tente novamente.");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        Integer globalId = 1;
        HashMap corredorList = new HashMap();

        do {
            System.out.println("------------ MENU ------------");
            System.out.println("1 - Inscrever um participante;");
            System.out.println("2 - Mostrar todos participantes inscritos;");
            System.out.println("3 - Cancelar a incricao de um participante;");
            System.out.println("0 - Sair");
            System.out.println("------------------------------");
            System.out.println("Informe a sua opcao: ");
            menu = scanner.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("Programa encerrado. Até logo!");
                    break;
                case 1:
                    Corredor corredor = participantSubscription(scanner, corredorList);
                    if (corredor != null) {
                        PrintStream var10000 = System.out;
                        String var10001 = corredor.getNome();
                        var10000.println(var10001 + ", sua inscricao foi aprovada! Você é o corredor de n. " + globalId + ".");
                        corredorList.put(globalId, corredor);
                        globalId = globalId + 1;
                    }
                    break;
                case 2:
                    listingCorredores(scanner, corredorList);
                    break;
                case 3:
                    System.out.println("Informe o número de inscricao do participante que você deseja cancelar a participacao: ");
                    Integer key = scanner.nextInt();
                    Corredor removedParticipant = (Corredor) corredorList.remove(key);
                    if (removedParticipant != null) {
                        System.out.println("Participante removido");
                    } else {
                        System.out.println("Participante nao encontrado ou ja foi removido.");
                    }
            }
        } while (menu != 0);
    }
}
