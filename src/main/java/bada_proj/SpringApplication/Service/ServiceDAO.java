package bada_proj.SpringApplication.Service;

import bada_proj.SpringApplication.TableInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class ServiceDAO<T extends TableInterface> {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private HashMap<String, String[]> columnsList= new HashMap<>();
    public ServiceDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
        columnsList.put("Adresy", new String[]{"miejscowosc", "ulica", "numer_budynku", "numer_lokalu", "id_poczty"});
        columnsList.put("Poczty", new String[]{"kod_poczty", "miejscowosc_poczty"});
        columnsList.put("Agregatornie", new String[]{"Liczba_agregatorow", "Maksymalna_moc","Czas_pracy","Zuzycie_paliwa"});
        columnsList.put("Firmy_ochroniarskie", new String[]{"Nazwa", "Czy_oferuje_monitoring","awaryjny_numer_telefonu","id_adresu"});
        columnsList.put("Infrastruktury", new String[ ]{"Czy_krytyczna","Wartosc","Data_konserwacji", "Czy_monitorowane", "Czy_zasilanie_awaryjne", "Id_operatora_sieci_komorkowej", "id_adresu", "id_firmy_ochroniarskiej" });
        columnsList.put("Klienci", new String[]{"Imie", "Nazwisko","Numer_telefonu","Adres_email", "Czy_newsletter", "Id_operatora_sieci_komorkowej", "id_adresu" });
        columnsList.put("Listy_uslug", new String[]{"Rodzaj_uslugi", "Koszt","Czy_zdalna","Czy_gwarancja"});
        columnsList.put("Nieruchomosci", new String[]{"Rodzaj_nieruchomosci", "Powierzchnia","Waznosc_badan_ppoz","Maksymalna_liczba_stanowisk", "Czy_monitorowane", "Id_operatora_sieci_komorkowej", "id_adresu", "Id_firmy_ochroniarskiej" });
        columnsList.put("Operatorzy_sieci_komorkowej", new String[]{"Nazwa_operatora", "Data_zalozenia","Kapital"});
        columnsList.put("Pakiety_uslug", new String[]{"Rodzaj_pakietu", "Cena","Data_obowiazywania", "Id_klienta"});
        columnsList.put("Pracownicy", new String[]{"Imie", "Nazwisko","PESEL","Data_urodzenia", "Data_zatrudnienia", "Nr_telefonu", "Adres_email", "Id_operatora_sieci_komorkowej", "id_adresu", "Id_stanowiska" });
        columnsList.put("Pracownicy_infrastruktury", new String[]{"Id_pracownika", "Id_infrastruktury","Czy_administrator"});
        columnsList.put("Pracownicy_nieruchomosci", new String[]{"Id_pracownika", "Id_infrastruktury","Czy_administrator"});
        columnsList.put("Pracownicy_uslugi", new String[]{"Id_pracownika", "Id_uslugi"});
        columnsList.put("Serwerownie", new String[]{"Id_infrastruktury", "Pojemnosc_dyskow", "Czy_backupowana", "Predkosc_polaczenia", "Wilgotnosc", "Temperatura"});
        columnsList.put("Stacje_przekaznikowe", new String[]{"Id_infrastruktury", "Wysokosc_masztu", "Ilosc_anten", "Zasięg", "Liczba_klientow"});
        columnsList.put("Stanowiska", new String[]{"Rodzaj_wyksztalcenia", "Czy_mobilne", "Rodzaj_stanowiska"});
        columnsList.put("Uslugi", new String[]{"Czas_trwania", "Id_operatora_sieci_komorkowej", "Id_klienta","Id_Listy_Uslug" });
        columnsList.put("Wlasciciele", new String[]{"Imie", "Nazwisko", "Numer_telefonu","Id_operatora_sieci_komorkowej", "Id_adresu" });
    }


    public List<T> list(Class<T> givenClass, String tableName){
        String sql = "SELECT * FROM "+tableName;
        List<T> listAdresy;
        listAdresy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(givenClass));

        return listAdresy;
    }

    public List<T> listForUser(Class<T> givenClass, String tableName, String nazwaId, Integer Id){
        String sql = "SELECT * FROM "+tableName+" WHERE "+nazwaId+" = "+Id;
        List<T> listAdresy;
        listAdresy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(givenClass));

        return listAdresy;
    }



    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(TableInterface givenObject, String tableName) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName(tableName).usingColumns(columnsList.get(tableName));
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(givenObject);
        insertActor.execute(param);
    }


    /* Read – odczytywanie danych z bazy */
    public <T> T get(Class<T> givenClass, String tableName, int id, String nazwaPolaId) {
        String sql = "SELECT * FROM "+tableName+" WHERE "+nazwaPolaId+" = ?";
        Object[] args = {id};
        T adres;
        adres = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(givenClass));
        return adres;
    }


    /* Update – aktualizacja danych */
    public void update(TableInterface givenObject, String tableName, String nazwaPolaId) {
        String[] arrayOfColNames= columnsList.get(tableName);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<columnsList.get(tableName).length; i++){
            sb.append(arrayOfColNames[i]);
            sb.append("=:");
            sb.append(arrayOfColNames[i]);
            if(i!=columnsList.get(tableName).length-1){
                sb.append(", ");
            }
        }
        String sql = "UPDATE "+tableName+" SET "+sb.toString()+" WHERE "+nazwaPolaId+"=:"+nazwaPolaId;
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(givenObject);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);

    }


    /* Delete – wybrany rekord z danym id */
    public void delete(int id, String tableName, String nazwaPolaId) {
        String sql = "DELETE FROM "+tableName+" WHERE "+nazwaPolaId+" = ?";
        jdbcTemplate.update(sql, id);
    }
}
