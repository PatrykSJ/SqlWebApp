package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;

import java.time.LocalDate;

public class Operatorzy_sieci_komorkowej implements TableInterface {

    private Integer Id_operatora_sieci_komorkowej;
    private String Nazwa_operatora ;
    private String Data_zalozenia ;
    private Integer Kapital ;

    public Operatorzy_sieci_komorkowej() {

    }

    public Operatorzy_sieci_komorkowej(Integer id_operatora_sieci_komorkowej, String nazwa_operatora, String data_zalozenia, Integer kapital) {
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
        Nazwa_operatora = nazwa_operatora;
        Data_zalozenia = data_zalozenia;
        Kapital = kapital;
    }

    @Override
    public String toString() {
        return "Operatorzy_sieci_komorkowej{" +
                "Id_operatora_sieci_komorkowej=" + Id_operatora_sieci_komorkowej +
                ", Nazwa_operatora='" + Nazwa_operatora + '\'' +
                ", Data_zalozenia=" + Data_zalozenia +
                ", Kapital=" + Kapital +
                '}';
    }

    public Integer getId_operatora_sieci_komorkowej() {
        return Id_operatora_sieci_komorkowej;
    }

    public void setId_operatora_sieci_komorkowej(Integer id_operatora_sieci_komorkowej) {
        Id_operatora_sieci_komorkowej = id_operatora_sieci_komorkowej;
    }

    public String getNazwa_operatora() {
        return Nazwa_operatora;
    }

    public void setNazwa_operatora(String nazwa_operatora) {
        Nazwa_operatora = nazwa_operatora;
    }

    public String getData_zalozenia() {
        return Data_zalozenia;
    }

    public void setData_zalozenia(String data_zalozenia) {
        Data_zalozenia = data_zalozenia;
    }

    public Integer getKapital() {
        return Kapital;
    }

    public void setKapital(Integer kapital) {
        Kapital = kapital;
    }
}

