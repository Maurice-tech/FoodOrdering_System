package com.mautech.response;

import com.mautech.enums.USER_ROLE;
import com.mautech.model.User;
import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;
    private String message;
    private USER_ROLE role;

}
