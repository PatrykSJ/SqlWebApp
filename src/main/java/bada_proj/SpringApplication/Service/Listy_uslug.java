package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Listy_uslug implements TableInterface {

    private Integer Id_Listy_Uslug ;
    private String Rodzaj_uslugi ;
    private Integer Koszt ;
    private boolean Czy_zdalna ;
    private boolean Czy_gwarancja ;

    public Listy_uslug() {

    }

    public Listy_uslug(Integer id_Listy_Uslug, String rodzaj_uslugi, Integer koszt, boolean czy_zdalna, boolean czy_gwarancja) {
        Id_Listy_Uslug = id_Listy_Uslug;
        Rodzaj_uslugi = rodzaj_uslugi;
        Koszt = koszt;
        Czy_zdalna = czy_zdalna;
        Czy_gwarancja = czy_gwarancja;
    }

    @Override
    public String toString() {
        return "Listy_uslug{" +
                "Id_Listy_Uslug=" + Id_Listy_Uslug +
                ", Rodzaj_uslugi='" + Rodzaj_uslugi + '\'' +
                ", Koszt=" + Koszt +
                ", Czy_zdalna=" + Czy_zdalna +
                ", Czy_gwarancja=" + Czy_gwarancja +
                '}';
    }

    public Integer getId_Listy_Uslug() {
        return Id_Listy_Uslug;
    }

    public void setId_Listy_Uslug(Integer id_Listy_Uslug) {
        Id_Listy_Uslug = id_Listy_Uslug;
    }

    public String getRodzaj_uslugi() {
        return Rodzaj_uslugi;
    }

    public void setRodzaj_uslugi(String rodzaj_uslugi) {
        Rodzaj_uslugi = rodzaj_uslugi;
    }

    public Integer getKoszt() {
        return Koszt;
    }

    public void setKoszt(Integer koszt) {
        Koszt = koszt;
    }

    public boolean isCzy_zdalna() {
        return Czy_zdalna;
    }

    public void setCzy_zdalna(boolean czy_zdalna) {
        Czy_zdalna = czy_zdalna;
    }

    public boolean isCzy_gwarancja() {
        return Czy_gwarancja;
    }

    public void setCzy_gwarancja(boolean czy_gwarancja) {
        Czy_gwarancja = czy_gwarancja;
    }
}

