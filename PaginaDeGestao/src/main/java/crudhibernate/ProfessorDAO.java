package crudhibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProfessorDAO {

    private static ProfessorDAO instance;
    protected EntityManager entityManager;

    public static ProfessorDAO getInstance() {
        if (instance == null) {
            instance = new ProfessorDAO();
        }
        return instance;
    }

    public ProfessorDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    public Professor getById(final int id) {
        return entityManager.find(Professor.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Professor> findAll() {
        return entityManager.createQuery("FROM " + Professor.class.getName()).getResultList();
    }

    public Professor login(Professor professor){
        Professor prof = (Professor) entityManager.createQuery("SELECT * FROM TABLE professor where nome = :value1")
                                                  .setParameter("value1", professor.getNome())
                                                  .getSingleResult();
        return prof;
    }

    public void persist(Professor professor) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(professor);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void merge(Professor professor) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(professor);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Professor professor) {
        try {
            entityManager.getTransaction().begin();
            professor = entityManager.find(Professor.class, professor.getId());
            entityManager.remove(professor);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void removeById(final int id) {
        try {
            Professor professor = getById(id);
            remove(professor);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}