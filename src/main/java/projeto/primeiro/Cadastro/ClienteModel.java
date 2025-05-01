package projeto.primeiro.Cadastro;
import jakarta.persistence.*;

import java.util.Date;

//@ <- annotation, dá atributos especiais para variaveis, classes, interfaces ou outros elementos.

// Entity Transforma uma classe em uma entidade de um BD
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
