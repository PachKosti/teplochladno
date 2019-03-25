package service;

import javax.ejb.Local;

@Local
public interface TestSvc {

    Integer getRandom();
}
