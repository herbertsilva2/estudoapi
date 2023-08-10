package estudo.estudoapi.services;

import estudo.estudoapi.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstudoService extends JpaRepository<Usuario, Integer> {

    public Usuario findUsuarioById(Integer id);

    public List<Usuario> findAll();

}
