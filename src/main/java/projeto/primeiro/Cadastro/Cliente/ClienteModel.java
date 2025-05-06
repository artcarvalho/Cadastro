package projeto.primeiro.Cadastro.Cliente;
import jakarta.persistence.*;
import projeto.primeiro.Cadastro.Carros.CarrosModel;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "tb_cadastro")
public class ClienteModel {

    //atributos Cliente
    @Id //entender melhor como funciona
    @GeneratedValue(strategy = GenerationType.IDENTITY) //entender melhor como funciona
    private Long id;

    private String nome;

    private Date data_nascimento;

    private String email;

    @OneToMany(mappedBy = "locatario") //Um locatário pode ter varios carros alugados
    private List<CarrosModel> carros_alugados;

    //construtores
    public ClienteModel(){

    }

    public ClienteModel(String nome, Date data_nascimento, String email){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.email = email;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public Date getNascimento(){
        return data_nascimento;
    }
    public String getEmail(){
        return email;
    }


    //Setters
    public void setNome(String novo_nome) {
        this.nome = novo_nome;
    }
    public void setNascimento(Date nova_data){
        this.data_nascimento = nova_data;
    }
    public void setEmail(String novo_email){
        this.email = novo_email;
    }

}
