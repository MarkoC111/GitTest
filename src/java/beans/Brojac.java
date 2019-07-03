package beans;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named(value = "Brojac")
@Dependent

public class Brojac {

    public Brojac() {
    }

    public String poruka() {
        return "Poruka iz broja 1";
    }
}
