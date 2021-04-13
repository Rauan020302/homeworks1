package entity;

import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.mapping.Join;

import javax.persistence.*;

@Entity
@Table(name = "championship")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Championship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Country country;
    @Column(name = "name")
    private String name;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "sport_id")
    private SportsType sportsType;

}
