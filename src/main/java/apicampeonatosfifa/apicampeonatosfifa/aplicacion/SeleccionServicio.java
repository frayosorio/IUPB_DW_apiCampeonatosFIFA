package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.ISeleccionRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ISeleccionServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.Seleccion;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public Seleccion agregar(Seleccion pais) {
        pais.setId(0);
        return repositorio.save(pais);
    }

    @Override
    public Seleccion modificar(Seleccion pais) {
        return repositorio.findById(pais.getId()).isPresent() ? repositorio.save(pais) : null;
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
