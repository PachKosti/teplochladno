package service;

import entity.Order;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Random;

@Stateless
public class TestSvcImpl implements TestSvc {

    @PersistenceContext
    private EntityManager em;

    public Integer getRandom() {
        Random random = new Random();
        return random.nextInt();
    }

    public Order findOrder(Long id){
        //Session session = HibernateUtil.getSessionFactory().openSession();

        TypedQuery<Order> query = em.createQuery("Select o from Order o  where o.id = :id", Order.class);
        query.setParameter("id", 1);
        Order order = (Order) query.getSingleResult();
        return order;
    }
}
