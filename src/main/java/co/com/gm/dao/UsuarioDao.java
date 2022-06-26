package co.com.gm.dao;

import co.com.gm.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
