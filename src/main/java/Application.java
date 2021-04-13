import entity.Championship;
import entity.Country;
import entity.SportsType;
import entity.Team;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;


public class Application {
    public static void main(String[] args) {
//        deleteAllChampionship();
//        deleteAllTeam();
//        deleteAllCountry();
//        deleteAllSportType();


        Country country1 = new Country();
        country1.setName("Germany");
        Country country2 = new Country();
        country2.setName("Spain");
        Country country3 = new Country();
        country3.setName("England");
//             saveOrUpdate(country1);
//             saveOrUpdate(country2);
//             saveOrUpdate(country3);

        SportsType sportsType1 = new SportsType();
        sportsType1.setName("Football");
        SportsType sportsType2 = new SportsType();
        sportsType2.setName("Volleyball");
        SportsType sportsType3 = new SportsType();
        sportsType3.setName("Basketball");
//             saveOrUpdate(sportsType1);
//             saveOrUpdate(sportsType2);
//             saveOrUpdate(sportsType3);

        Team team1 = Team.builder().name("Team_A").addressLogo("USA").website("Team_A.com").sportsType(sportsType1).build();
        Team team2 = Team.builder().name("Team_B").addressLogo("Russia").website("Team_B.com").sportsType(sportsType2).build();
        Team team3 = Team.builder().name("Team_C").addressLogo("China").website("Team_C.com").sportsType(sportsType3).build();
                saveOrUpdate(team1);
                saveOrUpdate(team2);
                saveOrUpdate(team3);

        Championship championship1 = Championship.builder().country(country1).name("Championship_A").sportsType(sportsType1).build();
        Championship championship2 = Championship.builder().country(country2).name("Championship_B").sportsType(sportsType2).build();
        Championship championship3 = Championship.builder().country(country3).name("Championship_C").sportsType(sportsType3).build();
                saveOrUpdate(championship1);
                saveOrUpdate(championship2);
                saveOrUpdate(championship3);

    }
    public static <T> T saveOrUpdate(T entity){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        return entity;
    }
    public static void deleteAllCountry(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Country ");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Успешно удалены все записи в Country.");
    }
    public static void deleteAllSportType(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM SportsType ");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Успешно удалены все записи в SportType.");
    }
    public static void deleteAllTeam(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Team ");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Успешно удалены все записи в Team.");
    }
    public static void deleteAllChampionship(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Championship ");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Успешно удалены все записи в Championship.");
    }

}
