package sistemasinteligentes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SistemasInteligentes extends Mapa{

    public static void main(String[] args) {
        ArrayList<Estado> estadosExplorados = new ArrayList();   //fechada
        ArrayList<Estado> estadosNaoExplorados = new ArrayList();   //aberta
        Mapa mapa = new Mapa();        
        Map<Integer, Estado> unidadesDeSaude = mapa.getUnidadesDeSaude();
        Map<Integer, Double> percursoFinal = new HashMap<Integer, Double>();
        Log log = new Log();
                
        Map<Integer, ArrayList<Estado>> distancias = new HashMap<Integer, ArrayList<Estado>>();
          
        Estado inicial = mapa.getEstadoInicial();
        estadosNaoExplorados.add(inicial);
        
        while (!unidadesDeSaude.isEmpty()) {
            ArrayList<Estado> caminho;
            Map<Double, Integer> menorCusto = new HashMap<Double, Integer>();
            menorCusto.put(999999999.0,0);
            Double custo = 0.0;
            Estado atual;
            
            if (inicial.getId() == 0) {
                atual = null;
            } else {
                atual = inicial;
                estadosNaoExplorados.add(atual);
            } 
            
            //estadosNaoExplorados.add(atual);
            
            for (Map.Entry<Integer, Estado> us: unidadesDeSaude.entrySet()) {
                caminho = AEstrela.encontraMelhorCaminho(mapa, estadosNaoExplorados, estadosExplorados, us.getValue().getId());
                distancias.put(us.getValue().getId(), caminho);
                
                for (Estado rota: caminho) {
                    custo += rota.getCustoTempo();
                }
               
                for (Map.Entry<Double, Integer> c: menorCusto.entrySet()) {
                    if (custo < c.getKey()) {
                        menorCusto.remove(c.getKey());
                        menorCusto.put(custo, us.getValue().getId());
                    }
                }
                        
                estadosExplorados.clear();
                estadosNaoExplorados.clear();
                estadosNaoExplorados.add(atual);
            }
            
            ArrayList<Estado> caminhoEscolhido = distancias.get(menorCusto.get(custo));
            inicial = caminhoEscolhido.get(caminhoEscolhido.size());
            distancias.clear();
            log.geraLogCaminhoEscolhido(caminhoEscolhido, custo);
            unidadesDeSaude.remove(menorCusto.get(custo));
            percursoFinal.put(menorCusto.get(custo), custo);
        }
        
        log.geraLogFinal(percursoFinal);
    }
}
