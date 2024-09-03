package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apicampeonatosfifa.apicampeonatosfifa.dominio.Estadio;

public interface IEstadioRepositorio extends JpaRepository<Estadio, Integer> {

}
