import java.util.ArrayList;
import java.util.List;

public class OwlClass {
    String name;

    ArrayList<Individual> individuals;
    OwlClass(String name)
    {
        this.name = name;
        this.individuals = new ArrayList<Individual>();
        //this.owlclass = new ArrayList<OwlClass>();
        //subclasses;
    }

    ArrayList<Individual> getIndividual()
    {
        return individuals;
    }
}
