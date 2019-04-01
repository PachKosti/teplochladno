package service;

import entity.Zakazka;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Random;

@Stateless
public class TestSvcImpl implements TestSvc {

    @PersistenceContext(unitName = "mainPU")
    private EntityManager em;

    public Integer getRandom() {
        Random random = new Random();
        return random.nextInt();
    }

    public Zakazka findOrder(Long id){
        //Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = em.createQuery("Select o from Zakazka o ");
        //query.setParameter("id", id);
        List<Zakazka> zakazka =  query.getResultList();
        return zakazka.get(0);
    }

    public void insertZakazka(Zakazka zakazka){
        em.persist(zakazka);
    }
}
