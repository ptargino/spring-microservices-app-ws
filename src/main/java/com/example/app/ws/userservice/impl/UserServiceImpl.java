package com.example.app.ws.userservice.impl;

import com.example.app.ws.ui.model.request.UserDetailsRequestModel;
import com.example.app.ws.ui.model.response.UserRest;
import com.example.app.ws.userservice.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetailsRequestModel) {
        UserRest userRest = new UserRest();
        userRest.setFirstName(userDetailsRequestModel.getFirstName());
        userRest.setLastName(userDetailsRequestModel.getLastName());
        userRest.setEmail(userDetailsRequestModel.getEmail());
        userRest.setPassword(userDetailsRequestModel.getPassword());

        String userId = UUID.randomUUID().toString();
        userRest.setUserId(userId);

        if (this.users == null)
            this.users = new HashMap<>();
        users.put(userId, userRest);
        return userRest;
    }
}
