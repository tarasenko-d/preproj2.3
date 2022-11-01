package com.example.demo.mvc.dao;


import com.example.demo.mvc.model.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    private final SessionFactory sessionFactory;

    public UserDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void delete(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public void change(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public List<User> toList() {
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("FROM User");
        return query.getResultList();
    }
}
