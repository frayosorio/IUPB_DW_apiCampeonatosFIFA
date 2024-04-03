package apicampeonatosfifa.apicampeonatosfifa.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaceservicios.ICampeonatoServicio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfacesrepositorios.ICampeonatoRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;

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
        if (repositorio.findById(campeonato.getId()).isPresent()) {
            return repositorio.save(campeonato);
        } else {
            return null;
        }
    }


    @Override
    public boolean eliminar(Integer id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
