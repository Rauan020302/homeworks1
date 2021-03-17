package com.company.model;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@XmlRootElement(name="date")
public class CurrentTime {
    private Date date;

}
