package org.example;


import java.util.Scanner;

public class Main {
    private static final int TAMANHO_VETOR = 100;

    private static Mercadoria[] vetorMercadorias = new Mercadoria[TAMANHO_VETOR];
    private static Servico[] vetorServicos = new Servico[TAMANHO_VETOR];

    private static int qtdMercadorias = 0;
    private static int qtdServicos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar mercadoria");
            System.out.println("2 - Cadastrar servico");
            System.out.println("3 - Buscar dados de mercadoria");
            System.out.println("4 - Buscar dados de servico");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Mercadoria ---");
                    System.out.print("Codigo: ");
                    int codigoMercadoria = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nomeMercadoria = scanner.nextLine();

                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();

                    cadastraMercadoria(codigoMercadoria, nomeMercadoria, peso);
                    break;

                case 2:
                    System.out.println("\n--- Cadastro de Servico ---");
                    System.out.print("Codigo: ");
                    int codigoServico = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nomeServico = scanner.nextLine();

                    System.out.print("Valor por hora: ");
                    double valorHora = scanner.nextDouble();
                    scanner.nextLine();

                    cadastraServico(codigoServico, nomeServico, valorHora);
                    break;

                case 3:
                    System.out.println("\n--- Busca de Mercadoria ---");
                    System.out.print("Informe o nome da mercadoria: ");
                    String buscaMercadoria = scanner.nextLine();
                    buscarMercadoria(buscaMercadoria);
                    break;

                case 4:
                    System.out.println("\n--- Busca de Servico ---");
                    System.out.print("Informe o nome do servico: ");
                    String buscaServico = scanner.nextLine();
                    buscarServico(buscaServico);
                    break;

                case 5:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 5);

        scanner.close();
    }

    public static void cadastraMercadoria(int codigo, String nome, double peso) {
        if (qtdMercadorias < TAMANHO_VETOR) {
            vetorMercadorias[qtdMercadorias] = new Mercadoria(codigo, nome, peso);
            qtdMercadorias++;
            System.out.println("Mercadoria cadastrada com sucesso.");
        } else {
            System.out.println("Nao ha espaco disponivel no vetor de mercadorias.");
        }
    }

    public static void cadastraServico(int codigo, String nome, double valorHora) {
        if (qtdServicos < TAMANHO_VETOR) {
            vetorServicos[qtdServicos] = new Servico(codigo, nome, valorHora);
            qtdServicos++;
            System.out.println("Servico cadastrado com sucesso.");
        } else {
            System.out.println("Nao ha espaco disponivel no vetor de servicos.");
        }
    }

    public static void buscarMercadoria(String nome) {
        boolean encontrou = false;

        for (int i = 0; i < qtdMercadorias; i++) {
            if (vetorMercadorias[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("\nMercadoria encontrada:");
                System.out.println("Codigo: " + vetorMercadorias[i].getCodigo());
                System.out.println("Nome: " + vetorMercadorias[i].getNome());
                System.out.println("Peso: " + vetorMercadorias[i].getPeso());
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Mercadoria nao encontrada.");
        }
    }

    public static void buscarServico(String nome) {
        boolean encontrou = false;

        for (int i = 0; i < qtdServicos; i++) {
            if (vetorServicos[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("\nServico encontrado:");
                System.out.println("Codigo: " + vetorServicos[i].getCodigo());
                System.out.println("Nome: " + vetorServicos[i].getNome());
                System.out.println("Valor/Hora: " + vetorServicos[i].getValorHora());
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Servico nao encontrado.");
        }
    }
}