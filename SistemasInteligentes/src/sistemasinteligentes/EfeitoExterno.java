package sistemasinteligentes;

public enum EfeitoExterno {
    VELOCIDADE_CHUVA (45, "Chuva"),
    VELOCIDADE_ENGARRAFAMENTO (30, "Engarrafamento"),
    VELOCIDADE_HORARIO_PICO (20, "Horário de pico"),
    VELOCIDADE_ACIDENTE (15, "Acidente");
    
    public Integer velocidade;
    public String efeito;
    
    private EfeitoExterno (Integer velocidade, String efeito) {
        this.velocidade = velocidade;
        this.efeito = efeito;
    }
    
    public Integer toInt() {
        return velocidade;
    }
    
    public String toValue() {
        return efeito;
    }
}






