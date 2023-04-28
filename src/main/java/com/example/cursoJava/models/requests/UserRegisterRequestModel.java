package com.example.cursoJava.models.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRegisterRequestModel {

  @NotEmpty
  private String name;

  @NotEmpty
  @Email
  private String email;

  @NotEmpty
  @Size(min = 8, max = 40)
  private String password;


}
