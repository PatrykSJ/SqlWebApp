package bada_proj.SpringApplication;

import bada_proj.SpringApplication.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@Configuration
@EnableWebSecurity
@Controller
public class AppController implements WebMvcConfigurer {

    @Autowired
    private ServiceDAO dao;
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/Strona-Główna").setViewName("Strona-Główna");
        registry.addViewController("/Kontakt").setViewName("Kontakt");
        registry.addViewController("/Baza-Danych").setViewName("Baza-Danych");
        registry.addViewController("/").setViewName("Strona-Główna");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/Logowanie").setViewName("Logowanie");
    }



    @RequestMapping(value={"/Baza-Danych"})
    public String showBazaDanych(HttpServletRequest request, Model model) {
        //Dla admina baza danych
        List<Adresy> listAdres = dao.list(Adresy.class, "Adresy");
        model.addAttribute("listAdres", listAdres);
        List<Poczty> listPoczta = dao.list(Poczty.class, "Poczty");
        model.addAttribute("listPoczta", listPoczta);
        List<Wlasciciele> listWlasciciel = dao.list(Wlasciciele.class, "Wlasciciele");
        model.addAttribute("listWlasciciel", listWlasciciel);
        List<Klienci> listKlient = dao.list(Klienci.class, "Klienci");
        model.addAttribute("listKlient", listKlient);
        List<Pracownicy> listPracownik = dao.list(Pracownicy.class, "Pracownicy");
        model.addAttribute("listPracownik", listPracownik);
        //Dla Usera Baza Danych
        List<Adresy> listAdres2 = dao.listForUser(Adresy.class, "Adresy", "id_adresu", 3);
        model.addAttribute("listAdres2", listAdres2);
        List<Poczty> listPoczta2 = dao.listForUser(Poczty.class, "Poczty", "id_poczty", 4);
        model.addAttribute("listPoczta2", listPoczta2);
        List<Klienci> listKlient2 = dao.listForUser(Klienci.class, "Klienci", "id_klienta", 1);
        model.addAttribute("listKlient2", listKlient2);
        if (request.getUserPrincipal()!=null) {
            return "/Baza-Danych";
        }
        else {
            return "errors/403";
        }
    }


    @RequestMapping(value={"/Strona-Główna"})
    public String showStronaGlowna(Model model) {
        return "/Strona-Główna";
    }

    @RequestMapping(value={"/test"})
    public String test(Model model) {
        return "errors/other";
    }

    @RequestMapping(value="/perform_logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(false);
        SecurityContextHolder.clearContext();
        session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        for (Cookie cookie : request.getCookies()) {
            cookie.setMaxAge(0);
        }

        return "Strona-Główna";
    }

    //ADRESY//
    //ADRESY//
    //ADRESY//

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping(value = "/newAdres")
    public String showNewAdresForm(Model model){
        Adresy adres = new Adresy();
        model.addAttribute("adres", adres);

        return "newForms/newAdres";
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping(value = "/saveNewAdres", method = RequestMethod.POST)
    public String saveNewAdres(@ModelAttribute("adres") Adresy adres){
        dao.save(adres, "Adresy");

        return "redirect:/Baza-Danych";
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping("/editAdres/{id_adresu}")
    public ModelAndView showAdresEditForm(@PathVariable(name="id_adresu") int id){
        ModelAndView mav = new ModelAndView("editForms/adresEditForm");
        Adresy adres = (Adresy) dao.get(Adresy.class, "Adresy", id,"id_adresu");
        mav.addObject("adres", adres);
        return mav;

    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK') or hasRole('USER')")
    @RequestMapping("/editAdres/3")
    public ModelAndView showAdresEditFormId3(){
        ModelAndView mav = new ModelAndView("editForms/adresEditForm");
        Adresy adres = (Adresy) dao.get(Adresy.class, "Adresy", 3,"id_adresu");
        mav.addObject("adres", adres);
        return mav;

    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK') or hasRole('USER')")
    @RequestMapping(value = "/updateAdres", method = RequestMethod.POST)
    public String updateAdres(@ModelAttribute("adres") Adresy adres){
        dao.update(adres, "Adresy", "id_adresu");

        return "redirect:/Baza-Danych";
    }
    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping(value = "/deleteAdres/{id_adresu}")
    public String deleteAdres(@ModelAttribute(name="id_adresu") int id){
        dao.delete(id, "Adresy", "id_adresu");

        return "redirect:/Baza-Danych";
    }


    //KLIENCI//
    //KLIENCI//
    //KLIENCI//
    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping(value = "/newKlient")
    public String showNewKlientForm(Model model){
        Klienci klient = new Klienci();
        model.addAttribute("klient", klient);

        return "newForms/newKlient";
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping(value = "/saveNewKlient", method = RequestMethod.POST)
    public String saveNewKlient(@ModelAttribute("klient") Klienci klient){
        dao.save(klient, "Klienci");

        return "redirect:/Baza-Danych";
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping("/editKlient/{id_klienta}")
    public ModelAndView showKlientEditForm(@PathVariable(name="id_klienta") int id){
        ModelAndView mav = new ModelAndView("editForms/klientEditForm");
        Klienci klient = (Klienci) dao.get(Klienci.class, "Klienci", id,"Id_klienta");
        mav.addObject("klient", klient);
        return mav;

    }
    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK') or hasRole('USER')")
    @RequestMapping("/editKlient/1")
    public ModelAndView showKlientEditFormId1(){
        ModelAndView mav = new ModelAndView("editForms/klientEditForm");
        Klienci klient = (Klienci) dao.get(Klienci.class, "Klienci", 1,"Id_klienta");
        mav.addObject("klient", klient);
        return mav;

    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK') or hasRole('USER')")
    @RequestMapping(value = "/updateKlient", method = RequestMethod.POST)
    public String updateKlient(@ModelAttribute("klient") Klienci klient){
        dao.update(klient, "Klienci", "Id_klienta");

        return "redirect:/Baza-Danych";
    }
    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping(value = "/deleteKlient/{Id_klienta}")
    public String deleteKlient(@ModelAttribute(name="Id_klienta") int id){
        dao.delete(id, "Klienci", "Id_klienta");

        return "redirect:/Baza-Danych";
    }


    //POCZTY//
    //POCZTY//
    //POCZTY//
    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping(value = "/newPoczta")
    public String showNewPocztaForm(Model model){
        Poczty poczta = new Poczty();
        model.addAttribute("poczta", poczta);

        return "newForms/newPoczta";
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping(value = "/saveNewPoczta", method = RequestMethod.POST)
    public String saveNewPoczta(@ModelAttribute("poczta") Poczty poczta){
        dao.save(poczta, "Poczty");

        return "redirect:/Baza-Danych";
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK')")
    @RequestMapping("/editPoczta/{id_poczty}")
    public ModelAndView showPocztaEditForm(@PathVariable(name="id_poczty") int id){
        ModelAndView mav = new ModelAndView("editForms/pocztaEditForm");
        Poczty poczta = (Poczty) dao.get(Poczty.class, "Poczty", id,"id_poczty");
        mav.addObject("poczta", poczta);
        return mav;

    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK') or hasRole('USER')")
    @RequestMapping("/editPoczta/4")
    public ModelAndView showPocztaEditFormId4(){
        ModelAndView mav = new ModelAndView("editForms/pocztaEditForm");
        Poczty poczta = (Poczty) dao.get(Poczty.class, "Poczty", 4,"id_poczty");
        mav.addObject("poczta", poczta);
        return mav;

    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('PRACOWNIK') or hasRole('USER')")
    @RequestMapping(value = "/updatePoczta", method = RequestMethod.POST)
    public String updatePoczta(@ModelAttribute("poczta") Poczty poczta){
        dao.update(poczta, "Poczty", "id_poczty");

        return "redirect:/Baza-Danych";
    }
    @PreAuthorize("hasRole('ADMIN')  or hasRole('PRACOWNIK')")
    @RequestMapping(value = "/deletePoczta/{id_poczty}")
    public String deletePoczta(@ModelAttribute(name="id_poczty") int id){
        dao.delete(id, "Poczty", "id_poczty");

        return "redirect:/Baza-Danych";
    }


    //PRACOWNICY//
    //PRACOWNICY//
    //PRACOWNICY//

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/newPracownik")
    public String showNewPracownikForm(Model model){
        Pracownicy pracownik = new Pracownicy();
        model.addAttribute("pracownik", pracownik);

        return "newForms/newPracownik";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/saveNewPracownik", method = RequestMethod.POST)
    public String saveNewPracownik(@ModelAttribute("pracownik") Pracownicy pracownik){
        dao.save(pracownik, "Pracownicy");

        return "redirect:/Baza-Danych";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/editPracownik/{Id_pracownika}")
    public ModelAndView showPracownikEditForm(@PathVariable(name="Id_pracownika") int id){
        ModelAndView mav = new ModelAndView("editForms/pracownikEditForm");
        Pracownicy pracownik = (Pracownicy) dao.get(Pracownicy.class, "Pracownicy", id,"Id_pracownika");
        mav.addObject("pracownik", pracownik);
        return mav;

    }
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/updatePracownik", method = RequestMethod.POST)
    public String updatePracownik(@ModelAttribute("pracownik") Pracownicy pracownik){
        dao.update(pracownik, "Pracownicy", "Id_pracownika");

        return "redirect:/Baza-Danych";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/deletePracownik/{Id_pracownika}")
    public String deletePracownik(@ModelAttribute(name="Id_pracownika") int id){
        dao.delete(id, "Pracownicy", "Id_pracownika");

        return "redirect:/Baza-Danych";
    }


    //WLASCICIELE//
    //WLASCICIELE//
    //WLASCICIELE//
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/newWlasciciel")
    public String showNewWlascicielForm(Model model){
        Wlasciciele wlasciciel = new Wlasciciele();
        model.addAttribute("wlasciciel", wlasciciel);

        return "newForms/newWlasciciel";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/newWlasciciel", method = RequestMethod.POST)
    public String saveNewWlasciciel(@ModelAttribute("wlasciciel") Wlasciciele wlasciciel){
        dao.save(wlasciciel, "Wlasciciele");

        return "redirect:/Baza-Danych";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/editWlasciciel/{Id_wlasciciela}")
    public ModelAndView showWlascicielEditForm(@PathVariable(name="Id_wlasciciela") int id){
        ModelAndView mav = new ModelAndView("editForms/wlascicielEditForm");
        Wlasciciele wlasciciel = (Wlasciciele) dao.get(Wlasciciele.class, "Wlasciciele", id,"Id_wlasciciela");
        mav.addObject("wlasciciel", wlasciciel);
        return mav;

    }
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/updateWlasciciel", method = RequestMethod.POST)
    public String updateWlasciciel(@ModelAttribute("wlasciciel") Wlasciciele wlasciciel){
        dao.update(wlasciciel, "Wlasciciele", "Id_wlasciciela");

        return "redirect:/Baza-Danych";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/deleteWlasciciel/{Id_wlasciciela}")
    public String deleteWlasciciel(@ModelAttribute(name="Id_wlasciciela") int id){
        dao.delete(id, "Wlasciciele", "Id_wlasciciela");

        return "redirect:/Baza-Danych";
    }



 }

