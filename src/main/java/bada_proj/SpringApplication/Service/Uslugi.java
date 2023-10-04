package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

public class Uslugi implements TableInterface {

    private Integer Id_uslugi ;
    private Integer Czas_trwania ;
    private Integer Id_operatora_sieci_komorkowej ;
    private Integer Id_klienta;
    private Integer Id_Listy_Uslug ;

    public Uslugi() {

    }

    public Uslugi(Integer id_uslugi, Integer czas_trwania, Integer id_operatora_sieci_komorkowej, Integer id_klienta, Integer id_Listy_Uslug) {
        Id_uslugi = id_uslugi;
        Czas_trwania = czas_trwania;
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
        Id_klienta = id_klienta;
        Id_Listy_Uslug = id_Listy_Uslug;
    }

    @Override
    public String toString() {
        return "Uslugi{" +
                "Id_uslugi=" + Id_uslugi +
                ", Czas_trwania=" + Czas_trwania +
                ", Id_operatora_sieci_komorkowej=" + Id_operatora_sieci_komorkowej +
                ", Id_klienta=" + Id_klienta +
                ", Id_Listy_Uslug=" + Id_Listy_Uslug +
                '}';
    }

    public Integer getId_uslugi() {
        return Id_uslugi;
    }

    public void setId_uslugi(Integer id_uslugi) {
        Id_uslugi = id_uslugi;
    }

    public Integer getCzas_trwania() {
        return Czas_trwania;
    }

    public void setCzas_trwania(Integer czas_trwania) {
        Czas_trwania = czas_trwania;
    }

    public Integer getId_operatora_sieci_komorkowej() {
        return Id_operatora_sieci_komorkowej;
    }

    public void setId_operatora_sieci_komorkowej(Integer id_operatora_sieci_komorkowej) {
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
    }

    public Integer getId_klienta() {
        return Id_klienta;
    }

    public void setId_klienta(Integer id_klienta) {
        Id_klienta = id_klienta;
    }

    public Integer getId_Listy_Uslug() {
        return Id_Listy_Uslug;
    }

    public void setId_Listy_Uslug(Integer id_Listy_Uslug) {
        Id_Listy_Uslug = id_Listy_Uslug;
    }
}

