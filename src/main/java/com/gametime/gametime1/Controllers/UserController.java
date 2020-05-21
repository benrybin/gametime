package com.gametime.gametime1.Controllers;

import com.gametime.gametime1.DTO.UserDataDTO;
import com.gametime.gametime1.DTO.UserResponseDTO;
import com.gametime.gametime1.Models.User;
import com.gametime.gametime1.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
public class UserController {

    private UserService userService;
    private ModelMapper modelMapper;


    @Autowired
    public UserController(ModelMapper modelMapper, UserService userService){
        this.modelMapper = modelMapper;
        this.userService = userService;
    }


    @PostMapping("/signin")
    @ResponseStatus(HttpStatus.CREATED)
    public String login(
            @RequestParam String username,
            @RequestParam String password) {
        return userService.signIn(username, password);
    }

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public String signup(@RequestBody UserDataDTO user) {
        return userService.signUp(modelMapper.map(user, User.class));
    }


    @GetMapping(value = "/me")
    public UserResponseDTO whoami(HttpServletRequest req) {
        return modelMapper.map(userService.whoami(req), UserResponseDTO.class);
    }

}
