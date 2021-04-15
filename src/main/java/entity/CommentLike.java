package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "comment_like")
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "comment_id",nullable = false)
    private Comment comment;
}
