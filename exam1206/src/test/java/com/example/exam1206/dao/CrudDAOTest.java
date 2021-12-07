package com.example.exam1206.dao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrudDAOTest {
    CrudDAO crudDAO = new CrudDAO();

    @Test
    void addProfessional() {
        System.out.println(crudDAO.addProfessional("软件工程","软件学院"));
    }

    @Test
    void getByname() {
        System.out.println(crudDAO.getByname("软件工程"));
    }

    @Test
    void getByOname() {
        System.out.println(crudDAO.getByOname("生命科学学院"));
    }

    @Test
    void updateMajorName() {
        System.out.println(crudDAO.updateMajorName("软件工程","软件工程2"));
        System.out.println(crudDAO.getByname("软件工程2"));

    }

    @Test
    void deleteProfessional() {
        System.out.println(crudDAO.deleteProfessional("软件工程2"));
    }

    @Test
    void getByMname() {
        System.out.println(crudDAO.getByMname("生物"));
    }
}