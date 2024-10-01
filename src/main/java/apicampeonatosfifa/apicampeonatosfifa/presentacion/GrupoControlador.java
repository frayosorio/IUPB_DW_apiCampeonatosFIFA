package apicampeonatosfifa.apicampeonatosfifa.presentacion;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.IGrupoServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.Grupo;
import apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs.TablaPosicionesDto;

@RestController
@RequestMapping("/api/grupos")
public class GrupoControlador {
    private IGrupoServicio servicio;

    public GrupoControlador(IGrupoServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Grupo> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Grupo obtener(@PathVariable Integer id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Grupo> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Grupo agregar(@RequestBody Grupo Grupo) {
        return servicio.agregar(Grupo);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Grupo modificar(@RequestBody Grupo Grupo) {
        return servicio.modificar(Grupo);
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public boolean eliminar(@PathVariable Integer id) {
        return servicio.eliminar(id);
    }

    @RequestMapping(value = "/posiciones/{id}", method = RequestMethod.GET)
    public List<TablaPosicionesDto> obtenerPosiciones(@PathVariable int id) {
        return servicio.obtenerPosiciones(id);
    }

}
