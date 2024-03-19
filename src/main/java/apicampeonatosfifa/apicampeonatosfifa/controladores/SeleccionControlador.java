package apicampeonatosfifa.apicampeonatosfifa.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaceservicios.ISeleccionServicio;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Seleccion;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/seleccion")
public class SeleccionControlador {

    private ISeleccionServicio servicio;

    public SeleccionControlador(ISeleccionServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Seleccion> listar() {
        return servicio.listar();
    }

}
