package itacademy.springboot.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "animal")
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "age",nullable = false)
    private Integer age;
    @Column(name = "weight",nullable = false)
    private Integer weight;
    @Column(name = "habitat",nullable = false)
    private String habitat;

}
