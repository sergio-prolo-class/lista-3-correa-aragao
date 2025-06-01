package ifsc.poo.catalogo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Catalogo {

    private Set<Filme> filme = new HashSet<>();

    public Catalogo(Set<Filme> filme) {
        this.filme = filme;
    }

    // Adicionar filmes
    public void adicionarFilmes(Filme filme) {
        this.filme.add(filme);
    }

    // remover filmes
    public void removerFilmes(String nome_do_filme_para_remover) {
        filme.removeIf(filme -> filme.getNome().equals(nome_do_filme_para_remover))
    }

    //Listar filmes
    public void listarFilmes() {
        for (Filme novoFilme : filme) {
            System.out.println(novoFilme);
        }
    }
}
