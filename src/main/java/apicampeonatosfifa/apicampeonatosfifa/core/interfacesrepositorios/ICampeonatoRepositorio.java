package apicampeonatosfifa.apicampeonatosfifa.core.interfacesrepositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;

@Repository
public interface ICampeonatoRepositorio extends JpaRepository<Campeonato, Integer> {

    @Query("SELECT c FROM Campeonato c WHERE c.nombre LIKE '%' || ?1 || '%'")
    List<Campeonato> buscar(String nombre);

}
