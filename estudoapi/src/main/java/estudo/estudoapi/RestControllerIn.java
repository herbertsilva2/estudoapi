package estudo.estudoapi;

import estudo.estudoapi.services.EstudoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudo")
public class RestControllerIn {

    @Autowired
    EstudoService estudoService;

    @GetMapping("/primeira-consulta")
    public List<Usuario> primeiraConsulta() {
        return estudoService.findAll();
    }
}
