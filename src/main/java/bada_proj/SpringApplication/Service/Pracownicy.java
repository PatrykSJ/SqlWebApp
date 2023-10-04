package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class Pracownicy implements TableInterface {

    private Integer Id_pracownika ;
    private String Imie ;
    private String Nazwisko ;
    private String PESEL;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Data_urodzenia ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Data_zatrudnienia ;
    private String Nr_telefonu;
    private String Adres_email ;
    private Integer Id_operatora_sieci_komorkowej ;
    private Integer id_adresu ;
    private Integer Id_stanowiska ;
    public Pracownicy() {

    }

    public Pracownicy(Integer id_pracownika, String imie, String nazwisko, String PESEL, Date data_urodzenia, Date data_zatrudnienia, String nr_telefonu, String adres_email, Integer id_operatora_sieci_komorkowej, Integer id_adresu, Integer id_stanowiska) {
        Id_pracownika = id_pracownika;
        Imie = imie;
        Nazwisko = nazwisko;
        this.PESEL = PESEL;
        Data_urodzenia = data_urodzenia;
        Data_zatrudnienia = data_zatrudnienia;
        Nr_telefonu = nr_telefonu;
        Adres_email = adres_email;
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
        this.id_adresu = id_adresu;
        Id_stanowiska = id_stanowiska;
    }

    @Override
    public String toString() {
        return "Pracownicy{" +
                "Id_pracownika=" + Id_pracownika +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", Data_urodzenia=" + Data_urodzenia +
                ", Data_zatrudnienia=" + Data_zatrudnienia +
                ", Nr_telefonu='" + Nr_telefonu + '\'' +
                ", Adres_email='" + Adres_email + '\'' +
                ", Id_operatora_sieci_komorkowej=" + Id_operatora_sieci_komorkowej +
                ", id_adresu=" + id_adresu +
                ", Id_stanowiska=" + Id_stanowiska +
                '}';
    }

    public Integer getId_pracownika() {
        return Id_pracownika;
    }

    public void setId_pracownika(Integer id_pracownika) {
        Id_pracownika = id_pracownika;
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

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public Date getData_urodzenia() {
        return Data_urodzenia;
    }

    public void setData_urodzenia(Date data_urodzenia) {
        Data_urodzenia = data_urodzenia;
    }

    public Date getData_zatrudnienia() {
        return Data_zatrudnienia;
    }

    public void setData_zatrudnienia(Date data_zatrudnienia) {
        Data_zatrudnienia = data_zatrudnienia;
    }

    public String getNr_telefonu() {
        return Nr_telefonu;
    }

    public void setNr_telefonu(String nr_telefonu) {
        Nr_telefonu = nr_telefonu;
    }

    public String getAdres_email() {
        return Adres_email;
    }

    public void setAdres_email(String adres_email) {
        Adres_email = adres_email;
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

    public Integer getId_stanowiska() {
        return Id_stanowiska;
    }

    public void setId_stanowiska(Integer id_stanowiska) {
        Id_stanowiska = id_stanowiska;
    }
}

