package br.com.aula8.implementacao;

import java.util.HashMap;
import java.util.Map;

public class ExecutarFuncionario {
    public static void main(String[] args) {
        Map<Integer, String> h_map = new HashMap<Integer,String>();

        // adicionar

        h_map.put(10,"azul");
        h_map.put(5,"preto");
        h_map.put(20,"verde");

        h_map.put(5, "branco");

        // listar
        System.out.println(h_map);
        System.out.println("Lista de CHAVES: " + h_map.keySet());
        System.out.println("Lista de CHAVES: " + h_map.values());

        for(Map.Entry item: h_map.entrySet()){
            System.out.println("Conteúdo: " + item.getKey() + " - " + item.getValue());
        }

        // procura elements
        System.out.println("Tem a chave 20? " + h_map.containsKey(20));
        System.out.println("Tem a cor cinza? " + h_map.containsKey("cinza"));

        System.out.println("Obter o valor armazenado na chave 20" + h_map.get(20));

        // remover
        System.out.println("Remover chave 20: " + h_map.remove(20));
        System.out.println(h_map);
    }
}
