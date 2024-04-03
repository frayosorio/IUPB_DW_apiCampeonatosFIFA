package apicampeonatosfifa.apicampeonatosfifa.core.interfaceservicios;

import java.util.List;
import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;

@Service
public interface ICampeonatoServicio {
    
    public List<Campeonato> listar();

    public Campeonato obtener(Integer id);

    public List<Campeonato> buscar(String nombre);

    public Campeonato agregar(Campeonato pais);

    public Campeonato modificar(Campeonato pais);

    public boolean eliminar(Integer id);

}
