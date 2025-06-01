package ifsc.poo.filaAtendimento;

import java.util.List;

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
    // public boolean telefoneUnico ();
    // slides
//    public boolean equals(Object o) {
//        if(!(o instanceof Pessoa other)) return false;
//        return this.nome.equals(p.nome) && this.idade
//                == other.idade;
//    }
//    public int hashCode() {
//        return nome.hashCode() + idade.hashCode();
//    }

    @Override
    public String toString() {
        return "Cliente { " + " nome = '" + nome + '\'' + ", idade = " + idade + ", numTelefone = " + numTelefone + '}';
    }
}
