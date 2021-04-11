import entity.Pizza;
import entity.PizzaBox;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class Application {
    public static void main(String[] args) {
//
        Pizza pizza1 = new Pizza(1,"Pepperoni",300,300);
        Pizza pizza2 = new Pizza(2,"Margarita",350,300);
        Pizza pizza3 = new Pizza(3,"Cheese",400,300);
        Pizza pizza4 = new Pizza(4,"Meat",200,300);
//        create(pizza1);
//        create(pizza2);
//        create(pizza3);
//        create(pizza4);
//        List<Pizza> pizzasResult = getAllPizza()
                ;
//        System.out.println(pizzasResult);
        PizzaBox pizzaBox1 = new PizzaBox(1,"Red","Pekin",pizza1);

        PizzaBox.send(pizzaBox1);
    }
    public static Integer create(Pizza pizza) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(pizza);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Успешно создан " + pizza.toString());
        return pizza.getId();
    }
    public static List<Pizza> getAllPizza(){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unckecked")
        List<Pizza> employees = hibernateSession.createQuery("FROM Pizza where price < 350").list();
        hibernateSession.close();
        System.out.println("Пиццы:" + employees.size() + "шт ");
        return employees;
    }
    public static Integer create(PizzaBox pizzaBox) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(pizzaBox);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Успешно создан " + pizzaBox.toString());
        return pizzaBox.getId();
    }
    public static List<PizzaBox> getAllPizzaBox(){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unckecked")
        List<PizzaBox> employees = hibernateSession.createQuery("FROM PizzaBox").list();
        hibernateSession.close();
        System.out.println("Пиццы:" + employees.size() + "шт ");
        return employees;
    }
    public static void update(PizzaBox pizzaBox){
        Session HibernateSession = HibernateUtil.getSessionFactory().openSession();
        HibernateSession.beginTransaction();
        PizzaBox pizzaBox1 = HibernateSession.load(PizzaBox.class,pizzaBox.getId());
        pizzaBox1.setColor(pizzaBox1.getColor());
        pizzaBox1.setDestinationAddress(pizzaBox1.getDestinationAddress());
        pizzaBox1.setPizza(pizzaBox1.getPizza());
        HibernateSession.getTransaction().commit();
        HibernateSession.close();
        System.out.println("Успешно изменено " + pizzaBox1.toString());
    }

}
//Создать коробку
//Получить коробки
//Возможность переложить пиццу (убрать из коробки пиццу, положить туда другую)
//Отправить коробку
// напечатать в консоль сообщение "Доставляем пиццу [название_пиццы] по адресу [адрес], цвет коробки [цвет], стоимость [цена_пиццы]".
// Отправлять пустые коробки НЕЛЬЗЯ (выводить ошибку).