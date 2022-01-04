package com.example.fitandgo_470.Controller;

import com.example.fitandgo_470.Dao.Nutritionistdao;
import com.example.fitandgo_470.Model.Nutritionist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class Nutritionistcontroller {
    @Autowired
    private Nutritionistdao nutritionistdao;

    @GetMapping("/consultnutritionist")
    public String showNutritionistForm(){
        return "nutritionistForm";
    }

    @PostMapping("/addnewneutritionist")
    public String addNutritionist(@ModelAttribute("nutritionist") Nutritionist nutritionist, HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        nutritionistdao.save(nutritionist);
        httpSession.setAttribute("msg",nutritionist.getName());
        return "nutritionistForm";
    }



}


