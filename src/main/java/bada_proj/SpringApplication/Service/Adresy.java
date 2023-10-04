package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;


public class Adresy implements TableInterface {
    private Integer id_adresu;
    private String Miejscowosc;
    private String Ulica;
    private Integer numer_budynku;
    private Integer numer_lokalu;
    private Integer id_poczty;


    public Adresy() {
    }

    public Adresy(Integer id_adresu, String miejscowosc, String ulica, Integer numer_budynku, Integer numer_lokalu, Integer id_poczty) {
        this.id_adresu = id_adresu;
        this.Miejscowosc = miejscowosc;
        this.Ulica = ulica;
        this.numer_budynku = numer_budynku;
        this.numer_lokalu = numer_lokalu;
        this.id_poczty = id_poczty;
    }

    public Integer getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(Integer id_adresu) {
        this.id_adresu = id_adresu;
    }

    public String getMiejscowosc() {
        return Miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        Miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return Ulica;
    }

    public void setUlica(String ulica) {
        Ulica = ulica;
    }

    public Integer getNumer_budynku() {
        return numer_budynku;
    }

    public void setNumer_budynku(Integer numer_budynku) {
        this.numer_budynku = numer_budynku;
    }

    public Integer getNumer_lokalu() {
        return numer_lokalu;
    }

    public void setNumer_lokalu(Integer numer_lokalu) {
        this.numer_lokalu = numer_lokalu;
    }

    public Integer getId_poczty() {
        return id_poczty;
    }

    public void setId_poczty(Integer id_poczty) {
        this.id_poczty = id_poczty;
    }

    @Override
    public String toString() {
        return "Adresy{" +
                "id_adresu=" + id_adresu +
                ", Miejscowosc='" + Miejscowosc + '\'' +
                ", Ulica='" + Ulica + '\'' +
                ", numer_budynku=" + numer_budynku +
                ", numer_lokalu=" + numer_lokalu +
                ", id_poczty=" + id_poczty +
                '}';
    }
}
