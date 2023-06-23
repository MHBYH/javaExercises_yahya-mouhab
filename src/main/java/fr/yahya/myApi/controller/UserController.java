package fr.yahya.myApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.yahya.myApi.model.User;
import fr.yahya.myApi.service.UserService;

@RestController
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
    this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam int id) { 
    User user = userService.getUser(id);
    return user;
    }


    @PostMapping("/user")
    public User createUser(@RequestBody UserRequest body) {
    String name = body.getName();
    int age = body.getAge();    
    return userService.createUser(name, age);
    }

    @PutMapping("/user") 
    public User updateUser(@RequestParam  int id, @RequestBody UserRequest body){
        return userService.updateUser(id, body.getName(), body.getAge());

    }
   
   
    /* À l'intérieur de cette méthode, appelez la méthode « updateUser » du « userService », avec les
paramètres « id » et ceux de « body » que vous récupérez avec les « getters ». Vous
récupérerez un objet de type « User » que vous retournerez. */
}
