package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;


public class Poczty implements TableInterface {
    private Integer id_poczty;
    private String kod_poczty;
    private String miejscowosc_poczty;

    public Poczty(){

    }
    public Poczty(Integer id_poczty, String kod_poczty, String miejscowosc_poczty) {
        this.id_poczty = id_poczty;
        this.kod_poczty = kod_poczty;
        this.miejscowosc_poczty = miejscowosc_poczty;
    }

    public Integer getId_poczty() {
        return id_poczty;
    }

    public void setId_poczty(Integer id_poczty) {
        this.id_poczty = id_poczty;
    }

    public String getKod_poczty() {
        return kod_poczty;
    }

    public void setKod_poczty(String kod_poczty) {
        this.kod_poczty = kod_poczty;
    }

    public String getMiejscowosc_poczty() {
        return miejscowosc_poczty;
    }

    public void setMiejscowosc_poczty(String miejscowosc_poczty) {
        this.miejscowosc_poczty = miejscowosc_poczty;
    }

    @Override
    public String toString() {
        return "Poczty{" +
                "id_poczty=" + id_poczty +
                ", kod_poczty=" + kod_poczty +
                ", miejscowosc_poczty='" + miejscowosc_poczty + '\'' +
                '}';
    }
}
