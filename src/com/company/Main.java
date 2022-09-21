package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cliente> clienteList = new ArrayList<>();

    public static void main(String[] args) {
        int contador = 0;
        TITO:
        while (true) {
            contador++;
            System.out.println("Quantas vezes você entrou ---> " + contador);
            System.out.println("");
            System.out.println("Você deseja continuar ou sair do loop?");
            System.out.println("Para sair Digite (1)");
            System.out.println("Para adicionar um novo cliente digite (2)");
            System.out.println("Para remover um cliente digite (3)");
            System.out.println("Para ver as informaçoes de um cliente especifico digite (4)");
            System.out.println("Para ver a lista de clientes digite (5)");
            System.out.println("Para atualizar a idade do cliente digite (6)");
            Scanner scanner = new Scanner(System.in);
            int opcaoEscolhida = scanner.nextInt();
            if (opcaoEscolhida == 1) {
                System.out.println("Volte sempre !");
                break TITO;
            }
            if (opcaoEscolhida == 2) {
                Cliente cliente = new Cliente();
                System.out.println("LOAD ...");
                Scanner atributosDoCliente = new Scanner(System.in);
                System.out.println("Informe o nome do cliente");
                cliente.nome = atributosDoCliente.nextLine();
                System.out.println("Informe a idade do cliente");
                cliente.idade = atributosDoCliente.nextInt();
                clienteList.add(cliente);
                System.out.println("Cliente adicionado com êxito!");
                System.out.println("------------------------------");
                if(cliente.idade > 65){
                    cliente.aposentadoria = "R$2000,00";
                }
            }
            if (opcaoEscolhida == 3) {
                System.out.println("LOAD ...");
                for (int i = 0; i <= clienteList.size(); i++) {
                    System.out.println("Informe o nome do cliente que deseja remover");
                    Scanner nomeExcluir = new Scanner(System.in);
                    String nomeD = nomeExcluir.nextLine();
                    if (nomeD.equals(clienteList.get(i).nome)) {
                        clienteList.remove(i);
                        System.out.println("Cliente removido com êxito");
                        continue TITO;
                    }
                }
            }
            if (opcaoEscolhida == 4) {
                System.out.println("LOAD ...");
                System.out.println("Informe o nome do cliente");
                Scanner nomeEsp = new Scanner(System.in);
                String nomeDig = nomeEsp.nextLine();
                for (Cliente c : clienteList) {
                    if (c.nome.equals(nomeDig)) {
                        System.out.println(c.nome);
                        System.out.println(c.idade);
                        System.out.println(c.aposentadoria);
                    }
                }
            }
            if (opcaoEscolhida == 5) {
                System.out.println("LOAD ...");
                for (Cliente a : clienteList) {
                    System.out.println(a.nome);
                    System.out.println(a.idade);
                    System.out.println(a.aposentadoria);
                    System.out.println("--------------------");
                }
            }
            if (opcaoEscolhida == 6) {
                System.out.println("LOAD ...");
                    System.out.println("Informe o nome do cliente");
                    Scanner mudarIdade = new Scanner(System.in);
                    String novaIdade = mudarIdade.nextLine();

                    for(int g = 0; g < clienteList.size(); g++){
                        if(novaIdade.equals(clienteList.get(g).nome)){
                            System.out.println("Informe a nova idade do cliente " + clienteList.get(g).nome);
                            int idadeMudada = mudarIdade.nextInt();
                            clienteList.get(g).idade = idadeMudada;

                            Cliente idade = new Cliente();
                            if(idadeMudada > 65){
                                idade.aposentadoria = "R$2000,00";
                            }

                            for (Cliente a : clienteList) {
                                System.out.println(a.nome);
                                System.out.println(a.idade);
                                System.out.println(a.aposentadoria);
                                System.out.println("----------");

                            }
                        }
                    }

                }

        }
        for (Cliente a : clienteList) {
            System.out.println(a.nome);
            System.out.println(a.idade);
            System.out.println(a.aposentadoria);
            System.out.println("----------");
        }
    }
}