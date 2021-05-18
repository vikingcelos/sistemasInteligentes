package sistemasinteligentes;

import java.util.HashMap;
import java.util.Map;

public class Info {
    private Map<Integer, Endereco> enderecos  = new HashMap<Integer, Endereco>();

    public Info() {
        setEnderecoUs();
        setEnderecoPontoIntermediario();
    }
    
    public Map<Integer, Endereco> getEnderecos() {
        return enderecos;
    }
    
    public void setEnderecoUs() {
        enderecos.put(0, new Endereco("Cemepar", "Avenida Prefeito Lothario Meissner", "444"));
        enderecos.put(1, new Endereco("Cajuru", "Rua Pedro Bochino", "750"));
        enderecos.put(2, new Endereco("Bacacheri", "Avenida Erasto Gaertner", "797"));
        enderecos.put(3, new Endereco("Bom Pastor", "Rua José Casagrande", "220"));
        enderecos.put(4, new Endereco("Mãe Curitiba", "Rua Jaime Reis", "331"));
        enderecos.put(5, new Endereco("Santa Quitéria 1", "Rua Divina Providênci", "1445"));
        enderecos.put(6, new Endereco("Santa Rita", "Rua Adriana Ceres Zago Bueno", "1350"));
        enderecos.put(7, new Endereco("São Miguel", "Rua Des. Cid Campelo", "8060"));
        enderecos.put(8, new Endereco("São João Del Rey", "Rua Realeza", "259"));
        enderecos.put(9, new Endereco("Waldemar Monastier", "Rua Romeu Bach", "80"));
        enderecos.put(10, new Endereco("Fanny Lindóia", "Rua Conde dos Arcos", "295"));
    }
    
    public void setEnderecoPontoIntermediario () {
        enderecos.put(101, new Endereco("R. dos Funcionários", "1540"));
        enderecos.put(102, new Endereco("R. Gen. Carneiro", "181"));
        enderecos.put(103, new Endereco("Rua Raphael Papa", "10"));
        enderecos.put(104, new Endereco("Av. São José", "300"));
        enderecos.put(105, new Endereco("Rua Desembargador Isaías Bevilaqua", "512"));
        enderecos.put(106, new Endereco("R. Padre Anchieta", "1846"));
        enderecos.put(107, new Endereco("Alameda Augusto Stellfeld", "1908"));
        enderecos.put(108, new Endereco("Praça Rui Barbosa", "694"));
        enderecos.put(109, new Endereco("Rua Guilherme Pugsley", "1705" ));
        enderecos.put(110, new Endereco("R. João Antônio Xavier", "1001"));
        enderecos.put(111, new Endereco("R. Dr. Ovande do Amaral", "201"));
        enderecos.put(112, new Endereco("Av. Sen. Salgado Filho", "2368"));
        enderecos.put(113, new Endereco("R. Cap. Leônidas Marques", "1392"));
        enderecos.put(114, new Endereco("Av. Sen. Salgado Filho", "5265"));
        enderecos.put(115, new Endereco("R. Carlos Dietzsch", "1115"));
        enderecos.put(116, new Endereco("R. Primo Lourenço Tosin", "21"));
        enderecos.put(117, new Endereco("Rua Eloy de Assis Fabris", "634"));
        enderecos.put(118, new Endereco("Av. Rep. Argentina", "4650"));
        enderecos.put(119, new Endereco("Rua Manoel Valdomiro de Macedo", "2851"));
        enderecos.put(120, new Endereco("R. Batista da Costa", "1163"));
        enderecos.put(121, new Endereco("R. Dilermando Pereira de Almeida", "700"));
        enderecos.put(122, new Endereco("ROD BR-116", "22730"));
        enderecos.put(123, new Endereco("R. Celeste Tortato Gabardo", "1712"));
        enderecos.put(124, new Endereco("R. Francisco Derosso", "1762"));
        enderecos.put(125, new Endereco("Rua João Eloy de Souza", "111"));
        enderecos.put(126, new Endereco("R. Paulo Setúbal", "3234"));
    }
}
