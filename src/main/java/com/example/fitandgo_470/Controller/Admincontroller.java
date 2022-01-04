package com.example.fitandgo_470.Controller;

import com.example.fitandgo_470.Dao.Gymdao;
import com.example.fitandgo_470.Dao.Trainerdao;
import com.example.fitandgo_470.Dao.Userinfodao;
import com.example.fitandgo_470.Model.Gym;
import com.example.fitandgo_470.Model.Trainer;
import com.example.fitandgo_470.Model.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Admincontroller {
    @Autowired
    private Userinfodao userInfodao;
    @Autowired
    private Trainerdao trainerdao;
    @Autowired
    private Gymdao gymdao;




    @GetMapping("/admin")
    public String adminPage(){
        return "adminPage";
    }



    @GetMapping("/addtrainer")
    public String addTrainer(Model model){
        List<Gym> gymList =  gymdao.findAll();
        model.addAttribute("gymList",gymList);
        return "AddTrainer";
    }





    @PostMapping("/addnewtrainer")
    public String submittedTrainer(@ModelAttribute("trainer")Trainer trainer, HttpServletRequest request,
                                   @RequestParam("gymId") int gymId){
        HttpSession session = request.getSession();
        trainer.setGymId(gymId);
        trainerdao.save(trainer);
        session.setAttribute("msg",trainer.getName());
        return "AddTrainer";
    }

}

