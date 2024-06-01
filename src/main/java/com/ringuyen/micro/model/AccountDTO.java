package com.ringuyen.micro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
    private String id;

    private String name;

    private String password;

    private String username;

    private Set<String> roles;
}
