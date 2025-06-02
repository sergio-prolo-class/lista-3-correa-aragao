package ifsc.poo.filaAtendimento;

import ifsc.poo.catalogo.Catalogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {

    private Atendimento atendimento;
    private Scanner console; // ler o que o usuario digitar

    public Controle(Atendimento atendimento, Scanner console) {
        this.atendimento = atendimento;
        this.console = console;
    }

    // metodo para executar o menu
    public void executar() {
        int opcao = -1; // opcao para o usuario escolher

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");

            // veio como String e depois eu converto
            String clienteDigita = console.nextLine();

            opcao = Integer.parseInt(clienteDigita); // tranforma de string para int

            proximaOpcao(opcao);

        } while (opcao != 0);

        System.out.println("Sistema de Fila de Atendimento encerrado.");
        console.close();
    }

    // Método para mostrar as opções do menu na tela.
    private void exibirMenu() {
        System.out.println("Menu Fila de Atendimento");
        System.out.println("1. Registrar Novo Cliente"); // Registro inicial de cliente
        System.out.println("2. Adicionar Nova Solicitação a Cliente Existente"); // Nova solicitação para um cliente já registrado
        System.out.println("3. Listar Telefones de Todos os Clientes Registrados");
        System.out.println("4. Imprimir Nome do Próximo Cliente da Fila");
        System.out.println("5. Atender Próxima Solicitação da Fila");
        System.out.println("6. Listar idades de Clientes Já Atendidos");
        System.out.println("7. Listar Telefones de Clientes Ainda em Espera");
        System.out.println("8. Sair do Programa");
    }

    // Método  para pegar a opção do usuário e chamar.
    private void proximaOpcao(int opcao) {
        switch (opcao) {
            case 1:
                //  Registrar Novo Cliente - primeira solicitação dele

                System.out.print("Nome do cliente: ");
                String nome = console.nextLine();

                System.out.print("Idade do cliente: ");
                int idade = console.nextInt();
                console.nextLine();

                System.out.print("Número de telefone (principal): ");
                String tel = console.nextLine();

                List<String> telefones = new ArrayList<>();
                telefones.add(tel);

                atendimento.registrarClientes(nome, idade, telefones);
                break;

            case 2:

                // Adicionar Nova Solicitação - Cliente Existente'
                System.out.print("Digite o telefone do cliente para a nova solicitação: ");
                String bucandoTele = console.nextLine();

                Cliente clienteSolicitacao = atendimento.encontrarClienteTelefone(bucandoTele);

                if (clienteSolicitacao != null) {

                    System.out.print("Digite a descrição da solicitação: ");
                    String descricao = console.nextLine();
                    atendimento.adicionarSolicitacao(clienteSolicitacao, descricao);

                } else {

                    System.out.println("Cliente não encontrado com o telefone: " + bucandoTele);
                    System.out.println("Se for um cliente novo, use a opção 1 para registrar.");

                }
                break;
            case 3:
                atendimento.listarTelefones(); // metodo - classe atendimento
                break;

            case 4:
                atendimento.proximosCliente(); // Chama o método da classe Atendimento
                break;

            case 5:
                atendimento.proximaSolicitacao(); // Chama o método que 'atende' a solicitação
                break;

            case 6:
                atendimento.clientesAtendidosIdades(); // Chama o método da classe Atendimento
                break;

            case 7:
                atendimento.clientesEsperaTelefones(); // Chama o método da classe Atendimento
                break;

            case 0:

                // A mensagem de saída
                break;
            default:

                System.out.println("Opção inválida! Por favor, digite um número de 1 a 8.");
                break;
        }
    }
    }

