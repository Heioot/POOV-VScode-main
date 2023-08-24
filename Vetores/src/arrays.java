import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;


public class arrays {
    public static void main(String[] args) throws Exception {

    // a) Criar um vetor de tamanho 20 de inteiros

        ArrayList<Integer> vetor = new ArrayList<Integer>();


    // b) Preencher os 10 primeiros valores do vetor com números digitados pelo usuário via teclado

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            vetor.add(s.nextInt());
        }


        System.out.println(vetor.toString());

    // c) Preencher os 10 últimos valores do vetor com números aleatórios entre 1 e 100
        for(int i = 10; i < 20; i++){
            vetor.add(r.nextInt(100) + 1);
        }

    // d) Mostrar o vetor inteiro na tela

    System.out.println("Vetor inteiro: ");
    System.out.println(vetor.toString());



    // e) Mostrar o vetor de trás para frente na tela

    System.out.println("Vetor inteiro de trás pra frente: ");
    for(int i = vetor.size() - 1; i >= 0; i--){
        System.out.print(vetor.get(i) + " ");
    }



    // f) Calcular e mostrar a média dos valores do vetor

    int soma = 0;

    for(int i = 0; i < vetor.size(); i++){
        soma += vetor.get(i);
    }

    double media = (double)(soma/vetor.size());

    System.out.println("Media: " + media);

    // g) Encontrar e mostrar o maior valor e o menor valor do vetor 

    System.out.println("maior valor: ");
    int maior = 0, menor = 0;

    for(int i = 0; i < vetor.size(); i++){
        if (maior < vetor.get(i)){
            maior = vetor.get(i);
        }
    }

    System.out.println("menor valor: ");
    for(int i = 0; i < vetor.size(); i++){
        if (menor > vetor.get(i)){
            menor = vetor.get(i);
        }
    }

    // h) Mostrar os valores das posições impares do vetor


    System.out.print("\n");
    System.out.println("Posicoes impares: ");
    for(int i = 0; i < vetor.size(); i++){
        if(i % 2 == 0){
            System.out.print(i + " ");
        }
    }

    // i) Mostrar os valores das posições pares do vetor

    System.out.print("\n");
    System.out.println("Posicoes pares: ");
    for(int i = 0; i < vetor.size(); i ++){
        if(i % 2 == 1){
            System.out.print(i + " ");
        }
    }

    // j) Mostrar os valores pares do vetor


    System.out.print("\n");
    System.out.println("Valores Posicoes pares: ");
    for(int i = 0; i < vetor.size(); i++){
        if(vetor.get(i) % 2 == 0){
            System.out.print(vetor.get(i) + " ");
        }
    }




    // k) Mostrar os valores ímpares do vetor

    System.out.print("\n");
    System.out.println("Valores Posicoes impares: ");
    for(int i = 0; i < vetor.size(); i ++){
        if(vetor.get(i) % 2 == 1){
            System.out.print(vetor.get(i) + " ");
        }
    }


    // l)Verificar se há elementos repetidos no vetor e exibir uma mensagem em caso afirmativo
    boolean contem = true;
    for(int i = 0; i < vetor.size(); i++){
        boolean possui = vetor.contains(vetor.get(i));
        if (possui){
            contem = true;
        } else{

            contem = false;
        }
    }
    System.out.print("\n");
        if(contem){
        System.out.println("Há elementos repetidos");
    }





    // m) Solicitar um valor ao usuário e verificar se esse valor existe no vetor. Se existir exibir a posição em que ele está, senão exibir uma mensagem de valor não encontrado 
            
    int valor = 0;
    boolean contem2 = true;
    int posicao = 0;

    for(int i = 0; i < vetor.size(); i++){
        if (valor == vetor.get(i)){
            contem2 = true;
            posicao = vetor.indexOf(valor);
        } else{
            contem2 = false;
        }
    }

    if (contem2){
        System.out.println("Existe na posição: " + posicao);   
    } else {

        System.out.println("Não existe!");
    }

    // n) Verificar se o vetor está em ordem crescente, ou seja, se a[0] <= a[1] <= a[2] <= ... para todos elementos do vetor

    ArrayList<Integer> vetorcopia = new ArrayList<Integer>(20);

    for(int i = 0; i < vetor.size(); i++){
        vetorcopia.add(vetor.get(i));
    }

    Collections.sort(vetorcopia);

    if(vetor.equals(vetorcopia)){
        System.out.println("O vetor está em ordem crescente");
    } else {
        System.out.println("O vetor não está em ordem crescente");
    }

    System.out.println("Vetor copia: " + vetorcopia.toString());

    System.out.println("Vetor: " + vetor.toString());

     s.close();
    }
}