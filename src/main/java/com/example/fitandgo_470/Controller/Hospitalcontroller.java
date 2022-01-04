package com.example.fitandgo_470.Controller;

import com.example.fitandgo_470.Dao.Hospitaldao;
import com.example.fitandgo_470.Model.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class Hospitalcontroller {
    @Autowired
    private Hospitaldao hospitaldao;

    @GetMapping("/addHospital")
    public String showHospitalForm(){
        return "HospitalForm";
    }

    @PostMapping("/addnewhospital")
    public String Addhospital(@ModelAttribute("hospital") Hospital hospital, HttpServletRequest request){
        HttpSession session = request.getSession();
        hospitaldao.save(hospital);
        session.setAttribute("msg",hospital.getName());
        return "HospitalForm";
    }

}
