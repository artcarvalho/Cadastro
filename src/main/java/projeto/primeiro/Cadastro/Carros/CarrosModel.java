package projeto.primeiro.Cadastro.Carros;

import jakarta.persistence.*;
import projeto.primeiro.Cadastro.Cliente.ClienteModel;

@Entity
@Table(name = "tb_carros")
public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String marca;
    private Float km_rodado;
    private Float preco_aluguel;
    private ClienteModel locatario;

    public CarrosModel(){

    }

    public CarrosModel(String modelo, String marca, Float km_rodado, Float preco_aluguel){
        this.modelo = modelo;
        this.marca = marca;
        this.km_rodado = km_rodado;
        this.preco_aluguel = preco_aluguel;

    }

    //getters
    public ClienteModel getLocatario() {
        return locatario;
    }

    public Float getKm_rodado() {
        return km_rodado;
    }

    public Float getPreco_aluguel() {
        return preco_aluguel;
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setKm_rodado(Float km_rodado) {
        this.km_rodado = km_rodado;
    }

    public void setLocatario(ClienteModel locatario) {
        this.locatario = locatario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco_aluguel(Float preco_aluguel) {
        this.preco_aluguel = preco_aluguel;
    }
}
