package com.beyondid.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.AccessType;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credentials {

    Provider provider;
    List<Emails> emails;
    Password password;
    recoveryQuestion recovery_question;

}
