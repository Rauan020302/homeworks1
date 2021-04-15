import entity.*;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        //Questions
        //1. В каком случае лучше использовать связи OneToOne, ManyToOne, OneToMany, ManyToMany,
        // Приведите пример из жизни.
        //@OneToOne использовать Н: человек и диплом у каждого человека один диплом и у каждого диплома один человек
        //@ManyToOne использовать Н: ученик и школа, школа одна но учеников много 
        //@OneToMany использовать Н: используем когда нам нужно со стороны школы вызвать всех учеников 
        //@ManyToMany использовать Н: ученики и книги каждый ученик может взаимодействовать с каждой книгой и наоборот 
        //2. Поясните когда лучше использовать @ManyToMany,
        // а когда создавать отдельную сущность.
        //@ManyToMany используем когда нам не нужно создавать Id или другие свойства
        //В @ManyToMany у нас нету возможности добавлять свойства
        //если нам нужно создавать несколько свойств то лучшим решением будет создать новую сущность
        User user1 = User.builder().login("login_A").password("password_A").biography("bio_A").build();
        User user2 = User.builder().login("login_B").password("password_B").biography("bio_B").build();
        User user3 = User.builder().login("login_C").password("password_C").biography("bio_C").build();
           saveOrUpdate(user1);
           saveOrUpdate(user2);
           saveOrUpdate(user3);
               Date date1 = new Date(102, Calendar.FEBRUARY,12);
               Date date2 = new Date(103, Calendar.MARCH,30);
               Date date3 = new Date(104, Calendar.APRIL,22);
        Post post1 = Post.builder().text("text_A").user(user1).date(date1).build();
        Post post2 = Post.builder().text("text_B").user(user2).date(date2).build();
        Post post3 = Post.builder().text("text_C").user(user3).date(date3).build();
           saveOrUpdate(post1);
           saveOrUpdate(post2);
           saveOrUpdate(post3);
        Like like1 = Like.builder().user(user1).post(post1).build();
        Like like2 = Like.builder().user(user2).post(post2).build();
        Like like3 = Like.builder().user(user3).post(post3).build();
           saveOrUpdate(like1);
           saveOrUpdate(like2);
           saveOrUpdate(like3);
        Follower follower1 = Follower.builder().follower(user1).followed(user1).build();
        Follower follower2 = Follower.builder().follower(user2).followed(user1).build();
        Follower follower3 = Follower.builder().follower(user3).followed(user2).build();
           checkFollower(follower1);
           checkFollower(follower2);
           checkFollower(follower3);
        Comment comment1 = Comment.builder().text("text_A").user(user1).post(post1).build();
        Comment comment2 = Comment.builder().text("text_B").user(user2).post(post2).build();
        Comment comment3 = Comment.builder().text("text_C").user(user3).post(post3).build();
           saveOrUpdate(comment1);
           saveOrUpdate(comment2);
           saveOrUpdate(comment3);

    }
    public static void checkFollower(Follower follower){
        if (follower.getFollowed().getId().equals(follower.getId())){
            System.out.println("Нельзя подписоваться на самого себя ");
        }else{
            saveOrUpdate(follower);
        }
    }
    public static <T> T saveOrUpdate(T entity){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        return entity;
    }
}
