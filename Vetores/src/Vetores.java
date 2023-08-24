import java.util.Scanner;
import java.util.Random;

public class Vetores {
    public static void main(String[] args){
        // a) Criar um vetor de tamanho 20 de inteiros
        int vetor[] = new int[20];
    // b) Preencher os 10 primeiros valores do vetor com números digitados pelo usuário via teclado
        Scanner s = new Scanner(System.in);
        Random random = new Random();
    
        for(int i = 0; i < 10; i++){
            System.out.println("Digite os valores na posicao:" + i);
            vetor[i] = s.nextInt();
        }

    // c) Preencher os 10 últimos valores do vetor com números aleatórios entre 1 e 100


        for(int i = 10; i < 20; i++){
            vetor[i] = random.nextInt(100)+1;
        }
    // d) Mostrar o vetor inteiro na tela
        System.out.println("Vetor inteiro: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    // e) Mostrar o vetor de trás para frente na tela
        System.out.println("\n");
        System.out.println("Vetor de trás pra frente: ");

        for(int i = vetor.length -1 ; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    // f) Calcular e mostrar a média dos valores do vetor

        int soma = 0;
        double media = 0;

        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }

        media = (double)(soma/vetor.length);
        System.out.println("\n");
        System.out.println("Valor da media: " + media);

    // g) Encontrar e mostrar o maior valor e o menor valor do vetor 
        int maior = vetor[0], menor = vetor[0];
        
        for(int i = 0; i < vetor.length; i ++){
            if (maior < vetor[i]){
                maior = vetor[i];
            }
        }

        System.out.println("Maior: " + maior);

        for(int i = 0; i < vetor.length; i ++){
            if (menor > vetor[i]){
                menor = vetor[i];
            }
        }

        System.out.print("Menor: " + menor);


    // h) Mostrar os valores das posições pares do vetor
        System.out.println("\n");
        System.out.println("Mostrar os valores das posições pares do vetor");
        for(int i = 0; i < vetor.length; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    // i) Mostrar os valores das posições ímpares do vetor
        System.out.println("\n");
        System.out.println("Mostrar os valores das posicoes ímpares do vetor");
        for(int i = 0; i < vetor.length; i++){
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }
    // j) Mostrar os valores pares do vetor
        System.out.println("\n");
        System.out.println("Mostrar os valores pares do vetor");
            for(int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                System.out.print(vetor[i] + " ");
            }

        }
    // k) Mostrar os valores ímpares do vetor
        System.out.println("\n");
        System.out.println("Mostrar os valores ímpares do vetor");
            for(int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 1){
                System.out.print(vetor[i] + " ");
            }
        }
    // l)Verificar se há elementos repetidos no vetor e exibir uma mensagem em caso afirmativo

        boolean mensagem = true;
        for(int i = 0; i < vetor.length; i++ ){
            for(int aux = i + 1; aux < vetor.length; aux++){
                //System.out.print("valor de i: " + i);
                //System.out.println("valor de aux: " + aux);
                if(vetor[i] == vetor[aux]){
                mensagem = false;
            }
        }
        }

        System.out.println("\n");

        if(mensagem){
            System.out.println("Não há elementos repetidos no vetor");
        } else {
            System.out.println("Há elementos repetidos no vetor");
        }

    // m) Solicitar um valor ao usuário e verificar se esse valor existe no vetor. Se existir exibir a posição em que ele está, senão exibir uma mensagem de valor não encontrado 
            
            System.out.println("Digite um valor para verificar se existe no vetor: ");
            int valor = s.nextInt();
            boolean existe = false;
            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] == valor){
                    existe = true;
                    System.out.println("Valor encontrado na posicao: " + i);
                }
            }
            if(!existe){
                System.out.println("Valor não encontrado");
            }




    // n) Verificar se o vetor está em ordem crescente, ou seja, se a[0] <= a[1] <= a[2] <= ... para todos elementos do vetor
        boolean ordemCrescente = true;
        for(int i = 0; i < vetor.length -1; i++){
            if(vetor[i] > vetor[i+1]){
                ordemCrescente = false;
            }
        }
        if(ordemCrescente){
            System.out.println("O vetor está em ordem crescente");
        } else {
            System.out.println("O vetor não está em ordem crescente");
        }
        s.close();
    }
}
