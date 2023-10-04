package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

import java.time.LocalDate;


public class Infrastruktury implements TableInterface {

    private Integer Id_infrastruktury;
    private boolean Czy_krytyczna;
    private Integer Wartosc;

    private String Data_konserwacji;

    private boolean Czy_monitorowane;
    private boolean Czy_zasilanie_awaryjne;
    private Integer Id_operatora_sieci_komorkowej;
    private String id_adresu;
    private String id_firmy_ochroniarskiej;





    public Infrastruktury() {

    }

    public Infrastruktury(Integer id_infrastruktury, boolean czy_krytyczna, Integer wartosc, String data_konserwacji, boolean czy_monitorowane, boolean czy_zasilanie_awaryjne, Integer id_operatora_sieci_komorkowej, String id_adresu, String id_firmy_ochroniarskiej) {
        Id_infrastruktury = id_infrastruktury;
        Czy_krytyczna = czy_krytyczna;
        Wartosc = wartosc;
        Data_konserwacji = data_konserwacji;
        Czy_monitorowane = czy_monitorowane;
        Czy_zasilanie_awaryjne = czy_zasilanie_awaryjne;
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
        this.id_adresu = id_adresu;
        this.id_firmy_ochroniarskiej = id_firmy_ochroniarskiej;
    }

    @Override
    public String toString() {
        return "Infrastruktury{" +
                "Id_infrastruktury=" + Id_infrastruktury +
                ", id_adresu='" + id_adresu + '\'' +
                ", id_firmy_ochroniarskiej='" + id_firmy_ochroniarskiej + '\'' +
                ", Id_operatora_sieci_komorkowej=" + Id_operatora_sieci_komorkowej +
                ", Wartosc=" + Wartosc +
                ", Czy_krytyczna=" + Czy_krytyczna +
                ", Data_konserwacji=" + Data_konserwacji +
                ", Czy_monitorowane=" + Czy_monitorowane +
                ", Czy_zasilanie_awaryjne=" + Czy_zasilanie_awaryjne +
                '}';
    }

    public Integer getId_infrastruktury() {
        return Id_infrastruktury;
    }

    public void setId_infrastruktury(Integer id_infrastruktury) {
        Id_infrastruktury = id_infrastruktury;
    }

    public String getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(String id_adresu) {
        this.id_adresu = id_adresu;
    }

    public String getId_firmy_ochroniarskiej() {
        return id_firmy_ochroniarskiej;
    }

    public void setId_firmy_ochroniarskiej(String id_firmy_ochroniarskiej) {
        this.id_firmy_ochroniarskiej = id_firmy_ochroniarskiej;
    }

    public Integer getId_operatora_sieci_komorkowej() {
        return Id_operatora_sieci_komorkowej;
    }

    public void setId_operatora_sieci_komorkowej(Integer id_operatora_sieci_komorkowej) {
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
    }

    public Integer getWartosc() {
        return Wartosc;
    }

    public void setWartosc(Integer wartosc) {
        Wartosc = wartosc;
    }

    public boolean isCzy_krytyczna() {
        return Czy_krytyczna;
    }

    public void setCzy_krytyczna(boolean czy_krytyczna) {
        Czy_krytyczna = czy_krytyczna;
    }

    public String getData_konserwacji() {
        return Data_konserwacji;
    }

    public void setData_konserwacji(String data_konserwacji) {
        Data_konserwacji = data_konserwacji;
    }

    public boolean isCzy_monitorowane() {
        return Czy_monitorowane;
    }

    public void setCzy_monitorowane(boolean czy_monitorowane) {
        Czy_monitorowane = czy_monitorowane;
    }

    public boolean isCzy_zasilanie_awaryjne() {
        return Czy_zasilanie_awaryjne;
    }

    public void setCzy_zasilanie_awaryjne(boolean czy_zasilanie_awaryjne) {
        Czy_zasilanie_awaryjne = czy_zasilanie_awaryjne;
    }
}

