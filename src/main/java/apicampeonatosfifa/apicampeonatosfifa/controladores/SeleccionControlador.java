package apicampeonatosfifa.apicampeonatosfifa.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaceservicios.ISeleccionServicio;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Seleccion;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/selecciones")
public class SeleccionControlador {

    private ISeleccionServicio servicio;

    public SeleccionControlador(ISeleccionServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Seleccion> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Seleccion obtener(@PathVariable Integer id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Seleccion agregar(@RequestBody Seleccion seleccion) {
        return servicio.agregar(seleccion);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Seleccion modificar(@RequestBody Seleccion seleccion) {
        return servicio.modificar(seleccion);
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public boolean eliminar(@PathVariable Integer id) {
        return servicio.eliminar(id);
    }

}
