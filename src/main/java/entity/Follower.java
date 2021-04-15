package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "follower")
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "follower_id",nullable = false)
    private User follower;
    @ManyToOne
    @JoinColumn(name = "followed_id",nullable = false)
    private User followed;

}
