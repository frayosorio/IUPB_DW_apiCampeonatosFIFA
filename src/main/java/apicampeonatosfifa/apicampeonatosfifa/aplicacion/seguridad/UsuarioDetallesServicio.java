package apicampeonatosfifa.apicampeonatosfifa.aplicacion.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.IUsuarioRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.Usuario;

@Service
public class UsuarioDetallesServicio implements UserDetailsService {

    @Autowired
    private IUsuarioRepositorio repositorio;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuarioObtenido = repositorio.obtener(username);
        if(usuarioObtenido==null){
            throw new UsernameNotFoundException(username);
        }

        return new UsuarioDetalles(usuarioObtenido);
    }

}
