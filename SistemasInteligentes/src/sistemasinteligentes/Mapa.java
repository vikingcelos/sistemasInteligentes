package sistemasinteligentes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    private Map<Integer, Estado> unidadesDeSaude;
    private Map<Integer, Estado> mapa;
    private Estado inicial;
    private Estado us1;
    private Estado us2;
    private Estado us3;
    private Estado us4;
    private Estado us5;
    private Estado us6;
    private Estado us7;
    private Estado us8;
    private Estado us9;
    private Estado us10;

    /*pontos intermediarios*/
    private Estado pi1; 
    private Estado pi2;
    private Estado pi3;
    private Estado pi4;
    private Estado pi5;
    private Estado pi6;
    private Estado pi7;
    private Estado pi8;
    private Estado pi9;
    private Estado pi10;
    private Estado pi11; 
    private Estado pi12;
    private Estado pi13;
    private Estado pi14;
    private Estado pi15;
    private Estado pi16;
    private Estado pi17;
    private Estado pi18;
    private Estado pi19;
    private Estado pi20;
    private Estado pi21;
    private Estado pi22;
    private Estado pi23;
    private Estado pi24;
    private Estado pi25;
    private Estado pi26;
    
    private Map<Integer, Coordenada> coordenadas;
    
    
    public Mapa () {
        mapa = new HashMap<Integer, Estado>();
        coordenadas = new HashMap<Integer, Coordenada>();
        
        criaPontoDePartida();
        criaUnidadesDeSaude();
        criaPontosIntermediarios();
        criaRotasUs();
        criaRotasPontosIntermediarios();
    }
    
    public void criaPontoDePartida () {
        inicial = new Estado(0);
        inicial.setPai(null);
    }
    
    public void criaUnidadesDeSaude () {
        unidadesDeSaude = new HashMap<Integer, Estado>();       
               
        us1 = new Estado(1);
        getCoordenadas().put(us1.getId(), new Coordenada(-25.452001089056733, -49.217399381620766));
        us2 = new Estado(2);
        getCoordenadas().put(us2.getId(), new Coordenada(-25.400561550133805, -49.238574191348214));
        us3 = new Estado(3);
        getCoordenadas().put(us3.getId(), new Coordenada(-25.413286307968185, -49.30041397970445));
        us4 = new Estado(4);
        getCoordenadas().put(us4.getId(), new Coordenada(-25.426367239614944, -49.276041101141544));
        us5 = new Estado(5);
        getCoordenadas().put(us5.getId(), new Coordenada(-25.461568368851545, -49.31625517545841));
        us6 = new Estado(6);
        getCoordenadas().put(us6.getId(), new Coordenada(-25.48011070446666, -49.33569736251092));
        us7 = new Estado(7);
        getCoordenadas().put(us7.getId(), new Coordenada(-25.56591360308263, -49.332524904837996));
        us8 = new Estado(8);
        getCoordenadas().put(us8.getId(), new Coordenada(-25.537426451142537, -49.27273700244306));
        us9 = new Estado(9);
        getCoordenadas().put(us9.getId(), new Coordenada(-25.497109537650136, -49.22678432388108));
        us10 = new Estado(10);
        getCoordenadas().put(us10.getId(), new Coordenada(-25.478660185918027, -49.27176740668939));
        
        unidadesDeSaude.put(1, us1);
        unidadesDeSaude.put(2, us2);
        unidadesDeSaude.put(3, us3);
        unidadesDeSaude.put(4, us4);
        unidadesDeSaude.put(5, us5);
        unidadesDeSaude.put(6, us6);
        unidadesDeSaude.put(7, us7);
        unidadesDeSaude.put(8, us8);
        unidadesDeSaude.put(9, us9);
        unidadesDeSaude.put(10, us10);
    }
    
    public void criaPontosIntermediarios () {
        pi1 = new Estado(101);
        coordenadas.put(pi1.getId(), new Coordenada(-25.410419746332064, -49.24917532584811));
        pi2 = new Estado(102);
        coordenadas.put(pi2.getId(), new Coordenada(-25.424005546977092, -49.26200144664094));
        pi3 = new Estado(103);
        coordenadas.put(pi3.getId(), new Coordenada(-25.428067904870286, -49.240477529455376));
        pi4 = new Estado(104);
        coordenadas.put(pi4.getId(), new Coordenada(-25.435796884445324, -49.24538563077844));
        pi5 = new Estado(105);
        coordenadas.put(pi5.getId(), new Coordenada(-25.424237408628553, -49.28741918659679));
        pi6 = new Estado(106);
        coordenadas.put(pi6.getId(), new Coordenada(-25.431653445987546, -49.29728658845138));
        pi7 = new Estado(107);
        coordenadas.put(pi7.getId(), new Coordenada(-25.433999347920885, -49.29182730194206));
        pi8 = new Estado(108);
        coordenadas.put(pi8.getId(), new Coordenada(-25.43669647559134, -49.274205457759805));
        pi9 = new Estado(109);
        coordenadas.put(pi9.getId(), new Coordenada(-25.46162881450107, -49.288238444268586));
        pi10 = new Estado(110);
        coordenadas.put(pi10.getId(), new Coordenada(-25.45934561853983, -49.272848657759404));
        pi11 = new Estado(111);
        coordenadas.put(pi11.getId(), new Coordenada(-25.45305967288296, -49.23885944464926));
        pi12 = new Estado(112);
        coordenadas.put(pi12.getId(), new Coordenada(-25.47014248986394, -49.23996699030562));
        pi13 = new Estado(113);
        coordenadas.put(pi13.getId(), new Coordenada(-25.47884560528086, -49.21576270194138));
        pi14 = new Estado(114);
        coordenadas.put(pi14.getId(), new Coordenada(-25.48825310657033, -49.22296664426808));
        pi15 = new Estado(115);
        coordenadas.put(pi15.getId(), new Coordenada(-25.469380611454625, -49.30464903845068));
        pi16 = new Estado(116);
        coordenadas.put(pi16.getId(), new Coordenada(-25.484918970708517, -49.30217444241324));
        pi17 = new Estado(117);
        coordenadas.put(pi17.getId(), new Coordenada(-25.48974683312726, -49.28314373077735));
        pi18 = new Estado(118);
        coordenadas.put(pi18.getId(), new Coordenada(-25.486675903902153, -49.2947311884502));
        pi19 = new Estado(119);
        coordenadas.put(pi19.getId(), new Coordenada(-25.515969400641705, -49.32192635775839));
        pi20 = new Estado(120);
        coordenadas.put(pi20.getId(), new Coordenada(-25.51621304105243, -49.277202350568636));
        pi21 = new Estado(121);
        coordenadas.put(pi21.getId(), new Coordenada(-25.529219257242403, -49.28850681543094));
        pi22 = new Estado(122);
        coordenadas.put(pi22.getId(), new Coordenada(-25.561251102620112, -49.30752731728523));
        pi23 = new Estado(123);
        coordenadas.put(pi23.getId(), new Coordenada(-25.505674368245508, -49.26467784426781));
        pi24 = new Estado(124);
        coordenadas.put(pi24.getId(), new Coordenada(-25.50477860139081, -49.248648232632064));
        pi25 = new Estado(125);
        coordenadas.put(pi25.getId(), new Coordenada(-25.543148219339784, -49.27722044426709));
        pi26 = new Estado(126);
        coordenadas.put(pi25.getId(), new Coordenada(-25.526541297524407, -49.26534353077654));
    }
    
    public void criaRotasUs () {
        inicial.getVizinhos().add(new Estado(104, 2.6, inicial));
        inicial.getVizinhos().add(new Estado(108, 4.5, inicial));
        inicial.getVizinhos().add(new Estado(111, 4.0, inicial));
        mapa.put(0, inicial);
        
        us1.getVizinhos().add(new Estado(103, 4.8, us1));
        us1.getVizinhos().add(new Estado(113, 3.7, us1));
        mapa.put(1, us1);
        
        us2.getVizinhos().add(new Estado(101, 1.8 , us2));
        mapa.put(2, us2);
        
        us3.getVizinhos().add(new Estado(102, 5.1, us3));
        us3.getVizinhos().add(new Estado(105, 2.4, us3));
        mapa.put(3, us3);
        
        us4.getVizinhos().add(new Estado(102, 2.0, us4));
        us4.getVizinhos().add(new Estado(105, 2.1, us4));
        us4.getVizinhos().add(new Estado(107, 2.4, us4));
        mapa.put(4, us4);
        
        us5.getVizinhos().add(new Estado(106, 6.0, us5));
        us5.getVizinhos().add(new Estado(109, 3.6, us5));
        us5.getVizinhos().add(new Estado(115, 2.0, us5));
        mapa.put(5, us5);
        
        us6.getVizinhos().add(new Estado(116, 4.0, us6));
        mapa.put(6, us6);
        
        us7.getVizinhos().add(new Estado(119, 9.0, us7));
        us7.getVizinhos().add(new Estado(122, 4.0, us7));
        mapa.put(7, us7);
        
        us8.getVizinhos().add(new Estado(125, 1.0, us8));
        us8.getVizinhos().add(new Estado(126, 2.1, us8));
        mapa.put(8, us8);
        
        us9.getVizinhos().add(new Estado(114, 2.0, us9));
        us9.getVizinhos().add(new Estado(124, 3.0, us9));
        mapa.put(9, us9);
        
        us10.getVizinhos().add(new Estado(110, 2.9, us10));
        us10.getVizinhos().add(new Estado(112, 5.3, us10));
        us10.getVizinhos().add(new Estado(123, 4.9, us10));
        us10.getVizinhos().add(new Estado(120, 6.0, us10));
        us10.getVizinhos().add(new Estado(115, 4.3, us10));
        mapa.put(10, us10);  
    }
    
    public void criaRotasPontosIntermediarios () {
        /* Ponto A */
        pi1.getVizinhos().add(new Estado(2, 1.8, pi1));
        pi1.getVizinhos().add(new Estado(102, 3.5, pi1));
        pi1.getVizinhos().add(new Estado(103, 3.0, pi1));
        mapa.put(101, pi1);
        
        /* Ponto B */
        pi2.getVizinhos().add(new Estado(101, 3.5, pi2));
        pi2.getVizinhos().add(new Estado(3, 5.1, pi2));
        pi2.getVizinhos().add(new Estado(104, 2.9, pi2));
        pi2.getVizinhos().add(new Estado(4, 2.0, pi2));
        mapa.put(102, pi2);
        
        /* Ponto C */
        pi3.getVizinhos().add(new Estado(101, 3.0, pi3));
        pi3.getVizinhos().add(new Estado(1, 4.8, pi3));
        pi3.getVizinhos().add(new Estado(104, 1.4, pi3));
        mapa.put(103, pi3);
        
        /* Ponto D */
        pi4.getVizinhos().add(new Estado(103, 1.4, pi4));
        pi4.getVizinhos().add(new Estado(102, 2.9, pi4));
        pi4.getVizinhos().add(new Estado(0, 2.6, pi4));
        mapa.put(104, pi4);
        
        /* Ponto E */
        pi5.getVizinhos().add(new Estado(3, 2.4, pi5));
        pi5.getVizinhos().add(new Estado(4, 2.1, pi5));
        pi5.getVizinhos().add(new Estado(106, 1.6, pi5));
        mapa.put(105, pi5);
        
        /* Ponto F */
        pi6.getVizinhos().add(new Estado(105, 1.6, pi6));
        pi6.getVizinhos().add(new Estado(5, 6.0, pi6));
        mapa.put(106, pi6);
        
        /* Ponto G */
        pi7.getVizinhos().add(new Estado(4, 2.4, pi7));
        pi7.getVizinhos().add(new Estado(108, 2.6, pi7));
        pi7.getVizinhos().add(new Estado(109, 4.4, pi7));
        mapa.put(107, pi7);
        
        /* Ponto H */
        pi8.getVizinhos().add(new Estado(107, 2.6, pi8));
        pi8.getVizinhos().add(new Estado(0, 4.5, pi8));
        pi8.getVizinhos().add(new Estado(110, 3.0, pi8));
        mapa.put(108, pi8);
        
        /* Ponto I */
        pi9.getVizinhos().add(new Estado(107, 4.4, pi9));
        pi9.getVizinhos().add(new Estado(110, 2.2, pi9));
        pi9.getVizinhos().add(new Estado(5, 3.6, pi9));
        mapa.put(109, pi9);
        
        /* Ponto J */
        pi10.getVizinhos().add(new Estado(108, 3.0, pi10));
        pi10.getVizinhos().add(new Estado(109, 2.2, pi10));
        pi10.getVizinhos().add(new Estado(10, 2.9, pi10));
        mapa.put(110, pi10);
        
        /* Ponto K */
        pi11.getVizinhos().add(new Estado(0, 4.0, pi11));
        pi11.getVizinhos().add(new Estado(112, 3.0, pi11));
        pi11.getVizinhos().add(new Estado(113, 4.8, pi11));
        mapa.put(111, pi11);
        
        /* Ponto L */
        pi12.getVizinhos().add(new Estado(111, 3.0, pi12));
        pi12.getVizinhos().add(new Estado(114, 2.7, pi12));
        pi12.getVizinhos().add(new Estado(10, 5.3, pi12));
        mapa.put(112, pi12);
        
        /* Ponto M */
        pi13.getVizinhos().add(new Estado(1, 3.7, pi13));
        pi13.getVizinhos().add(new Estado(111, 4.8, pi13));
        pi13.getVizinhos().add(new Estado(114, 2.0, pi13));
        mapa.put(113, pi13);
        
        /* Ponto N */
        pi14.getVizinhos().add(new Estado(9, 2.0, pi14));
        pi14.getVizinhos().add(new Estado(112, 2.7, pi14));
        pi14.getVizinhos().add(new Estado(113, 2.0, pi14));
        mapa.put(114, pi14);
        
        /* Ponto O */
        pi15.getVizinhos().add(new Estado(5, 2.0, pi15));
        pi15.getVizinhos().add(new Estado(10, 4.3, pi15));
        pi15.getVizinhos().add(new Estado(117, 4.2, pi15));
        pi15.getVizinhos().add(new Estado(118, 2.8, pi15));
        mapa.put(115, pi15);
        
        /* Ponto P */
        pi16.getVizinhos().add(new Estado(6, 4.0, pi16));
        pi16.getVizinhos().add(new Estado(118, 1.0, pi16));
        pi16.getVizinhos().add(new Estado(119, 5.1, pi16));
        mapa.put(116, pi16);
        
        /* Ponto Q */
        pi17.getVizinhos().add(new Estado(115, 4.2, pi17));
        pi17.getVizinhos().add(new Estado(120, 4.0, pi17));
        pi17.getVizinhos().add(new Estado(119, 7.5, pi17));
        pi17.getVizinhos().add(new Estado(118, 2.6, pi17));
        mapa.put(117, pi17);
        
        /* Ponto R */
        pi18.getVizinhos().add(new Estado(116, 1.0, pi18));
        pi18.getVizinhos().add(new Estado(117, 2.6, pi18));
        pi18.getVizinhos().add(new Estado(115, 2.8, pi18));
        mapa.put(118, pi18);
        
        /* Ponto S */
        pi19.getVizinhos().add(new Estado(116, 5.1, pi19));
        pi19.getVizinhos().add(new Estado(117, 7.5, pi19));
        pi19.getVizinhos().add(new Estado(7, 9.0, pi19));
        mapa.put(119, pi19);
        
        /* Ponto T */
        pi20.getVizinhos().add(new Estado(10, 6.0, pi20));
        pi20.getVizinhos().add(new Estado(117, 4.0, pi20));
        pi20.getVizinhos().add(new Estado(121, 2.4, pi20));
        pi20.getVizinhos().add(new Estado(125, 4.7, pi20));
        mapa.put(120, pi20);
        
        /* Ponto U */
        pi21.getVizinhos().add(new Estado(120, 2.4, pi21));
        pi21.getVizinhos().add(new Estado(125, 2.2, pi21));
        pi21.getVizinhos().add(new Estado(122, 7.0, pi21));
        mapa.put(121, pi21);
        
        /* Ponto V */
        pi22.getVizinhos().add(new Estado(121, 7.0, pi22));
        pi22.getVizinhos().add(new Estado(125, 5.0, pi22));
        pi22.getVizinhos().add(new Estado(7, 4.0, pi22));
        mapa.put(122, pi22);
        
        /* Ponto X */
        pi23.getVizinhos().add(new Estado(10, 4.9, pi23));
        pi23.getVizinhos().add(new Estado(124, 2.0, pi23));
        pi23.getVizinhos().add(new Estado(126, 3.1, pi23));
        mapa.put(123, pi23);
        
        /* Ponto Z */
        pi24.getVizinhos().add(new Estado(9, 3.0, pi24));
        pi24.getVizinhos().add(new Estado(126, 3.7, pi24));
        pi24.getVizinhos().add(new Estado(123, 2.0, pi24));
        mapa.put(124, pi24);
        
        /* Ponto W */
        pi25.getVizinhos().add(new Estado(8, 1.0, pi25));
        pi25.getVizinhos().add(new Estado(120, 4.7, pi25));
        pi25.getVizinhos().add(new Estado(121, 2.2, pi25));
        pi25.getVizinhos().add(new Estado(122, 5.0, pi25));
        mapa.put(125, pi25);
        
        /* Ponto Y */
        pi26.getVizinhos().add(new Estado(8, 2.1, pi26));
        pi26.getVizinhos().add(new Estado(124, 3.7, pi26));
        pi26.getVizinhos().add(new Estado(123, 3.1, pi26));
        mapa.put(126, pi26);
    }
    
    public Map<Integer, Estado> getUnidadesDeSaude () {
        return unidadesDeSaude;
    }
    
    public Estado getEstadoInicial () {
        return inicial;
    }
    
    public Map<Integer, Estado> getMapa () {
        return mapa;
    }

    public Map<Integer, Coordenada> getCoordenadas() {
        return coordenadas;
    }
}
