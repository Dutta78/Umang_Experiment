public class Individual {
    String name;
    DataProperties dataProperties;
    ObjectProperties objproperties;
    OwlClass c;

    Individual(String name,OwlClass c){
        this.name = name;
        this.c = c;
        dataProperties = new DataProperties();
        objproperties = new ObjectProperties();
        //c.individuals.add(name);
    }

    void setDataProperties(String name,String value)
    {
        this.dataProperties.name = name;
        this.dataProperties.value = value;
    }

    void setObjectProperties(String name,OwlClass range,OwlClass domain)
    {
        this.objproperties.name = name;
        this.objproperties.Domain = domain;
        this.objproperties.Range = range;
    }
    String getIndividualClass()
    {
        return this.c.name;
    }
    String getDataProperty(){
        return dataProperties.name;
    }
    String getObjectProperty(){
        return objproperties.name;
    }

}
