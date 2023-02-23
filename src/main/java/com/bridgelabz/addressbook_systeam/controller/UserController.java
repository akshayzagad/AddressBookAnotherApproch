package com.bridgelabz.addressbook_systeam.controller;

import com.bridgelabz.addressbook_systeam.dto.UserDto;
import com.bridgelabz.addressbook_systeam.dto.UserLocationDTO;
import com.bridgelabz.addressbook_systeam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getAll")
    public List<UserLocationDTO> getAllUsersLocation(){
        return userService.getAllUsersLocation();
    }
    @PostMapping("/create")
    public String createAllUserInformation(@RequestBody UserDto userDto){
        userService.createAllUserInformation(userDto);
        return "Create Successfully";
    }
}
