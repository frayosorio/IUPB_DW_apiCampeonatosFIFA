package apicampeonatosfifa.apicampeonatosfifa.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaceservicios.ICampeonatoServicio;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;

@RestController
@RequestMapping("/api/campeonato")
public class CampeonatoControlador {

    private ICampeonatoServicio servicio;

    public CampeonatoControlador(ICampeonatoServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Campeonato> listar() {
        return servicio.listar();
    }

}
