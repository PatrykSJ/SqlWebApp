package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Pracownicy_uslugi implements TableInterface {

    private Integer Id_pracownika ;
    private Integer Id_uslugi ;

    public Pracownicy_uslugi() {

    }

    public Pracownicy_uslugi(Integer id_pracownika, Integer id_uslugi) {
        Id_pracownika = id_pracownika;
        Id_uslugi = id_uslugi;
    }

    @Override
    public String toString() {
        return "Pracownicy_uslugi{" +
                "Id_pracownika=" + Id_pracownika +
                ", Id_uslugi=" + Id_uslugi +
                '}';
    }

    public Integer getId_pracownika() {
        return Id_pracownika;
    }

    public void setId_pracownika(Integer id_pracownika) {
        Id_pracownika = id_pracownika;
    }

    public Integer getId_uslugi() {
        return Id_uslugi;
    }

    public void setId_uslugi(Integer id_uslugi) {
        Id_uslugi = id_uslugi;
    }
}

