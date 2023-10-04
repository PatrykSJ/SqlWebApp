package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Stanowiska implements TableInterface {

    private Integer Id_stanowiska ;
    private String Rodzaj_wyksztalcenia ;
    private boolean Czy_mobilne ;
    private String Rodzaj_stanowiska ;


    public Stanowiska() {

    }

    public Stanowiska(Integer id_stanowiska, String rodzaj_wyksztalcenia, boolean czy_mobilne, String rodzaj_stanowiska) {
        Id_stanowiska = id_stanowiska;
        Rodzaj_wyksztalcenia = rodzaj_wyksztalcenia;
        Czy_mobilne = czy_mobilne;
        Rodzaj_stanowiska = rodzaj_stanowiska;
    }

    @Override
    public String toString() {
        return "Stanowiska{" +
                "Id_stanowiska=" + Id_stanowiska +
                ", Rodzaj_wyksztalcenia='" + Rodzaj_wyksztalcenia + '\'' +
                ", Czy_mobilne=" + Czy_mobilne +
                ", Rodzaj_stanowiska='" + Rodzaj_stanowiska + '\'' +
                '}';
    }

    public Integer getId_stanowiska() {
        return Id_stanowiska;
    }

    public void setId_stanowiska(Integer id_stanowiska) {
        Id_stanowiska = id_stanowiska;
    }

    public String getRodzaj_wyksztalcenia() {
        return Rodzaj_wyksztalcenia;
    }

    public void setRodzaj_wyksztalcenia(String rodzaj_wyksztalcenia) {
        Rodzaj_wyksztalcenia = rodzaj_wyksztalcenia;
    }

    public boolean isCzy_mobilne() {
        return Czy_mobilne;
    }

    public void setCzy_mobilne(boolean czy_mobilne) {
        Czy_mobilne = czy_mobilne;
    }

    public String getRodzaj_stanowiska() {
        return Rodzaj_stanowiska;
    }

    public void setRodzaj_stanowiska(String rodzaj_stanowiska) {
        Rodzaj_stanowiska = rodzaj_stanowiska;
    }
}

