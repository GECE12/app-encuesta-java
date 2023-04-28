package com.example.cursoJava.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cursoJava.models.requests.UserRegisterRequestModel;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/users")
public class UserController {
  
  @PostMapping() // apuntar a una ruta
  public String createUser(@RequestBody @Valid UserRegisterRequestModel userModel) {
      return "Create User 2";
  }
  

}
