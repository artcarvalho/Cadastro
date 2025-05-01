package projeto.primeiro.Cadastro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class ClienteController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Bem Vindo!";
    }

    @GetMapping("/del/user")
    public String delUser(){
        return "User, deletado";
    }

}
