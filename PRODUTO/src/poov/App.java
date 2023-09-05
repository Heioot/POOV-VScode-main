
package poov;
import java.util.ArrayList;

import poov.teste.Produto;

public class App {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        Produto p = new Produto();


        produtos.add(new Produto());
        produtos.add(p.obteProduto());


        for(Produto produto : produtos){
            produto.mostrar();
            System.out.println();
        }

    }
}
