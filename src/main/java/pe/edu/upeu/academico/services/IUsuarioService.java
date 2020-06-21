package pe.edu.upeu.academico.services;

import pe.edu.upeu.academico.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
