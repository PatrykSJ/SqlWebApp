package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Wlasciciele implements TableInterface {

    private Integer Id_wlasciciela ;
    private String Imie ;
    private String Nazwisko ;
    private String Numer_telefonu ;
    private Integer Id_operatora_sieci_komorkowej ;
    private Integer Id_adresu;

    public Wlasciciele() {

    }

    public Wlasciciele(Integer id_wlasciciela, String imie, String nazwisko, String numer_telefonu, Integer id_operatora_sieci_komorkowej, Integer id_adresu) {
        Id_wlasciciela = id_wlasciciela;
        Imie = imie;
        Nazwisko = nazwisko;
        Numer_telefonu = numer_telefonu;
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
        Id_adresu = id_adresu;
    }

    @Override
    public String toString() {
        return "Wlasciciele{" +
                "Id_wlasciciela=" + Id_wlasciciela +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Numer_telefonu='" + Numer_telefonu + '\'' +
                ", Id_operatora_sieci_komorkowej=" + Id_operatora_sieci_komorkowej +
                ", Id_adresu=" + Id_adresu +
                '}';
    }

    public Integer getId_wlasciciela() {
        return Id_wlasciciela;
    }

    public void setId_wlasciciela(Integer id_wlasciciela) {
        Id_wlasciciela = id_wlasciciela;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public String getNumer_telefonu() {
        return Numer_telefonu;
    }

    public void setNumer_telefonu(String numer_telefonu) {
        Numer_telefonu = numer_telefonu;
    }

    public Integer getId_operatora_sieci_komorkowej() {
        return Id_operatora_sieci_komorkowej;
    }

    public void setId_operatora_sieci_komorkowej(Integer id_operatora_sieci_komorkowej) {
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
    }

    public Integer getId_adresu() {
        return Id_adresu;
    }

    public void setId_adresu(Integer id_adresu) {
        Id_adresu = id_adresu;
    }
}

