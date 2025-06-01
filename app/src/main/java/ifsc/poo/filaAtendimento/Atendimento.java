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
    public void proximosClientes {

    }

    // Atender a próxima solicitação da fila, removendo-a
    // Listar as idades dos clientes já atendidos
    // Listar os telefones dos clientes ainda em espera

}
