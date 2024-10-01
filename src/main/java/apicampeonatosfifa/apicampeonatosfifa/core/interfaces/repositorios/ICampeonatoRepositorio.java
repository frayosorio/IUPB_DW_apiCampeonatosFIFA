package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.dominio.Campeonato;

@Repository
public interface ICampeonatoRepositorio extends JpaRepository<Campeonato, Integer> {
    @Query("SELECT c FROM Campeonato c WHERE LOWER(c.nombre) LIKE LOWER(CONCAT('%', ?1, '%'))")
    public List<Campeonato> buscar(String nombre);
}
