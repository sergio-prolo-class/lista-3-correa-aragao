package ifsc.poo.filaAtendimento;

import java.util.List;
import java.util.Objects;

public class Cliente {

    private String nome;
    private int idade;
    private List<String> numTelefone;

    public Cliente(String nome, int idade, List<String> numTelefones) {
        this.nome = nome;
        this.idade = idade;
        this.numTelefone = numTelefones;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<String> getnumTelefone() {
        return numTelefone;
    }

    // colocando o telefone como identificador unico
    // metodo pego nos slides de API Collections (ultima página).
    public boolean equals(Object o) {

        Cliente cliente = (Cliente) o; // quando o cliente não é nulo = o
        if ((o == null) || getClass() != o.getClass()) return false;

        // aqui diz que se um ou ambos clientes não tem telefone, não são iguais.
        if (this.numTelefone == null || this.numTelefone.isEmpty() || cliente.numTelefone == null || cliente.numTelefone.isEmpty()) {
            return false;
        }

        // compara o primeiro telefone de cada lista.
        // Usamos Objects.equals para lidar com a possibilidade de o telefone ser nulo dentro da lista.
        return Objects.equals(this.numTelefone.get(0), cliente.numTelefone.get(0));
    }

    @Override
    public int hashCode() {
        // aqui eu coloquei o hashCode, para ver se também usa o primeiro telefone da lista
        // É importante que o hashCode retorne o mesmo valor para objetos que são considerados iguais pelo equals.
        // Para consistência com equals, vamos retornar 0.
        if (this.numTelefone == null || this.numTelefone.isEmpty()) {
            return 0; // Um valor padrão.
        }

        // Retorna o hashCode do primeiro telefone da lista.
        return Objects.hash(this.numTelefone.get(0));
    }

    @Override
    public String toString() {
        return "Cliente { " + " nome = '" + nome + '\'' + ", idade = " + idade + ", numTelefone = " + numTelefone + '}';
    }
}
