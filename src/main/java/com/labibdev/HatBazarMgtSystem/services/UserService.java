package com.labibdev.HatBazarMgtSystem.services;

import com.labibdev.HatBazarMgtSystem.dtos.LoginRequest;
import com.labibdev.HatBazarMgtSystem.dtos.RegisterRequest;
import com.labibdev.HatBazarMgtSystem.dtos.Response;
import com.labibdev.HatBazarMgtSystem.dtos.UserDTO;
import com.labibdev.HatBazarMgtSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);


}
