package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post")
@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "text")
    private String text;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
    @Column(name = "date_of_creation")
    private Date date;
}