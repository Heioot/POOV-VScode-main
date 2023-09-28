
package poov;

import java.util.ArrayList;

public class Autor {

    private String nome;
    private String cpf;
    private ArrayList<Livro> livros;

    public Autor() {
        nome = "sem nome";
        cpf = "sem cpf";
        livros = new ArrayList<>();
    }

    public Autor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        livros = new ArrayList<>();
    }

    public Autor(String nome, String cpf, ArrayList<Livro> livros) {
        this.nome = nome;
        this.cpf = cpf;
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
        // for (Livro l : livros) {
        //     if (!l.getAutores().contains(this)) {
        //         l.adicionarAutor(this);
        //     }
        // }
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        // if (!livro.getAutores().contains(this)) {
        // livro.adicionarAutor(this);
        // }
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\ncpf: " + cpf;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((livros == null) ? 0 : livros.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Autor other = (Autor) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (livros == null) {
            if (other.livros != null)
                return false;
        } else if (!livros.equals(other.livros))
            return false;
        return true;
    }

}