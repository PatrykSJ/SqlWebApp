package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

import java.time.LocalDate;

public class Pakiety_uslug implements TableInterface {

    private Integer Id_pakietu_uslug ;
    private String Rodzaj_pakietu ;
    private Integer Cena ;
    private String Data_obowiazywania ;
    private Integer Id_klienta ;

    public Pakiety_uslug() {

    }

    public Pakiety_uslug(Integer id_pakietu_uslug, String rodzaj_pakietu, Integer cena, String data_obowiazywania, Integer id_klienta) {
        Id_pakietu_uslug = id_pakietu_uslug;
        Rodzaj_pakietu = rodzaj_pakietu;
        Cena = cena;
        Data_obowiazywania = data_obowiazywania;
        Id_klienta = id_klienta;
    }

    @Override
    public String toString() {
        return "Pakiety_uslug{" +
                "Id_pakietu_uslug=" + Id_pakietu_uslug +
                ", Rodzaj_pakietu='" + Rodzaj_pakietu + '\'' +
                ", Cena=" + Cena +
                ", Data_obowiazywania=" + Data_obowiazywania +
                ", Id_klienta=" + Id_klienta +
                '}';
    }

    public Integer getId_pakietu_uslug() {
        return Id_pakietu_uslug;
    }

    public void setId_pakietu_uslug(Integer id_pakietu_uslug) {
        Id_pakietu_uslug = id_pakietu_uslug;
    }

    public String getRodzaj_pakietu() {
        return Rodzaj_pakietu;
    }

    public void setRodzaj_pakietu(String rodzaj_pakietu) {
        Rodzaj_pakietu = rodzaj_pakietu;
    }

    public Integer getCena() {
        return Cena;
    }

    public void setCena(Integer cena) {
        Cena = cena;
    }

    public String getData_obowiazywania() {
        return Data_obowiazywania;
    }

    public void setData_obowiazywania(String data_obowiazywania) {
        Data_obowiazywania = data_obowiazywania;
    }

    public Integer getId_klienta() {
        return Id_klienta;
    }

    public void setId_klienta(Integer id_klienta) {
        Id_klienta = id_klienta;
    }
}

