package day39_Recap.ScrumTask;



import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private ProductOwner PO;
    private ScrumMaster SM;
    private ArrayList<Tester> testers=new ArrayList<>();
    private ArrayList<Developer>developers=new ArrayList<>();

    public ScrumTeam(ProductOwner PO, ScrumMaster SM) {
        setPO(PO);
        setSM(SM);


    }

    public ProductOwner getPO() {
        return PO;
    }

    public ScrumMaster getSM() {
        return SM;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setPO(ProductOwner PO) {
        this.PO = PO;
    }

    public void setSM(ScrumMaster SM) {
        this.SM = SM;
    }

    public void setTesters(ArrayList<Tester> testers) {
        this.testers = testers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    public void addTester(Tester tester){

        testers.add(tester);

    }
    public void addTesters(Tester[]testers){

        this.testers.addAll(Arrays.asList(testers));


    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers)) ;
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.getName() +
                ", SM=" + SM.getName() +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
