package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import apicampeonatosfifa.apicampeonatosfifa.dominio.Usuario;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    @Query("SELECT u FROM Usuario u  WHERE u.usuario = ?1")
    Usuario obtener(String usuario);

}
