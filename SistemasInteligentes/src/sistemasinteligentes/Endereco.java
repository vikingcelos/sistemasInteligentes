package sistemasinteligentes;

public class Endereco {
    private String rua;
    private String numero;
    private String nome;
    
    public Endereco (String nome, String rua, String numero) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
    }
    
    public Endereco (String rua, String numero) {
        this.nome = "Ponto Intermediario";
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
