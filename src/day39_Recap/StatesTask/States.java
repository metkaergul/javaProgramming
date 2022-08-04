package day39_Recap.StatesTask;

public class States {
    
    private String name,abbreviation,politicalParty,governor,senator;
    private int population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
       setGovernor(governor);
      setSenator(senator);
      setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public String getSenator() {
        return senator;
    }

    public int getPopulation() {
        return population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setName(String name) {
        
        if(name==null||name.isEmpty()){

            System.err.println("name can not be null or empty ");
            System.exit(1);
        }
        this.name = name;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation==null||abbreviation.isEmpty()){

            System.err.println("abbreviation can not be null or empty ");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty==null||politicalParty.isEmpty()){

            System.err.println("politicalParty can not be null or empty ");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public void setGovernor(String governor) {
        if(governor==null||governor.isEmpty()){

            System.err.println("governor can not be null or empty ");
            System.exit(1);
        }
        this.governor = governor;
    }

    public void setSenator(String senator) {
        if(senator==null||senator.isEmpty()){

            System.err.println("senator can not be null or empty ");
            System.exit(1);
        }
        this.senator = senator;
    }

    public void setPopulation(int population) {

        if(population<=0){
            System.err.println("invalid enttry: "+population);
            System.exit(1);
        }
        this.population = population;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.err.println("invalid tax Rate: "+stateTax);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*States Task:
	1. Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()

*/