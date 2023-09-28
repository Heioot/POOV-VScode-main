package poov;

import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", 2017, "Rocco");
        Autor autor = new Autor("J.K. Rowling", "12345678909");
        livro.adicionarAutor(autor);
        autor.adicionarLivro(livro);

        livro = new Livro("Harry Potter e a Câmara Secreta", 2015, "Pottermore Publishing");
        livro.adicionarAutor(autor);
        autor.adicionarLivro(livro);

        System.out.println(livro);
        System.out.println(livro.getAutores());

        System.out.println(autor);
        System.out.println(autor.getLivros());

        // ------------------------------------

        // ArrayList<Livro> livros = new ArrayList<>();
        // Livro livro = new Livro("Harry Potter e a Pedra Filosofal", 2017, "Rocco");
        // livros.add(livro);
        // livro = new Livro("Harry Potter e a Câmara Secreta", 2015, "Pottermore Publishing");
        // livros.add(livro);

        // Autor autor = new Autor("J.K. Rowling", "12345678909", livros);

        // for (Livro l : autor.getLivros()) {
        //     l.adicionarAutor(autor);
        // }

        // ------------------------------------

        // ArrayList<Autor> autores = new ArrayList<>();
        // Livro livro = new Livro("Física I, Sears e Zemansky: mecânica", 2016, "Pearson");
        // Autor autor = new Autor("Hugh D. Young", "12345678909");
        // autores.add(autor);
        // autor.adicionarLivro(livro);

        // autor = new Autor(" Roger A. Freedman", "12345678909");
        // autores.add(autor);
        // autor.adicionarLivro(livro);

        // livro.setAutores(autores);
        
        //------------------------------------

        // ArrayList<Autor> autores = new ArrayList<>();
        // Livro livro = new Livro("Física I, Sears e Zemansky: mecânica", 2016, "Pearson");
        // Autor autor = new Autor("Hugh D. Young", "12345678909");
        // autores.add(autor);
        // autor.adicionarLivro(livro);

        // autor = new Autor(" Roger A. Freedman", "12345678909");
        // autores.add(autor);
        // autor.adicionarLivro(livro);
        
        // livro.setAutores(autores);

        // livro = new Livro("Física II, Sears e Zemansky: termodinâmica e ondas", 2016, "Pearson", autores);
        // for (Autor a : autores) {
        //     a.adicionarLivro(livro);
        // }

        // System.out.println(livro);
        // System.out.println(livro.getAutores());
        // System.out.println();
        // System.out.println(livro.getAutores().get(0));
        // System.out.println(livro.getAutores().get(0).getLivros());

        //------------------------------------

        //Com a ligacao automatica dentro de adicionarXXX
        
        // Livro livro = new Livro("Harry Potter e a Pedra Filosofal", 2017, "Rocco");
        // Autor autor = new Autor("J.K. Rowling", "12345678909");
        // livro.adicionarAutor(autor);

        // livro = new Livro("Harry Potter e a Câmara Secreta", 2015, "Pottermore Publishing");
        // livro.adicionarAutor(autor);

        // System.out.println(livro);
        // System.out.println(livro.getAutores());

        // System.out.println(autor);
        // System.out.println(autor.getLivros());

    }

}
