import entity.Post;
import entity.User;
import org.hibernate.Session;
import util.HiberanteUtil;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        //select *
        //from users u
        //order by u.biography;
        //
        //select u.id ,count(p.id)
        //from users u inner join
        //post p on u.id = p.user_id
        //group by u.id;
        //
        //select u.id, count(l.id)
        //from users u inner join
        //likes l on u.id = l.user_id
        //group by u.id;
        //
        //select p.id, count(p.id)
        //from post p inner join
        //likes l on p.id = l.post_id
        //group by p.id;
        //
        //select *
        //from users u inner join
        //post p on u.id = p.user_id
        //where u.id = 1
        //order by p.date_of_creation desc;

//        List<User> users1 = getAllUsers();
//        System.out.println(users1);
//
//        List<User> users2 = getAllPostsById();
//        System.out.println(users2);
//
//        List<User> users3 = getAllUsersByIdWithPost();
//        System.out.println(users3);
//
//        List<Post> posts1 = getAllPostsIdWithLike();
//        System.out.println(posts1);
//
//        List<Post> posts2 = getAllPostsByUserId();
//        System.out.println(posts2);


    }
    public static List<User> getAllUsers(){
        Session hibernateSession = HiberanteUtil.getSessionFactory().openSession();
        List<User> users = hibernateSession.createQuery("FROM User u order by u.biography").list();
        hibernateSession.close();
        System.out.println("Найдено " + users.size() + " сотрудников");
        return users;
    }
    public static List<User> getAllPostsId(){
        Session hibernateSession = HiberanteUtil.getSessionFactory().openSession();
        List<User> users = hibernateSession.createQuery("select u.id ,count(p.id) FROM User u inner join Post p on u.id = p.user.id group by u.id").list();
        hibernateSession.close();
        return users;
    }
    public static List<User> getAllUsersIdWithPost(){
        Session hibernateSession = HiberanteUtil.getSessionFactory().openSession();
        List<User> users = hibernateSession.createQuery("select u.id ,count(l.id) from User u inner join Like l on u.id = l.user.id group by u.id").list();
        hibernateSession.close();
        return users;
    }
    public static List<Post> getAllPostsIdWithLike(){
        Session hibernateSession = HiberanteUtil.getSessionFactory().openSession();
        List<Post> posts = hibernateSession.createQuery("select p.id,count(p.id) from Post p inner join Like l on p.id = l.post.id group by p.id").list();
        hibernateSession.close();
        return posts;
    }
    public static List<Post> getAllPostsByUserId(){
        Session hibernateSession = HiberanteUtil.getSessionFactory().openSession();
        List<Post> posts = hibernateSession.createQuery("from User u inner join Post p on u.id = p.user.id where u.id = 1 order by p.date desc ").list();
        hibernateSession.close();
        return posts;
    }


}
