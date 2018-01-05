package com.example.springbootjpa.models.dao;

import com.example.springbootjpa.models.entity.Cliente;

import java.util.List;

public interface ClienteDao {
    public List<Cliente> findAll();
}
