package catchau;

import java.util.Scanner;
import catchau.Carro.Modelo;
import catchau.Carro.Preco;
import catchau.Promocao.Cupom;
import java.util.ArrayList;

class Catchau {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, cpf;
        ArrayList<Cliente> clientes = new ArrayList();
        CadastroCliente C = new CadastroCliente();
        Locadora locadora = Locadora.getInstance();
        Modelo[] m = Modelo.values();
        Preco[] p = Preco.values();
        Cupom cm = Cupom.CUPOM1;
        Cliente c;
        int menu, login;
        do {
            locadora.login();
            login = in.nextInt();
            in.nextLine();
            switch (login) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    nome = in.nextLine();
                    System.out.println("Digite o cpf do cliente: ");
                    cpf = in.next();
                    if (C.consultarCliente(clientes, nome, cpf) == true) {
                        do {
                            System.out.println("OPÇÕES");
                            locadora.menu();
                            menu = in.nextInt();
                            in.nextLine();
                            switch (menu) {
                                case 1://EXIBE LISTA DE CARROS
                                    System.out.println("Esta é a lista de carros");
                                    locadora.exibModelo(m);
                                    break;
                                case 2://ALUGAR UM VEICULO
                                    System.out.println("Tabela de modelos e preços");
                                    locadora.exibModPre(m, p);
                                    System.out.println("");
                                    locadora.alugarCarro(m, p, clientes, nome, cpf);
                                    break;
                                case 3:
                                    locadora.devolverVeiculo(clientes, nome, cpf);
                                    break;
                                case 4:
                                    locadora.renovarCar(clientes, nome, cpf);
                                    break;
                                case 5:
                                    C.remover(clientes, nome, cpf);
                                    break;
                                case 6:
                                    locadora.disconto(m, p, cm, nome, cpf, clientes, locadora);
                                    break;
                                case 7://DEPOSITAR
                                    System.out.println("Digite o valor que vai depositar");
                                    double valorDeposito = in.nextDouble();
                                    locadora.depositar(clientes, valorDeposito, nome, cpf);
                                    break;
                                case 8:
                                //exibir info do cliente
                                    break;

                                case 0:
                                    System.out.println("Programa encerrado");
                                    break;
                                default:
                                    System.out.println("OPERAÇÃO INVALIDA!");
                            }
                        } while (menu != 0);
                        break;
                    } else {
                        System.out.println("Cliente não encontrado");
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do cliente: ");
                    nome = in.nextLine();
                    System.out.println("Digite o cpf do cliente: ");
                    cpf = in.nextLine();
                    c = new Cliente(nome);
                    c.setNome(nome);
                    C.cadastroCliente(c, clientes, nome, cpf);
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Selecione uma das opções");
                    break;
            }
        } while (login != 0);
    }
}
