package ifsc.poo.catalogo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Catalogo {

    private Set<Filme> filme = new HashSet<>();

    public Catalogo() {
        this.filme = filme;
    }

    // Adicionar filmes
    public void adicionarFilmes() {
        return;
    }

    // remover filmes
    public void removerFilmes(String nome_do_filme_para_remover) {
        filme.removeIf(filme -> filme.getNome().equals(nome_do_filme_para_remover));

    }
}
