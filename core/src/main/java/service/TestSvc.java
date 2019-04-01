package service;

import entity.Zakazka;

import javax.ejb.Local;

@Local
public interface TestSvc {

    Integer getRandom();

    Zakazka findOrder(Long id);

    void insertZakazka(Zakazka zakazka);
    }
