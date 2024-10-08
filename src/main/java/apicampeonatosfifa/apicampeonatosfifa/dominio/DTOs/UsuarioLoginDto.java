package apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs;

import apicampeonatosfifa.apicampeonatosfifa.dominio.Usuario;

public class UsuarioLoginDto {
    private Usuario usuario;
    private String token;

    public UsuarioLoginDto(Usuario usuario) {
        this.usuario = usuario;
        this.token = "";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
