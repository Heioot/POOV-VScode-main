package poov;

import java.util.ArrayList;

public class Livro {

    private String titulo;
    private int ano;
    private String editora;
    private ArrayList<Autor> autores;

    public Livro() {
        titulo = "sem titulo";
        ano = -1;
        editora = "sem editora";
        autores = new ArrayList<>();
    }

    public Livro(String titulo, int ano, String editora) {
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        autores = new ArrayList<>();
    }

    public Livro(String titulo, int ano, String editora, ArrayList<Autor> autores) {
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
        // for (Autor a : autores) {
        //     if (!a.getLivros().contains(this)) {
        //         a.adicionarLivro(this);
        //     }
        // }
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
        // if (!autor.getLivros().contains(this)) {
        // autor.adicionarLivro(this);
        // }
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\nano: " + ano + "\neditora: " + editora;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ano;
        result = prime * result + ((editora == null) ? 0 : editora.hashCode());
        result = prime * result + ((autores == null) ? 0 : autores.hashCode());
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
        Livro other = (Livro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (ano != other.ano)
            return false;
        if (editora == null) {
            if (other.editora != null)
                return false;
        } else if (!editora.equals(other.editora))
            return false;
        if (autores == null) {
            if (other.autores != null)
                return false;
        } else if (!autores.equals(other.autores))
            return false;
        return true;
    }

}
