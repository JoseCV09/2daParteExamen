package pe.edu.upeu.academico.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.academico.entity.*;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Long> {

}
