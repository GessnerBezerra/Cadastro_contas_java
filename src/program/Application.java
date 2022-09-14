package program;

import model.Cliente;
import model.Conta;
import model.PessoaFisica;
import model.PessoaJuridica;

import javax.swing.*;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        Integer codigo, numero, opcao, resposta;
        String cidade, estado, cnpj, razaoS, cpf, nome;
        Double saldo, valor;
        boolean sacou;
        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        PessoaJuridica pj;
        PessoaFisica pf;

       // System.out.println("Digite a cidade: ");
        cidade = JOptionPane.showInputDialog(null, "Digite a cidade: ");


        //System.out.println("Digite o estado: ");
        estado = JOptionPane.showInputDialog(null, "Digite o estado: ");

        codigo = gerador.nextInt(200);


        //System.out.println("Qual tipo de conta você deseja criar? 1- Pessoa Jurídica | 2- Pessoa Física ");
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual tipo de conta você deseja criar? 1- Pessoa Jurídica | 2- Pessoa Física "));

        if(opcao == 1){
            //System.out.println("Digite o cnpj: ");
            cnpj = JOptionPane.showInputDialog(null, "Digite o cnpj: ");
            //System.out.println("Digite a razão social: ");
            razaoS = JOptionPane.showInputDialog(null, "Digite a razão social: ");

            pj = new PessoaJuridica(codigo,cidade,estado, cnpj, razaoS);

            numero = gerador.nextInt(200);

            conta = new Conta(numero, pj, 0.0);
            //ystem.out.println(conta.listarDados());
            JOptionPane.showMessageDialog(null, conta.listarDados());

        } else if(opcao == 2){
            //System.out.println("Digite o cpf: ");
            cpf = JOptionPane.showInputDialog(null, "Digite o cpf: ");
            //System.out.println("Digite o nome: ");
            nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");

            pf = new PessoaFisica(codigo,cidade,estado, cpf, nome);

            numero = gerador.nextInt(200);

            conta = new Conta(numero, pf, 0.0);
            //System.out.println(conta.listarDados());
            JOptionPane.showMessageDialog(null, conta.listarDados());

        } else{
            //System.out.println("Opção inválida");
            JOptionPane.showMessageDialog(null, "Opção Inválida");
            return;
        }

        do{
            //System.out.println("O que você deseja fazer? 1- Sacar | 2- Depositar | 3- sair");
            resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "O que você deseja fazer? 1- Sacar | 2- Depositar | 3- sair"));

            switch (resposta){
                case 1:
                    //System.out.println("Digite o valor que deseja sacar: ");
                    valor = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o valor que deseja sacar: "));

                    sacou =  conta.sacar(valor);

                    if(sacou){
                        //System.out.println(conta.getSaldoFormatado());
                        JOptionPane.showMessageDialog(null, conta.getSaldoFormatado());


                    }else{
                        //System.out.println(" Operação inválida, valor do saque maior que o saldo!");
                        JOptionPane.showMessageDialog(null, "Operação inválida, valor do saque maior que o saldo!");
                    }
                    break;
                case 2:
                    //System.out.println("Digite o valor que deseja depositar: ");
                    valor = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar: "));

                    conta.depositar(valor);

                    //System.out.println(conta.getSaldoFormatado());
                    JOptionPane.showMessageDialog(null, conta.getSaldoFormatado());


                    break;
                case 3:
                    //System.out.println("Finalizando programa ...");
                    JOptionPane.showMessageDialog(null, "Finalizando programa ...");
                    break;
                default:
                    //System.out.println("Opção inválida");
                    JOptionPane.showMessageDialog(null, "Opção inválida ...");

            }


        }while(resposta !=3);

    }
}
