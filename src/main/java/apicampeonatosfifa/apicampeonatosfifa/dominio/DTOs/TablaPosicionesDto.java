package apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TablaPosicionesDto {

    @Id
    private int id;
    private String pais;
    private int pJ;
    private int pG;
    private int pE;
    private int pP;
    private int gF;
    private int gC;

    public int getId() {
        return id;
    }

    public String getPais() {
        return pais;
    }

    public int getpJ() {
        return pJ;
    }

    public int getpG() {
        return pG;
    }

    public int getpE() {
        return pE;
    }

    public int getpP() {
        return pP;
    }

    public int getgF() {
        return gF;
    }

    public int getgC() {
        return gC;
    }

    public int getPuntos() {
        return puntos;
    }

    private int puntos;

    public TablaPosicionesDto() {
    }

    public TablaPosicionesDto(int id, String pais, int pJ, int pG, int pE, int pP, int gF, int gC, int puntos) {
        this.id = id;
        this.pais = pais;
        this.pJ = pJ;
        this.pG = pG;
        this.pE = pE;
        this.pP = pP;
        this.gF = gF;
        this.gC = gC;
        this.puntos = puntos;
    }

}
