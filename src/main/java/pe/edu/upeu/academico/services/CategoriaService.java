package pe.edu.upeu.academico.services;

import java.util.List;

import pe.edu.upeu.academico.entity.Categoria;

public interface CategoriaService {
	public List<Categoria> findAll();
	public Categoria findById(Long idcategoria);
	public Categoria save(Categoria categoria);
	public void deleteById(Long idcategoria);
	public Categoria update(Categoria categoria);
	
	
}
