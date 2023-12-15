package com.beyondid.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    private String firstName;
    private String lastName;
    private String mobilePhone;
    private String secondEmail;
    private String login;
    private String email;
    private boolean val;

}
