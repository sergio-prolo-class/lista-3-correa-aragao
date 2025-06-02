[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/glaA5tz-)
# Lista 3 - Diagramas de classe

## Alunas: Ingridy Aragão e Isabella Corrêa.


```mermaid
classDiagram
    
    %% Catalogo de filmes
    
    class Controle {
        - catalogo : Catalogo
        + executar() : void 
    }
    
    class Catalogo {
        - String filmes
        + adicionarFilme() void
        + removerFilme() void
        + listarFilme() void
    }
    
    class Filme {
        - String filmes
        - String autor
        - String anoLancamento
    }
    
    %% Fila de atendimento.
    
    class ControleFila {
        + executar() : void
    }
    
    class Atendimento {
        - clientesRegistrados: Set<Cliente>
        - filaClientes: Queue<Solicitacao>
        - atendidosClientes: List<Cliente>
        + Atendimento()
        + registrarClientes(nome: String, idade: int, telefones: List<String>): void
        + adicionarSolicitacao(cliente: Cliente, descricao: String): void
        + listarTelefones(): void
        + imprimirProximoClienteFila(): void
        + atenderProximaSolicitacao(): void
        + listarIdadesClientesAtendidos(): void
        + listarTelefonesClientesEmEspera(): void
        + encontrarClientePorTelefone(telefone: String): Cliente
    }
    
    class Cliente {
        - nome: String
        - idade: int
        - numTelefone: List<String>
        + Cliente(nome: String, idade: int, numTelefone: List<String>)
        + getNome(): String
        + getIdade(): int
        + getnumTelefone(): List<String>
        + equals(Object o): boolean
        + hashCode(): int
        + toString(): String
    }
    
    class Solicitacao {
        - cliente: Cliente
        + Solicitacao(descricao: String, cliente: Cliente)
        + getDescricao(): String
        + getCliente(): Cliente
    }

    Controle --|> Atendimento : usa
    Atendimento "1" *-- "0..*" Cliente : registra
    Atendimento "1" *-- "0..*" Solicitacao : gerencia
    Solicitacao "0..*" -- "1" Cliente : feita por
        
        

```

