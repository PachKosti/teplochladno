package service;

import entity.Order;

import javax.ejb.Local;

@Local
public interface TestSvc {

    Integer getRandom();

    Order findOrder(Long id);
}
