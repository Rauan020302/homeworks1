package entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "country")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Country {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
}
