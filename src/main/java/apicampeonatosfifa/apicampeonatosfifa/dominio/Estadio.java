package apicampeonatosfifa.apicampeonatosfifa.dominio;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "estadio")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_estadio")
    @GenericGenerator(name = "secuencia_estadio", strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "estadio", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idciudad", referencedColumnName = "id", nullable = false)
    private Ciudad ciudad;

    @Column(name = "capacidad", nullable = false)
    private int capacidad;

}
