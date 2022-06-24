package br.com.aula10.daoController;

import br.com.aula10.beansModel.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoDao {

    //Usar collections para "simular" um BD
    List<Veiculo> bancoDeVeiculos=new ArrayList<Veiculo>();

    public VeiculoDao(){}

    public boolean conectarBD(String URLConexao){
        //Neste ponto é elaborado o código para estabelecer uma conexão com o BD.
        return true;
    }

    public boolean incluir(Veiculo v){
        //salvar no BD
        if(conectarBD("url Teste MySQL")){
            System.out.println("Erro de conexão BD");
            return false;
        }
        bancoDeVeiculos.add(v);
        System.out.println("--log: Salvo BD");
        return true;
    }

    public Veiculo consultaPorPlaca(String placa) {
        //consulta no BD
        if(!conectarBD("url Teste SQL")){
            System.out.println("Erro de conexão BD");
            //return false
        }

        for(Veiculo item : bancoDeVeiculos){
            if(item.getPlaca().equalsIgnoreCase(placa)){
                return item;
            }
        }
        return null;
    }

    public boolean alterar(Veiculo veiculoLocalizado) {
        //consulta no BD
        if(!conectarBD("url Teste SQL")) {
            System.out.println("Erro de conexão BD");
            //return false
        }
        for(Veiculo item : bancoDeVeiculos){
            if(item.getPlaca().equalsIgnoreCase(veiculoLocalizado.getPlaca())){
                bancoDeVeiculos.remove(item);
                bancoDeVeiculos.add(veiculoLocalizado);
                return true;
            }
        }
        return false;
    }

    public boolean excluir(Veiculo veiculoLocalizado) {
        // excluir no BD
        if (!conectarBD("url Teste SQL")) {
            System.out.println("Erro de conexão BD");
            //return false
        }

        return bancoDeVeiculos.remove(veiculoLocalizado);
    }
}
