package sistemasinteligentes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Random;

public class AEstrela {
    public static int VELOCIDADE_MEDIA = 60;
    public static int EARTH_RADIUS_KM = 6371;

    
    public static double calculaFuncaoAvaliacao(Integer estadoAtual, Estado estado, Mapa mapa) {
       Random r = new Random();
       Double custo = 0.0;
       Coordenada inicio;
       Coordenada fim;
       if (estadoAtual == 0) {
            inicio = mapa.getCoordenadas().get(estadoAtual +1);
       } else {
            inicio = mapa.getCoordenadas().get(estadoAtual);
       }
       
       if (estado.getId() == 0) {
            fim = mapa.getCoordenadas().get(estado.getId() +1);
       } else {
            fim = mapa.getCoordenadas().get(estado.getId());
       }
       
       /*if ((r.nextInt(5) + 1) == 1) {
           Integer efeito =  r.nextInt(4) + 1;
           
           switch (efeito) {
               case 1:
                   custo = estado.getCustoTempo() + (estado.getDistancia() + calculaDistanciaLinhaReta(inicio.getLatitude(), inicio.getLongitude(), fim.getLatitude(), fim.getLongitude())) / EfeitoExterno.VELOCIDADE_CHUVA.toInt();
                   break;
               case 2:
                     custo = estado.getCustoTempo() + (estado.getDistancia() + calculaDistanciaLinhaReta(inicio.getLatitude(), inicio.getLongitude(), fim.getLatitude(), fim.getLongitude())) / EfeitoExterno.VELOCIDADE_ENGARRAFAMENTO.toInt();
                   break;
               case 3:
                   custo = estado.getCustoTempo() + (estado.getDistancia() + calculaDistanciaLinhaReta(inicio.getLatitude(), inicio.getLongitude(), fim.getLatitude(), fim.getLongitude())) / EfeitoExterno.VELOCIDADE_HORARIO_PICO.toInt();
                   break;
               case 4:
                   custo = estado.getCustoTempo() + (estado.getDistancia() + calculaDistanciaLinhaReta(inicio.getLatitude(), inicio.getLongitude(), fim.getLatitude(), fim.getLongitude())) / EfeitoExterno.VELOCIDADE_ACIDENTE.toInt();
                   break;
           }

       } else {
           */custo = estado.getCustoTempo() + (estado.getDistancia() + calculaDistanciaLinhaReta(inicio.getLatitude(), inicio.getLongitude(), fim.getLatitude(), fim.getLongitude())) / VELOCIDADE_MEDIA;
       //}
        System.out.println("Para ir de " + estadoAtual + " até " + estado.getId() + " :");
        System.out.println("Distancia: " + estado.getDistancia());
        System.out.println("Distancia linha reta: " + calculaDistanciaLinhaReta(inicio.getLatitude(), inicio.getLongitude(), fim.getLatitude(), fim.getLongitude()));
        System.out.println("Custo: " + custo);
        System.out.println("Custo acumulado: " + estado.getCustoTempo());
        System.out.println("****************************************************");
       return custo;
    }
        
    public static Estado getEstadoMenorCusto(ArrayList<Estado> estados, Mapa mapa) {
        Estado estadoMenorCusto = null;
        Double custo = 99999999.0;
        Double fn;

        for (Estado estado: estados) {
            fn = estado.getCustoTempo();
            if (fn < custo) {
                custo = fn;
                estadoMenorCusto = estado;
            }
        }
        
        Estado teste = mapa.getMapa().get(estadoMenorCusto.getId());
        Estado novo = new Estado(estadoMenorCusto.getId(), estadoMenorCusto.getDistancia(), estadoMenorCusto.getPai());
        novo.setCustoTempo(custo);
     
        for (Estado es: teste.getVizinhos()) {
            novo.getVizinhos().add(new Estado(es.getId(), es.getDistancia(), es.getPai()));
        }
        
        return novo;
    }
    
    public static ArrayList<Estado> encontraMelhorCaminho (Mapa mapa, ArrayList<Estado> estadosNaoExplorados, ArrayList<Estado> estadosExplorados, Integer usDestino) {
        boolean encontrou = false;
        Estado estadoAtual;
        ArrayList<Estado> caminho = new ArrayList<Estado>();
                
        while (!encontrou) {
            estadoAtual = getEstadoMenorCusto(estadosNaoExplorados, mapa);
            estadosNaoExplorados.remove(estadoAtual);
            estadosExplorados.add(estadoAtual);

            if (estadoAtual.getId() == usDestino) {
                Estado e = estadoAtual;
                while (e.getPai() != null){
                    caminho.add(e);
                    e = e.getPai();
                }
                caminho.add(e);
                Collections.reverse(caminho);

                return caminho;
            }

            /*if (estadosNaoExplorados.isEmpty()) {
                encontrou = true;
            }     */
            
            //adiciona na lista aberta os vizinhos do no atual
            for (Estado vizinho: estadoAtual.getVizinhos()) {
                double custo;
                if (vizinho.getId() != 0 || vizinho.getId() != estadoAtual.getPai().getId()) {
                   custo = calculaFuncaoAvaliacao(estadoAtual.getId(), vizinho, mapa);
                } else {
                    continue;
                }
                //double custo = calculaFuncaoAvaliacao(estadoAtual.getId(), vizinho, mapa);

                if (estadosExplorados.contains(vizinho)) {
                    continue;
                }

                if (estadosNaoExplorados.contains(vizinho)) {
                    if (vizinho.getCustoTempo() > custo) {
                        vizinho.setPai(estadoAtual);
                        vizinho.setCustoTempo(custo);
                        estadosNaoExplorados.get(vizinho.getId()).setCustoTempo(custo);
                    }
                } else {
                    vizinho.setPai(estadoAtual);
                    vizinho.setCustoTempo(custo);
                    estadosNaoExplorados.add(vizinho);
                }
            }
        }
        return null;
    }
    
    public static double calculaDistanciaLinhaReta (Double latitude1, Double longitude1, Double latitude2, Double longitude2) {
        // Conversão de graus pra radianos das latitudes
        double firstLatToRad = Math.toRadians(latitude1);
        double secondLatToRad = Math.toRadians(latitude2);

        // Diferença das longitudes
        double deltaLongitudeInRad = Math.toRadians(longitude2
        - longitude1);

        // Cálcula da distância entre os pontos
        return Math.acos(Math.cos(firstLatToRad) * Math.cos(secondLatToRad) * Math.cos(deltaLongitudeInRad) + Math.sin(firstLatToRad) * Math.sin(secondLatToRad)) * EARTH_RADIUS_KM;
    }
}
