package lt.vu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AntrasKomponentas {

    @PostConstruct
    public void init() {
        System.out.println(toString() + " AntrasKomponentas sukurtas.");
    }

    @PreDestroy
    public void aboutToDie() {
        System.out.println(toString() + " AntrasKomponentas bus sunaikintas.");
    }

    public String getInfo() {
        return "Čia yra AntrasKomponentas!";
    }
}
