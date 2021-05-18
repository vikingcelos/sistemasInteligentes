package sistemasinteligentes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Estado {
    private Integer id;
    private ArrayList<Estado> vizinhos; 
    private Estado pai;
    private Double custoLinhaReta;
    private Double distancia = 0.0;
    private Double custoTempo;
    
    public Estado (Integer id) {
        this.id = id;
        this.custoTempo = 0.0;
        this.custoLinhaReta = 0.0;
        vizinhos = new ArrayList<Estado>();
    }
    
    public Estado (Integer id, Double distancia, Estado pai) {
        this.id = id;
        this.custoTempo = 0.0;
        this.custoLinhaReta = 0.0;
        this.distancia = distancia;
        this.pai = pai;
        vizinhos = new ArrayList<Estado>();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    public Integer getId() {
        return id;
    }

    public Estado getPai() {
        return pai;
    }

    public void setPai(Estado pai) {
        this.pai = pai;
    }

    public Double getCustoLinhaReta() {
        return custoLinhaReta;
    }

    public void setCustoLinhaReta(Double custoLinhaReta) {
        this.custoLinhaReta = custoLinhaReta;
    }

    public ArrayList<Estado> getVizinhos() {
        return vizinhos;
    }

    public Double getDistancia() {
        return distancia;
    }

    public Double getCustoTempo() {
        return custoTempo;
    }

    public void setCustoTempo(Double custoTotal) {
        this.custoTempo = custoTotal;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }
}
