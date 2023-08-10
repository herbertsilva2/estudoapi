package estudo.estudoapi;

import estudo.estudoapi.services.EstudoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = { "application/json" })
public class RestControllerIn {

    @Autowired
    EstudoService estudoService;

    @GetMapping("/listar-todos")
    public List<Usuario> listarTodos() {
        return estudoService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario consultarUsuario(@PathVariable Integer id) {
        return estudoService.findUsuarioById(id);
    }

    @PostMapping(value="/adicionar-usuario", consumes="application/json")
    public void adicionarUsuario(@RequestBody Usuario usuario) {
        estudoService.save(usuario);
    }

    @PostMapping(value="/atualizar-usuario", consumes="application/json")
    public void atualizarUsuario(@RequestBody Usuario usuario) {
        estudoService.save(usuario);
    }

    @PostMapping(value="/remover-usuario", consumes="application/json")
    public void removerUsuario(@RequestBody Usuario usuario) {
        estudoService.delete(usuario);
    }
}
