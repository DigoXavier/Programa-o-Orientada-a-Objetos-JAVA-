package br.com.aula10.implementacaoView;

import br.com.aula10.beansModel.Veiculo;
import br.com.aula10.daoController.VeiculoDao;
import br.com.aula10.util.EntradaTela;

public class ExecutarVeiculo {
    public static void main(String[] args) {
        String opcao;
        Veiculo v=new Veiculo();
        VeiculoDao veiculoDao = new VeiculoDao();
        String placa;
        Veiculo veiculoLocalizado = new Veiculo();
        do {
            opcao = EntradaTela.texto("==== Controle de veículos ==== \n\n" + "Escolha a opção: \n"
                    + "<I>ncluir \n<A>lterar \n<C>onsultar \n<E>xcluir \n<S>air");

            switch(opcao.charAt(0)){
                case 'I':
                    //incluir
                    v = new Veiculo( EntradaTela.texto("Placa"),
                                     EntradaTela.texto("Modelo"),
                                     EntradaTela.texto("Potencia"),
                                     EntradaTela.texto("Proprietario"));
                    veiculoDao.incluir(v);
                    break;
                case 'A':
                    //alterar
                    placa = EntradaTela.texto("Digite a placa para alteração: ");

                    veiculoLocalizado = veiculoDao.consultaPorPlaca(placa);

                    if(veiculoLocalizado==null){
                        EntradaTela.show("Veiculo não localizado...");
                        break;
                    }
                    veiculoLocalizado.setPotencia(EntradaTela.inteiro("Potencia"));
                    veiculoLocalizado.setProprietario(EntradaTela.texto("Potencia"));

                    veiculoDao.alterar(veiculoLocalizado);
                    break;
                case 'C':
                    //consultar
                    placa = EntradaTela.texto("Digite a placa: ");

                    veiculoLocalizado= veiculoDao.consultaPorPlaca(placa);
                    EntradaTela.show("==== Dados do Veiculo ==== \n\n"
                    + "\nPlaca: " + veiculoLocalizado.getPlaca()
                    + "\nModelo: " + veiculoLocalizado.getModelo()
                    + "\nPotencia: " + veiculoLocalizado.getPotencia()
                    + "\nProprietario: " + veiculoLocalizado.getProprietario()
                    );
                    break;
                case 'E':
                    //excluir
                    placa = EntradaTela.texto("Digite a placa: ");

                    veiculoLocalizado= veiculoDao.consultaPorPlaca(placa);

                    if(veiculoLocalizado == null){
                        EntradaTela.show("Veiculo não localizado...");
                        break;
                    }

                    if(!veiculoDao.excluir(veiculoLocalizado)){
                        EntradaTela.show("Erro ao executar a exclusão..");
                    } else {
                        EntradaTela.show("Veiculo excluido com sucesso...");
                    }

                    break;
                case 'S':
                    //sair do programa
                    break;
                default:
                    EntradaTela.show("Voce precisa digitar as iniciais do menu..!!");
            }

        } while (!opcao.equalsIgnoreCase("S"));
    }
}
