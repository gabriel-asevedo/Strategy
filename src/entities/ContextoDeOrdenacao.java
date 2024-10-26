package entities;

import service.EstrategiaOrdenacao;

import java.util.List;

public class ContextoDeOrdenacao {
    private EstrategiaOrdenacao estrategia;

    public void setEstrategia(EstrategiaOrdenacao estrategia) {
        this.estrategia = estrategia;
    }

    public void executarOrdenacao(List<Integer> numeros) {
        if (estrategia != null) {
            estrategia.ordenar(numeros);
        } else {
            System.out.println("Nenhuma estratégia de ordenação definida.");
        }
    }
}