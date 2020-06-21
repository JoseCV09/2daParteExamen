package pe.edu.upeu.academico.services;

import java.util.List;
import pe.edu.upeu.academico.entity.Producto;

public interface ProductoService {

	public List<Producto> findAll();
	public Producto findById(Long idproducto);
	public Producto save(Producto producto);
	public void deleteById(Long idproducto);
	public Producto update(Producto producto);

}
