package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.dominio.Encuentro;

@Repository
public interface IEncuentroRepositorio extends JpaRepository<Encuentro, Integer> {

}
