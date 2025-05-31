package ifsc.poo.filaAtendimento;

// ordem de chegada das solicitações
// Listar as idades dos clientes já atendidos.
// Precisa de uma forma de rastrear os clientes que já passaram pela fila
// e foram atendidos.

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Atendimento {

    private Set<Cliente> clienteRegistrados;
    private Queue<String> filaClientes;
    private List<Cliente> atendidosClientes;

    public Atendimento(Set<Cliente> clienteRegistrados, Queue<String> filaClientes, List<Cliente> atendidosClientes) {
        this.clienteRegistrados = clienteRegistrados;
        this.filaClientes = filaClientes;
        this.atendidosClientes = atendidosClientes;
    }

    // metodos
    // passo 1: eu preciso registrar os dados dos clientes - 1 solicitação
    // passo 2: preciso listar os telefones de todos os clientes já registrados.

    
}
