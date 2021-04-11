package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "pizza_box")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PizzaBox {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "color")
    private String color;
    @Column(name = "destination_address")
    private String destinationAddress;
    @OneToOne
    @Column(name = "pizza_id")
    private Pizza pizza;
    public static void send(PizzaBox pizzaBox){
        if (pizzaBox.getPizza() == null){
            System.out.println("Error");
        }else{
            System.out.println("Доставляем пиццу " +pizzaBox.getPizza().getName() + " по адресу " + pizzaBox.getDestinationAddress() + ",цвет коробки " + pizzaBox.getColor() + ",стоимость " + pizzaBox.getPizza().getPrice());

        }

    }
}
