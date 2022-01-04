package com.example.fitandgo_470.Controller;

import com.example.fitandgo_470.Dao.Gymdao;
import com.example.fitandgo_470.Dao.Userinfodao;
import com.example.fitandgo_470.Model.Gym;
import com.example.fitandgo_470.Model.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class Gymcontroller {
    @Autowired
    private Gymdao gymDao;
    @Autowired
    private Userinfodao userInfodao;



    @GetMapping("/addgymcandidate")
    public String addgymcandidate(){
        return "AddGymCandidate";
    }


    @PostMapping("/addnewcandidate")
    public String submittedCandidate(@ModelAttribute("userinfo") Userinfo user, HttpServletRequest request){
        HttpSession session = request.getSession();
        userInfodao.save(user);
        session.setAttribute("msg",user.getFirstname());
        return "AddGymCandidate";
    }


    @GetMapping("/addgym")
    public String showGymForm(){
        return "addedGym";
    }



    @PostMapping("/addnewgym")
    public String addGym(@ModelAttribute("gym") Gym gym, HttpServletRequest request) {
        HttpSession session = request.getSession();
        gymDao.save(gym);
        session.setAttribute("msg",gym.getName());
        return "addedGym";
    }
}
