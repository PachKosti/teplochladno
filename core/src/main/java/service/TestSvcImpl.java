package service;

import javax.ejb.Stateless;
import java.util.Random;

@Stateless
public class TestSvcImpl implements TestSvc {

    public Integer getRandom() {
        Random random = new Random();
        return random.nextInt();
    }
}
