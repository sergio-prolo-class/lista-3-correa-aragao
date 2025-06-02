package ifsc.poo.filaAtendimento;

// ordem de chegada das solicitações
// Listar as idades dos clientes já atendidos.
// Precisa de uma forma de rastrear os clientes que já passaram pela fila
// e foram atendidos.

import java.util.*;

public class Atendimento {

    private Set<Cliente> clienteRegistrados;
    private Queue<Solicitacao> filaClientes;
    private List<Cliente> atendidosClientes;

    public Atendimento(List<Cliente> atendidosClientes, Queue<Solicitacao> filaClientes, Set<Cliente> clienteRegistrados) {
        this.atendidosClientes = new LinkedList<>();
        this.filaClientes = new LinkedList<>();
        this.clienteRegistrados = new HashSet<>(); // para iniciar logo como um novo HashSet e coleção vazia
    }

    // passo 1: eu preciso registrar os dados dos clientes - 1 solicitação
    public void registrarClientes (String nome, int idade, List<String> telefones) {
        Cliente clientesNovos = new Cliente(nome, idade, telefones);

        boolean adicionarCliente = clienteRegistrados.add(clientesNovos);

        // aqui eu coloco para ver se o cliente foi registrado.
        if (adicionarCliente) {
            System.out.println(nome + " foi adicionado com sucesso");
        } else {
            System.out.println(nome + " já foi registrado");
        }
    }

    // passo 2: Registrar novas solicitações vindas de um cliente
    public void adicionarSolicitacao(Cliente cliente, String descricao) {
        Solicitacao solicitacaoNova = new Solicitacao(descricao, cliente);

        filaClientes.add(solicitacaoNova); // adicionando a solicititação a minha fila
        System.out.println("A solicitação de " + cliente.getNome() + " foi colocada na fila");
    }

    // passo 3: Listar os telefones de todos os clientes já registrados
    public void listarTelefones() {
        System.out.println("Lista de Telefones registrados -> Clientes");

        if (clienteRegistrados.isEmpty()) { // verificar se eu tenho clientes na base
            System.out.println("Não há clientes registrados.");
            return;
        }

        for (Cliente cliente : clienteRegistrados) {
            String clienteNome = cliente.getNome();

            List<String> telefones = cliente.getnumTelefone();
            System.out.println(clienteNome + " e seu telefone: " + telefones);
        }

        System.out.println("Lista encerrada.");
    }


    // próximo clientes da fila
    public void proximosCliente() {
        System.out.println("Lista dos próximos clientes da fila");

        if (filaClientes.isEmpty()) { // berifico se a fila está vazia
            System.out.println("A fila está vazia");
            return;
        }

        Solicitacao proximaSolici = filaClientes.peek();

        System.out.println("Lista encerrada.");
    }


    // Atender a próxima solicitação da fila, removendo-a
    public void proximaSolicitacao() {
        System.out.println("Próxima solicitação da fila");

        if (filaClientes.isEmpty()) {
            System.out.println("Fila de atendimeno sem solicitações");
            return;
        }

       Solicitacao atendeSolicitacao = filaClientes.poll();

        if (atendeSolicitacao != null) {
            Cliente atendeCliente = atendeSolicitacao.getCliente();

            // lista para os atendidos
            atendidosClientes.add(atendeCliente);

            System.out.println(atendeCliente.getNome() + " fez a solicitação e " + " foi atendida!");
            System.out.println(atendeCliente.getNome() + " foi adicionado a lista de clientes atendidos.");
        } else {
            System.out.println("Erro na solicitação (lista vazia");
        }

        System.out.println("Encerrado lista");

    }

    // Listar as idades dos clientes já atendidos
    public void clientesAtendidosIdades() {
        System.out.println("Idades dos clientes atendidos");

        if (atendidosClientes.isEmpty()){
            System.out.println("Nenhum cliente atendido");
            return;
        }

        // pegar os nomes e idades dos clientes na base de atendidos
        for (Cliente cliente : atendidosClientes) {
            String clienteNome = cliente.getNome();
            int clienteIdade = cliente.getIdade();

            System.out.println("Cliente " + clienteNome + ", tem idade: " + clienteIdade " anos");
        }

        System.out.println("Lista encerrada.");

    }

    // Listar os telefones dos clientes ainda em espera
    public void clientesEsperaTelefones() {
        System.out.println("Telefone dos clientes em espera");

        if (filaClientes.isEmpty()) {
            System.out.println("Nenhum cliente na fila de espera");
            return;
        }

        // for para percorrer a fila
        for (Solicitacao solicitacao : filaClientes) {
            Cliente clienteEspera = solicitacao.getCliente();

            String clienteNome = clienteEspera.getNome();
            List<String> listaTelefone = clienteEspera.getnumTelefone();

            System.out.println("Cliente " + clienteNome + ", Telefone: " + listaTelefone);
        }
    }

}
