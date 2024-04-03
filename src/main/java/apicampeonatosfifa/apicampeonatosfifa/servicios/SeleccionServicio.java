package apicampeonatosfifa.apicampeonatosfifa.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaceservicios.ISeleccionServicio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfacesrepositorios.ISeleccionRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Seleccion;

@Service
public class SeleccionServicio implements ISeleccionServicio {

    private ISeleccionRepositorio repositorio;

    public SeleccionServicio(ISeleccionRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Seleccion> listar() {
        return repositorio.findAll();
    }

    @Override
    public Seleccion obtener(Integer id) {
        return repositorio.findById(id).isPresent() ? repositorio.findById(id).get() : null;
    }

    @Override
    public List<Seleccion> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Seleccion agregar(Seleccion pais) {
        pais.setId(0);
        return repositorio.save(pais);
    }

    @Override
    public Seleccion modificar(Seleccion pais) {
        if (repositorio.findById(pais.getId()).isPresent()) {
            return repositorio.save(pais);
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
