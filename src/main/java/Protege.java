import java.util.ArrayList;
import java.util.List;

public class Protege {
    public static void main(String[] args) {

        OwlClass c1 = new OwlClass("Teacher");

        Individual first = new Individual("Umang",c1);

        Individual second = new Individual("Arjun",c1);
        OwlClass c2 = new OwlClass("Student");

        first.setDataProperties("Age","23");
        c1.individuals.add(first);
        c1.individuals.add(second);

        ArrayList<Individual> i=c1.getIndividual();

        first.setObjectProperties("teaches",c1,c2);
        //

        for(Individual c:i)
        {
            System.out.println(c.name);
        }
        //System.out.println(ar);


    }
}
