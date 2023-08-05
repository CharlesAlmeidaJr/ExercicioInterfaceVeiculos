package app;

import java.util.ArrayList;
import java.util.Scanner;

import veiculo.modelo.Caminhao;
import veiculo.modelo.Onibus;
import veiculo.modelo.VeiculoBase;

public class Principal {
    public static void main(String[] args) {
        ArrayList<VeiculoBase> veiculos = new ArrayList<VeiculoBase>();

        String opcao, placa;
        int ano = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Opções:\n1 - Adicionar onibus\n2 - Adicionar caminhão\n3 - Mostrar todos\n4 - Sair");
            opcao = scan.next();

            switch(opcao){
                case "1":        
                    try {
                        System.out.println("Digite a placa:");
                        placa = scan.next();

                        System.out.println("Digite o ano de fabricação:");
                        ano = scan.nextInt();

                        System.out.println("Digite o número de assentos:");       
                        int assentos = scan.nextInt();

                        veiculos.add(new Onibus(placa, ano, assentos));
                    } catch (Exception e) {
                        opcao = "0";
                    }

                break;

                case "2":
                    try {
                        System.out.println("Digite a placa:");
                        placa = scan.next();

                        System.out.println("Digite o ano de fabricação:");
                        ano = scan.nextInt();

                        System.out.println("Digite o número de eixos:");       
                        int eixos = scan.nextInt();

                        veiculos.add(new Caminhao(placa, ano, eixos));
                    } catch (Exception e) {
                        opcao = "0";
                    }
                break;

                case "3":
                    if(veiculos.size() == 0){
                        System.out.println("Sem veiculos registrados");
                    }
                    else{
                        System.out.println("Veículos registrados:\n");
                        for (VeiculoBase veiculoBase : veiculos) {
                            veiculoBase.exibirDados();
                        }
                    }
                break;

                case "4":
                    System.out.println("Fechando programa");
                break;

                default:
                    System.out.println("Opção inválida");
                break;
            }

        }while(!opcao.equals("4"));

        scan.close();
    }
}
