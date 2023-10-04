package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Firmy_ochroniarskie implements TableInterface {

    private Integer Id_firmy_ochroniarskiej;
    private String Nazwa;
    private boolean Czy_oferuje_monitoring;
    private String awaryjny_numer_telefonu;
    private Integer id_adresu;

    public Firmy_ochroniarskie(Integer id_firmy_ochroniarskiej, String nazwa, boolean czy_oferuje_monitoring, String awaryjny_numer_telefonu, Integer id_adresu) {
        Id_firmy_ochroniarskiej = id_firmy_ochroniarskiej;
        Nazwa = nazwa;
        Czy_oferuje_monitoring = czy_oferuje_monitoring;
        this.awaryjny_numer_telefonu = awaryjny_numer_telefonu;
        this.id_adresu = id_adresu;
    }

    @Override
    public String toString() {
        return "Firmy_ochroniarskie{" +
                "Id_firmy_ochroniarskiej=" + Id_firmy_ochroniarskiej +
                ", Nazwa='" + Nazwa + '\'' +
                ", Czy_oferuje_monitoring=" + Czy_oferuje_monitoring +
                ", awaryjny_numer_telefonu='" + awaryjny_numer_telefonu + '\'' +
                ", id_adresu=" + id_adresu +
                '}';
    }

    public Integer getId_firmy_ochroniarskiej() {
        return Id_firmy_ochroniarskiej;
    }

    public void setId_firmy_ochroniarskiej(Integer id_firmy_ochroniarskiej) {
        Id_firmy_ochroniarskiej = id_firmy_ochroniarskiej;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public boolean isCzy_oferuje_monitoring() {
        return Czy_oferuje_monitoring;
    }

    public void setCzy_oferuje_monitoring(boolean czy_oferuje_monitoring) {
        Czy_oferuje_monitoring = czy_oferuje_monitoring;
    }

    public String getAwaryjny_numer_telefonu() {
        return awaryjny_numer_telefonu;
    }

    public void setAwaryjny_numer_telefonu(String awaryjny_numer_telefonu) {
        this.awaryjny_numer_telefonu = awaryjny_numer_telefonu;
    }

    public Integer getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(Integer id_adresu) {
        this.id_adresu = id_adresu;
    }

    public Firmy_ochroniarskie() {

    }

}

