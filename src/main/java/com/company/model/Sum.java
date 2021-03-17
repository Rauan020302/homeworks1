package com.company.model;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
@XmlRootElement(name="sum")
public class Sum {
    private Integer first;
    private Integer second;
    private Integer total;


}
