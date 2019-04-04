package bean;

import entity.Zakazka;
import service.TestSvc;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestBean {

    @EJB
    private TestSvc testSvc;

    private String kokot;

    private Zakazka zakazka;

    @PostConstruct
    private void init(){
        kokot = "ide dopredu";

    }

    public void createZakazka(){
        Zakazka z = new Zakazka();
        Long l = new Long("21226");

        z.setId(l);
        z.setName("jaaj");
        testSvc.insertZakazka(z);
        System.out.println("ffr");
        //zakazka = testSvc.findOrder(l);
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
