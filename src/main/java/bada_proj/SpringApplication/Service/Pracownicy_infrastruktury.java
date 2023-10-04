package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Pracownicy_infrastruktury implements TableInterface {

    private Integer Id_pracownika ;
    private Integer Id_infrastruktury ;
    private boolean Czy_administrator ;

    public Pracownicy_infrastruktury() {

    }

    public Pracownicy_infrastruktury(Integer id_pracownika, Integer id_infrastruktury, boolean czy_administrator) {
        Id_pracownika = id_pracownika;
        Id_infrastruktury = id_infrastruktury;
        Czy_administrator = czy_administrator;
    }

    @Override
    public String toString() {
        return "Pracownicy_infrastruktury{" +
                "Id_pracownika=" + Id_pracownika +
                ", Id_infrastruktury=" + Id_infrastruktury +
                ", Czy_administrator=" + Czy_administrator +
                '}';
    }

    public Integer getId_pracownika() {
        return Id_pracownika;
    }

    public void setId_pracownika(Integer id_pracownika) {
        Id_pracownika = id_pracownika;
    }

    public Integer getId_infrastruktury() {
        return Id_infrastruktury;
    }

    public void setId_infrastruktury(Integer id_infrastruktury) {
        Id_infrastruktury = id_infrastruktury;
    }

    public boolean isCzy_administrator() {
        return Czy_administrator;
    }

    public void setCzy_administrator(boolean czy_administrator) {
        Czy_administrator = czy_administrator;
    }
}

