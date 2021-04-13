package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "sport_type")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class SportsType {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
}
