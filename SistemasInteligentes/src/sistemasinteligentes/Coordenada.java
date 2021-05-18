package sistemasinteligentes;

public class Coordenada {
    private Double latitude;
    private Double longitude;
    
    public Coordenada(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }
}
