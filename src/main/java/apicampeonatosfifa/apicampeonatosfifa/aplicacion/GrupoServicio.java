package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.IGrupoRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.IGrupoServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.Grupo;
import apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs.TablaPosicionesDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class GrupoServicio implements IGrupoServicio {

    private IGrupoRepositorio repositorio;

    @PersistenceContext
    private EntityManager em;

    public GrupoServicio(IGrupoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Grupo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Grupo obtener(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public List<Grupo> buscar(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public Grupo agregar(Grupo pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public Grupo modificar(Grupo pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public boolean eliminar(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<TablaPosicionesDto> obtenerPosiciones(int id) {
        List<TablaPosicionesDto> tablaPosiciones = em
                .createNativeQuery("SELECT * FROM fObtenerTablaPosiciones(:idgrupotabla)", TablaPosicionesDto.class)
                .setParameter("idgrupotabla", id)
                .getResultList();
        return tablaPosiciones;
    }

}
