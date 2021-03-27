package org.sid.texes2.web;

import javax.validation.Valid;
import org.sid.texes2.dao.EntrepriseRepository2;
import org.sid.texes2.dao.TaxeRepository2;
import org.sid.texes2.entities.Entreprise2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class taxeController2 {
    @Autowired
    private EntrepriseRepository2 entrepriseRepository2;
    @Autowired
    private TaxeRepository2 taxeRepository2;
    
    @RequestMapping(value="/entreprise2", method=RequestMethod.GET)
    public String index(Model model, 
            @RequestParam(name = "motCle", defaultValue = "") String motCle,
            @RequestParam(name = "page", defaultValue = "0") int p, 
            @RequestParam(name = "size", defaultValue = "4") int s){
        Page<Entreprise2> pageEntreprise2 = entrepriseRepository2.chercher("%"+motCle+"%",PageRequest.of(p, s));
        model.addAttribute("listEntreprise2", pageEntreprise2.getContent());
        int[] pages = new int[pageEntreprise2.getTotalPages()];
        model.addAttribute("pages", pages);
        model.addAttribute("pageCourante", p);
        model.addAttribute("motCle", motCle);
        return "entreprise2";
    }
    
    @RequestMapping(value="/formEntreprise2")
    public String formEntrep(Model model){
        model.addAttribute("entreprise2", new Entreprise2());
        return "formEntreprise2";
    }
    
    @RequestMapping(value="/saveEntreprise2")
    public String saveEntrep(Model model, @Valid Entreprise2 e, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "formEntreprise2";
        entrepriseRepository2.save(e);
        return "redirect:/entreprise2";
    }
     @RequestMapping(value="/taxes2")
    public String lesTaaxes(Model model,Long code){
        Entreprise2 e = new Entreprise2();
        e.setCode(code);
        model.addAttribute("taxes", taxeRepository2.findByEntreprise2(e));
        model.addAttribute("entreprises", entrepriseRepository2.findAll());
        return "taxes2";
    }
    
    @RequestMapping(value="/template2")
    public String index(){
        return "template2";
    }
    
}
