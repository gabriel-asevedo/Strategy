package entities;

import service.EstrategiaOrdenacao;

import java.util.List;

public class OrdenacaoSelectionSort implements EstrategiaOrdenacao {

    @Override
    public void ordenar(List<Integer> numeros) {
        int n = numeros.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros.get(j) < numeros.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = numeros.get(minIndex);
            numeros.set(minIndex, numeros.get(i));
            numeros.set(i, temp);
        }
    }
}