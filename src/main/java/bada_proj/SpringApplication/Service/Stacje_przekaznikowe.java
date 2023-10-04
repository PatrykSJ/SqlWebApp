package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Stacje_przekaznikowe implements TableInterface {

    private Integer Id_infrastruktury ;
    private Integer Wysokosc_masztu ;
    private Integer Ilosc_anten ;
    private Integer Zasięg ;
    private Integer Liczba_klientow  ;

    public Stacje_przekaznikowe() {

    }

    public Stacje_przekaznikowe(Integer id_infrastruktury, Integer wysokosc_masztu, Integer ilosc_anten, Integer zasięg, Integer liczba_klientow) {
        Id_infrastruktury = id_infrastruktury;
        Wysokosc_masztu = wysokosc_masztu;
        Ilosc_anten = ilosc_anten;
        Zasięg = zasięg;
        Liczba_klientow = liczba_klientow;
    }

    @Override
    public String toString() {
        return "Stacje_przekaznikowe{" +
                "Id_infrastruktury=" + Id_infrastruktury +
                ", Wysokosc_masztu=" + Wysokosc_masztu +
                ", Ilosc_anten=" + Ilosc_anten +
                ", Zasięg=" + Zasięg +
                ", Liczba_klientow=" + Liczba_klientow +
                '}';
    }

    public Integer getId_infrastruktury() {
        return Id_infrastruktury;
    }

    public void setId_infrastruktury(Integer id_infrastruktury) {
        Id_infrastruktury = id_infrastruktury;
    }

    public Integer getWysokosc_masztu() {
        return Wysokosc_masztu;
    }

    public void setWysokosc_masztu(Integer wysokosc_masztu) {
        Wysokosc_masztu = wysokosc_masztu;
    }

    public Integer getIlosc_anten() {
        return Ilosc_anten;
    }

    public void setIlosc_anten(Integer ilosc_anten) {
        Ilosc_anten = ilosc_anten;
    }

    public Integer getZasięg() {
        return Zasięg;
    }

    public void setZasięg(Integer zasięg) {
        Zasięg = zasięg;
    }

    public Integer getLiczba_klientow() {
        return Liczba_klientow;
    }

    public void setLiczba_klientow(Integer liczba_klientow) {
        Liczba_klientow = liczba_klientow;
    }
}

