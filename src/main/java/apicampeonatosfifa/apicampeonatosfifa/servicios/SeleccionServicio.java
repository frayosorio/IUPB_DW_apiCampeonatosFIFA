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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public List<Seleccion> buscar(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public Seleccion guardar(Seleccion pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardar'");
    }

    @Override
    public boolean eliminar(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

}
