package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios;

import org.springframework.stereotype.Service;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.dominio.Seleccion;

@Service
public interface ISeleccionServicio {

    public List<Seleccion> listar();

    public Seleccion obtener(Integer id);

    public List<Seleccion> buscar(String nombre);

    public Seleccion agregar(Seleccion pais);

    public Seleccion modificar(Seleccion pais);

    public boolean eliminar(Integer id);

}
