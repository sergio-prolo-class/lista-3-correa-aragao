[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/glaA5tz-)
# Lista 3 - Diagramas de classe

## Alunas: Ingridy Aragão e Isabella Corrêa.

### Como Executar

Para compilar e executar o projeto, certifique-se de que o Java Development Kit (JDK) e o Gradle estão instalados e configurados corretamente em sua máquina.

Clone o repositório: git clone <URL_DO_SEU_REPOSITORIO> cd <nome_do_repositorio>

- Navegue até a pasta raiz do projeto Gradle.
- Execute o programa: ./gradlew run (em sistema Linux)
- O programa iniciará com um menu interativo no terminal, permitindo a interação com o sistema de Fila de Atendimento.

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
        - sistemaAtendimento: Atendimento
        - entrada: Scanner
        + Controle()
        + executar(): void
        - exibirMenu(): void
        - processarOpcao(opcao: int): void
    }
    
    class Atendimento {
        - clienteRegistrados: Set<Cliente>
        - filaClientes: Queue<Solicitacao>
        - atendidosClientes: List<Cliente>
        + Atendimento()
        + registrarClientes(nome: String, idade: int, telefones: List<String>): void
        + adicionarSolicitacao(cliente: Cliente, descricao: String): void
        + listarTelefones(): void
        + proximosCliente(): void
        + proximaSolicitacao(): void
        + clientesAtendidosIdades(): void
        + clientesEsperaTelefones(): void
        + encontrarClienteTelefone(telefone: String): Cliente
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

