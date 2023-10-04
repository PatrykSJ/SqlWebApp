package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Klienci implements TableInterface {

    private Integer Id_klienta;
    private String Imie;
    private String Nazwisko;
    private String Numer_telefonu;
    private String Adres_email ;
    private boolean Czy_newsletter ;
    private Integer Id_operatora_sieci_komorkowej;
    private Integer id_adresu;

    public Klienci() {

    }

    public Klienci(Integer id_klienta, String imie, String nazwisko, String numer_telefonu, String adres_email, boolean czy_newsletter, Integer id_operatora_sieci_komorkowej, Integer id_adresu) {
        Id_klienta = id_klienta;
        Imie = imie;
        Nazwisko = nazwisko;
        Numer_telefonu = numer_telefonu;
        Adres_email = adres_email;
        Czy_newsletter = czy_newsletter;
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
        this.id_adresu = id_adresu;
    }

    @Override
    public String toString() {
        return "Klienci{" +
                "Id_klienta=" + Id_klienta +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Numer_telefonu='" + Numer_telefonu + '\'' +
                ", Adres_email='" + Adres_email + '\'' +
                ", Czy_newsletter=" + Czy_newsletter +
                ", Id_operatora_sieci_komorkowej=" + Id_operatora_sieci_komorkowej +
                ", id_adresu=" + id_adresu +
                '}';
    }

    public Integer getId_klienta() {
        return Id_klienta;
    }

    public void setId_klienta(Integer id_klienta) {
        Id_klienta = id_klienta;
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

    public String getAdres_email() {
        return Adres_email;
    }

    public void setAdres_email(String adres_email) {
        Adres_email = adres_email;
    }

    public boolean isCzy_newsletter() {
        return Czy_newsletter;
    }

    public void setCzy_newsletter(boolean czy_newsletter) {
        Czy_newsletter = czy_newsletter;
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
}

