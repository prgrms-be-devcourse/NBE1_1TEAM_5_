package com.example.gccoffee.service.user;

import com.example.gccoffee.model.Email;
import com.example.gccoffee.model.Password;
import com.example.gccoffee.model.User;

import java.util.List;

public interface UserService {

    List<User> readAll();
    User readDetail(Email email);
    User signUp(User user);
    void edit(Email email, Password password);
    void delete(Email email);
}
