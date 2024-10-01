package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.ICampeonatoRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ICampeonatoServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.Campeonato;

@Service
public class CampeonatoServicio implements ICampeonatoServicio {
    
    private ICampeonatoRepositorio repositorio;

    public CampeonatoServicio(ICampeonatoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Campeonato> listar() {
        return repositorio.findAll();
    }

    @Override
    public Campeonato obtener(Integer id) {
        return repositorio.findById(id).isPresent() ? repositorio.findById(id).get() : null;
    }

    @Override
    public List<Campeonato> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Campeonato agregar(Campeonato campeonato) {
        campeonato.setId(0);
        return repositorio.save(campeonato);
    }

    @Override
    public Campeonato modificar(Campeonato campeonato) {
        return repositorio.findById(campeonato.getId()).isPresent() ? repositorio.save(campeonato) : null;
    }

    @Override
    public boolean eliminar(Integer id) {
        if (repositorio.findById(id).isPresent()) {
            try {
                repositorio.deleteById(id);
                return true;
            } catch (Exception ex) {
            }
        }
        return false;
    }

}
