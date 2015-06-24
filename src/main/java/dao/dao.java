package dao;

import user.user;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;


@Repository
public class dao {
	@PersistenceContext
    private EntityManager entityManager;

    public dao() {}

    public List<user> findAll(){
        String query = "SELECT * FROM geek";
        return entityManager.createQuery(query, user.class).getResultList();
    }

    public List<user> findById(Long id){
        String query = "SELECT * FROM geek WHERE geek.id_geek = :id";

        return entityManager.createQuery(query, user.class)
                .setParameter("id", id)
                .getResultList();
    }

    public List<user> findBySex(String sexe){
        if(sexe.equals("")) return new ArrayList<user>();

        String query = "SELECT * FROM geek WHERE geek.sexe = :sexe";

        return entityManager.createQuery(query, user.class).setParameter("sexe", sexe).getResultList();
    }

    public List<user> findByInterest(List<String> interests){
        if(interests.isEmpty()) return new ArrayList<user>();

        String query = "SELECT * FROM geek JOIN geek_interest.id_interest WHERE geekInterest.id_interest=:id_interest";

        return entityManager.createQuery(query, user.class)
                .setParameter("id_interest", interests)
                .getResultList();
    }

   
}
