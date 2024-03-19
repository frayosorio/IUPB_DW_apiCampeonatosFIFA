package apicampeonatosfifa.apicampeonatosfifa.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Campeonato")
public class Campeonato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "Campeonato")
    private String nombre;

    @Column(name = "Año")
    private int año;

    @ManyToOne
    @JoinColumn(name = "IdPais", referencedColumnName = "Id")
    private Seleccion seleccion;

    public Campeonato() {
    }

    public Campeonato(int id, String nombre, int año, Seleccion seleccion) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.seleccion = seleccion;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    

}
