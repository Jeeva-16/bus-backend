package com.example.project_bus.Controller;

import com.example.project_bus.Model.Bus;
import com.example.project_bus.Model.Ticket;
import com.example.project_bus.Model.User;
import com.example.project_bus.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class BusController {
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(){
      return "index";
    }
    @GetMapping("/login")
    public String login(){

        return "login";
    }
    @GetMapping("/register/{id}")
    public String register(Model model){
        User user = new User();
        model.addAttribute(user);
        return "register";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/index";
    }
   @GetMapping("/search")
    public String search(Model model){
        List<Bus> bus = userService.getAllBuses();
        model.addAttribute("bus",bus);
        return "search";
   }
   @GetMapping("/showFormBook/{id}")
    public String Ticket(Model model){
       Ticket ticket = new Ticket();
       model.addAttribute(ticket);
       return "showFormBook";
   }
   @PostMapping("/saveTicket")
    public String saveTicket(@ModelAttribute("ticket") Ticket ticket){
        userService.saveTicket(ticket);
        return "redirect:/index";
   }


}
