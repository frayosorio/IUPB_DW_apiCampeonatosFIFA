package apicampeonatosfifa.apicampeonatosfifa.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pais")
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "Pais")
    private String nombre;

    @Column(name = "Entidad")
    private String entidad;

    /* 
     @JsonIgnore
    @OneToMany(mappedBy = "Seleccion")
    private List<Campeonato> campeonatos = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "Seleccion")
    private List<Ciudad> ciudades = new ArrayList<>();
    */

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
