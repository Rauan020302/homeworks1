package com.company.model;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@XmlRootElement(name="user")
public class User {
    private String name;
    private String password;
    private String key;

}
