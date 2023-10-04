package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

import java.time.LocalDate;

public class Nieruchomosci implements TableInterface {

    private Integer Id_nieruchomosci ;
    private String Rodzaj_nieruchomosci ;
    private Integer Powierzchnia;
    private String Waznosc_badan_ppoz;
    private Integer Maksymalna_liczba_stanowisk;
    private boolean Czy_monitorowane ;
    private Integer Id_operatora_sieci_komorkowej ;
    private Integer id_adresu;
    private Integer Id_firmy_ochroniarskiej ;

    public Nieruchomosci() {

    }

    public Nieruchomosci(Integer id_nieruchomosci, String rodzaj_nieruchomosci, Integer powierzchnia, String waznosc_badan_ppoz, Integer maksymalna_liczba_stanowisk, boolean czy_monitorowane, Integer id_operatora_sieci_komorkowej, Integer id_adresu, Integer id_firmy_ochroniarskiej) {
        Id_nieruchomosci = id_nieruchomosci;
        Rodzaj_nieruchomosci = rodzaj_nieruchomosci;
        Powierzchnia = powierzchnia;
        Waznosc_badan_ppoz = waznosc_badan_ppoz;
        Maksymalna_liczba_stanowisk = maksymalna_liczba_stanowisk;
        Czy_monitorowane = czy_monitorowane;
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
        this.id_adresu = id_adresu;
        Id_firmy_ochroniarskiej = id_firmy_ochroniarskiej;
    }

    @Override
    public String toString() {
        return "Nieruchomosci{" +
                "Id_nieruchomosci=" + Id_nieruchomosci +
                ", Rodzaj_nieruchomosci='" + Rodzaj_nieruchomosci + '\'' +
                ", Powierzchnia=" + Powierzchnia +
                ", Waznosc_badan_ppoz=" + Waznosc_badan_ppoz +
                ", Maksymalna_liczba_stanowisk=" + Maksymalna_liczba_stanowisk +
                ", Czy_monitorowane=" + Czy_monitorowane +
                ", Id_operatora_sieci_komorkowej=" + Id_operatora_sieci_komorkowej +
                ", id_adresu=" + id_adresu +
                ", Id_firmy_ochroniarskiej=" + Id_firmy_ochroniarskiej +
                '}';
    }

    public Integer getId_nieruchomosci() {
        return Id_nieruchomosci;
    }

    public void setId_nieruchomosci(Integer id_nieruchomosci) {
        Id_nieruchomosci = id_nieruchomosci;
    }

    public String getRodzaj_nieruchomosci() {
        return Rodzaj_nieruchomosci;
    }

    public void setRodzaj_nieruchomosci(String rodzaj_nieruchomosci) {
        Rodzaj_nieruchomosci = rodzaj_nieruchomosci;
    }

    public Integer getPowierzchnia() {
        return Powierzchnia;
    }

    public void setPowierzchnia(Integer powierzchnia) {
        Powierzchnia = powierzchnia;
    }

    public String getWaznosc_badan_ppoz() {
        return Waznosc_badan_ppoz;
    }

    public void setWaznosc_badan_ppoz(String waznosc_badan_ppoz) {
        Waznosc_badan_ppoz = waznosc_badan_ppoz;
    }

    public Integer getMaksymalna_liczba_stanowisk() {
        return Maksymalna_liczba_stanowisk;
    }

    public void setMaksymalna_liczba_stanowisk(Integer maksymalna_liczba_stanowisk) {
        Maksymalna_liczba_stanowisk = maksymalna_liczba_stanowisk;
    }

    public boolean isCzy_monitorowane() {
        return Czy_monitorowane;
    }

    public void setCzy_monitorowane(boolean czy_monitorowane) {
        Czy_monitorowane = czy_monitorowane;
    }

    public Integer getId_operatora_sieci_komorkowej() {
        return Id_operatora_sieci_komorkowej;
    }

    public void setId_operatora_sieci_komorkowej(Integer id_operatora_sieci_komorkowej) {
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
    }

    public Integer getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(Integer id_adresu) {
        this.id_adresu = id_adresu;
    }

    public Integer getId_firmy_ochroniarskiej() {
        return Id_firmy_ochroniarskiej;
    }

    public void setId_firmy_ochroniarskiej(Integer id_firmy_ochroniarskiej) {
        Id_firmy_ochroniarskiej = id_firmy_ochroniarskiej;
    }
}

