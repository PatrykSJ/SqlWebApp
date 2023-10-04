package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Agregatornie implements TableInterface {

    private Integer id_infrastruktury;
    private Integer Liczba_agregatorow;
    private Integer Maksymalna_moc;
    private Integer Czas_pracy;
    private float Zuzycie_paliwa;
    public Agregatornie() {

    }

    public Agregatornie(Integer id_infrastruktury, Integer liczba_agregatorow, Integer maksymalna_moc, Integer czas_pracy, float zuzycie_paliwa) {
        this.id_infrastruktury = id_infrastruktury;
        Liczba_agregatorow = liczba_agregatorow;
        Maksymalna_moc = maksymalna_moc;
        Czas_pracy = czas_pracy;
        Zuzycie_paliwa = zuzycie_paliwa;
    }

    @Override
    public String toString() {
        return "Agregatornie{" +
                "id_infrastruktury=" + id_infrastruktury +
                ", Liczba_agregatorow=" + Liczba_agregatorow +
                ", Maksymalna_moc=" + Maksymalna_moc +
                ", Czas_pracy=" + Czas_pracy +
                ", Zuzycie_paliwa=" + Zuzycie_paliwa +
                '}';
    }

    public Integer getId_infrastruktury() {
        return id_infrastruktury;
    }

    public void setId_infrastruktury(Integer id_infrastruktury) {
        this.id_infrastruktury = id_infrastruktury;
    }

    public Integer getLiczba_agregatorow() {
        return Liczba_agregatorow;
    }

    public void setLiczba_agregatorow(Integer liczba_agregatorow) {
        Liczba_agregatorow = liczba_agregatorow;
    }

    public Integer getMaksymalna_moc() {
        return Maksymalna_moc;
    }

    public void setMaksymalna_moc(Integer maksymalna_moc) {
        Maksymalna_moc = maksymalna_moc;
    }

    public Integer getCzas_pracy() {
        return Czas_pracy;
    }

    public void setCzas_pracy(Integer czas_pracy) {
        Czas_pracy = czas_pracy;
    }

    public float getZuzycie_paliwa() {
        return Zuzycie_paliwa;
    }

    public void setZuzycie_paliwa(float zuzycie_paliwa) {
        Zuzycie_paliwa = zuzycie_paliwa;
    }
}

