package com.example.springbootjpa.models.dao.impl;

import com.example.springbootjpa.models.dao.ClienteDao;
import com.example.springbootjpa.models.entity.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ClienteDaoImpl implements ClienteDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly=true)
    @Override
    public List<Cliente> findAll() {
        return entityManager.createQuery("from Cliente").getResultList();
    }
}
