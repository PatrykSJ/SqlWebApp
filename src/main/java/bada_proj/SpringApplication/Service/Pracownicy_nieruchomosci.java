package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Pracownicy_nieruchomosci implements TableInterface {

    private Integer Id_pracownika ;
    private Integer Id_nieruchomosci ;
    private boolean Czy_administrator;

    public Pracownicy_nieruchomosci() {

    }

    public Pracownicy_nieruchomosci(Integer id_pracownika, Integer id_nieruchomosci, boolean czy_administrator) {
        Id_pracownika = id_pracownika;
        Id_nieruchomosci = id_nieruchomosci;
        Czy_administrator = czy_administrator;
    }

    @Override
    public String toString() {
        return "Pracownicy_nieruchomosci{" +
                "Id_pracownika=" + Id_pracownika +
                ", Id_nieruchomosci=" + Id_nieruchomosci +
                ", Czy_administrator=" + Czy_administrator +
                '}';
    }

    public Integer getId_pracownika() {
        return Id_pracownika;
    }

    public void setId_pracownika(Integer id_pracownika) {
        Id_pracownika = id_pracownika;
    }

    public Integer getId_nieruchomosci() {
        return Id_nieruchomosci;
    }

    public void setId_nieruchomosci(Integer id_nieruchomosci) {
        Id_nieruchomosci = id_nieruchomosci;
    }

    public boolean isCzy_administrator() {
        return Czy_administrator;
    }

    public void setCzy_administrator(boolean czy_administrator) {
        Czy_administrator = czy_administrator;
    }
}

