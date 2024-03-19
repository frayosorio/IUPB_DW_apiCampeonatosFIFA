package apicampeonatosfifa.apicampeonatosfifa.core.interfacesrepositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.entidades.Seleccion;

@Repository
public interface ISeleccionRepositorio extends JpaRepository<Seleccion, Integer> {

    @Query("SELECT s FROM Seleccion s WHERE s.nombre LIKE '%' || ?1 || '%'")
    List<Seleccion> buscar(String nombre);

}
