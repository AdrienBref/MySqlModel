package org.Bref;

import config.HibernateUtil;
import entities.Centro;
import org.hibernate.Session;
import repositories.CentroRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Connecting to ddbb");
        Session session = HibernateUtil.get().openSession();
        CentroRepository centroRepository = new CentroRepository(session);
        Centro centro = new Centro("CodigoOnline3");
        centroRepository.save(centro);
        System.out.println(centroRepository.findAll());

        session.close();
    }
}
