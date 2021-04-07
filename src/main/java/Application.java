import entity.Pizza;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class Application {
    public static void main(String[] args) {
//
//        Pizza pizza1 = new Pizza(1,"Pepperoni",300,300);
//        Pizza pizza2 = new Pizza(2,"Margarita",350,300);
//        Pizza pizza3 = new Pizza(3,"Cheese",400,300);
//        Pizza pizza4 = new Pizza(4,"Meat",200,300);
//        create(pizza1);
//        create(pizza2);
//        create(pizza3);
//        create(pizza4);
        List<Pizza> pizzasResult = getAll();
        System.out.println(pizzasResult);
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
    public static List<Pizza> getAll(){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unckecked")
        List<Pizza> employees = hibernateSession.createQuery("FROM Pizza where price < 350").list();
        hibernateSession.close();
        System.out.println("Пиццы:" + employees.size() + "шт ");
        return employees;
    }
}
