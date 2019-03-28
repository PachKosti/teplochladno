package bean;

import entity.Order;
import service.TestSvc;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.faces.event.NamedEvent;
import javax.inject.Named;

@Named
@ViewScoped
public class TestBean {

    @EJB
    private TestSvc testSvc;

    private String kokot;

    private Order order;

    @PostConstruct
    private void init(){
        kokot = "ide dopredu";
        order = testSvc.findOrder(1L);
    }

    public String getKokot() {
        return kokot;
    }

    public void setKokot(String kokot) {
        this.kokot = kokot;
    }

    public Integer getRandom(){
        return testSvc.getRandom();
    }
}
