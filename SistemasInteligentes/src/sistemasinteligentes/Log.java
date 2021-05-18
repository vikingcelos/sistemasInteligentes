package sistemasinteligentes;

import java.util.ArrayList;
import java.util.Map;

public class Log {
    private Info info = new Info();
        
    public void geraLogCaminhoEscolhido(ArrayList<Estado> caminhoEscolhido, Double custo) {
        System.out.println("***************************************************************************************");
        System.out.println("US escolhida: " + info.getEnderecos().get(caminhoEscolhido.size()).getNome());
        System.out.println("Passou por : ");
        for (Estado e: caminhoEscolhido) {
            System.out.println(info.getEnderecos().get(e.getId()).getNome() + " - Distancia: " + e.getDistancia() + " Custo de tempo: " + e.getCustoTempo());
        }
        System.out.println("Custo total: " + custo);
        System.out.println("***************************************************************************************");
    }
    
    public void geraLogFinal(Map<Integer, Double> caminhoFinal) {
        for (Map.Entry<Integer, Double> us: caminhoFinal.entrySet()) {
            System.out.println("***************************************** FINAL *********************************************");
            System.out.println("US: " + info.getEnderecos().get(us.getKey()).getNome() + " Custo: " + us.getValue());
            System.out.println("***************************************************************************************");
        }
    }
    
}
