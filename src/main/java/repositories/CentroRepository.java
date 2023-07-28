package repositories;

import entities.Centro;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CentroRepository implements Repository<Centro> {
    
    private final Session session;

    public CentroRepository(Session session) {
       this.session = session;
    }

    @Override
    public void save(Centro centro) {
        Transaction trx = session.beginTransaction();
        session.save(centro);
        trx.commit();
    }

    @Override
    public void delete(Centro centro) {

    }

    @Override
    public List<Centro> findAll() {
        Transaction trx = session.beginTransaction();
        List<Centro> centros = session.createQuery("FROM centros", Centro.class).getResultList();
        trx.commit();
        return centros;
    }

    @Override
    public Centro findOneByID(long id) {
        Transaction trx = session.beginTransaction();
        Centro centro = session.createQuery("FROM centros where centroId=:id", Centro.class).setParameter("id",id).getSingleResult();
        trx.commit();
        return centro;
    }

    @Override
    public void update(Centro centro) {

    }
}
