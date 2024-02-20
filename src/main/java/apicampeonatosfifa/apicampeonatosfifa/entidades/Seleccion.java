package apicampeonatosfifa.apicampeonatosfifa.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pais")
public class Seleccion {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "pais")
    private String nombre;

    @Column(name = "entidad")
    private String entidad;

    public Seleccion() {
    }

    public Seleccion(int id, String nombre, String entidad) {
        this.id = id;
        this.nombre = nombre;
        this.entidad = entidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    
}
