package co.com.gm.dao;

import co.com.gm.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

    /*
    *
    * simple interfaz que extiende de JpaRepository
    * la cual coje la entidad Persona y su Long el cual
    * representa a su Identificador
    *
    * se puede usar
    * JpaRepository<Persona, Long>
    * o
    * CrudRepository<Usuario, Long>
    *
    *
    * */

}
