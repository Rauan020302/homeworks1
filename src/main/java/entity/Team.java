package entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "team")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Team {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address_logo")
    private String addressLogo;
    @Column(name = "website")
    private String website;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sport_id")
    private SportsType sportsType;
}
