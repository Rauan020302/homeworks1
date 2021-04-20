package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login",length = 25,unique = true,nullable = false)
    private String login;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "biography")
    private String biography;

}
