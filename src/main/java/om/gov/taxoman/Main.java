package om.gov.taxoman;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import om.gov.taxoman.entity.Product;
import om.gov.taxoman.entity.Question;

public class Main {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("salim.jpa");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Question question = new Question();
        question.setQuestion("What is your Favorite Color ?");
        question.setAnswer("Gray");

        em.persist(question);

        em.getTransaction().commit();
        em.close();



        emf.close();


    }
}