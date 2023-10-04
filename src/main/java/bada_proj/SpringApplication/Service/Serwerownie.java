package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Serwerownie implements TableInterface {

    private Integer Id_infrastruktury ;
    private Integer Pojemnosc_dyskow;
    private boolean Czy_backupowana;
    private Integer Predkosc_polaczenia ;
    private Integer Wilgotnosc ;
    private float Temperatura ;

    public Serwerownie() {

    }

    public Serwerownie(Integer id_infrastruktury, Integer pojemnosc_dyskow, boolean czy_backupowana, Integer predkosc_polaczenia, Integer wilgotnosc, float temperatura) {
        Id_infrastruktury = id_infrastruktury;
        Pojemnosc_dyskow = pojemnosc_dyskow;
        Czy_backupowana = czy_backupowana;
        Predkosc_polaczenia = predkosc_polaczenia;
        Wilgotnosc = wilgotnosc;
        Temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Serwerownie{" +
                "Id_infrastruktury=" + Id_infrastruktury +
                ", Pojemnosc_dyskow=" + Pojemnosc_dyskow +
                ", Czy_backupowana=" + Czy_backupowana +
                ", Predkosc_polaczenia=" + Predkosc_polaczenia +
                ", Wilgotnosc=" + Wilgotnosc +
                ", Temperatura=" + Temperatura +
                '}';
    }

    public Integer getId_infrastruktury() {
        return Id_infrastruktury;
    }

    public void setId_infrastruktury(Integer id_infrastruktury) {
        Id_infrastruktury = id_infrastruktury;
    }

    public Integer getPojemnosc_dyskow() {
        return Pojemnosc_dyskow;
    }

    public void setPojemnosc_dyskow(Integer pojemnosc_dyskow) {
        Pojemnosc_dyskow = pojemnosc_dyskow;
    }

    public boolean isCzy_backupowana() {
        return Czy_backupowana;
    }

    public void setCzy_backupowana(boolean czy_backupowana) {
        Czy_backupowana = czy_backupowana;
    }

    public Integer getPredkosc_polaczenia() {
        return Predkosc_polaczenia;
    }

    public void setPredkosc_polaczenia(Integer predkosc_polaczenia) {
        Predkosc_polaczenia = predkosc_polaczenia;
    }

    public Integer getWilgotnosc() {
        return Wilgotnosc;
    }

    public void setWilgotnosc(Integer wilgotnosc) {
        Wilgotnosc = wilgotnosc;
    }

    public float getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(float temperatura) {
        Temperatura = temperatura;
    }
}

