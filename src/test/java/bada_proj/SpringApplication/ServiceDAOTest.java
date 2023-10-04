package bada_proj.SpringApplication;

import bada_proj.SpringApplication.Service.Adresy;
import bada_proj.SpringApplication.Service.Operatorzy_sieci_komorkowej;
import bada_proj.SpringApplication.Service.Poczty;
import bada_proj.SpringApplication.Service.ServiceDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceDAOTest extends Object {

    private ServiceDAO dao;

    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        dataSource.setUsername("badagrb11");
        dataSource.setPassword("BADAGRB11");
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new ServiceDAO(new JdbcTemplate(dataSource));
    }

    @Test
    void list() {
        List<Operatorzy_sieci_komorkowej> listAdresy =  dao.list(Operatorzy_sieci_komorkowej.class, "Operatorzy_sieci_komorkowej");
        System.out.println(listAdresy);
        assertFalse(listAdresy.isEmpty());
    }

    @Test
    void save() {
        //Adresy adres = new Adresy(102, "gdzies223", "jakas2", 12,null,4);
        //dao.save(adres, "Adresy");
        Poczty poczta = new Poczty(8, "05-123", "jakas");
        dao.save(poczta, "Poczty");
    }

    @Test
    void get() {
        int id = 41;
        Adresy adres = (Adresy) dao.get(Adresy.class, "Adresy", id,"id_adresu");
        System.out.println(adres);
        assertNotNull(adres);
    }

    @Test
    void update() {
        Adresy adres = new Adresy();
        adres.setId_adresu(102);
        adres.setId_poczty(5);
        adres.setMiejscowosc("warszawka");
        adres.setNumer_budynku(7);
        adres.setUlica("politechniczna");

        dao.update(adres, "Adresy", "id_adresu");

    }

    @Test
    void delete() {
        dao.delete(102, "Adresy", "id_adresu");
    }
}