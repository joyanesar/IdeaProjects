package Office_Hours.paractice_10_13_21;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    /*
    create a class called ScrumTeam

               Attributes:
                            PO, BA, SM,
                            all developers, all testers (ArrayLists)
                            sprintNumber

                    static: company name, ceo name

                Constructor:
                    - sets only the sprint number
                    - overload to set sprint number, the names of PO, BA, SM, and creates ArrayList objects

                Actions:

                   addTester(Tester tester): adds the given tester to the testers arraylist

                   addTesters(Tester[] testers): adds the given testers to the testers arraylist

                   addDeveloper(Developer developer): adds the given developer to the developers arraylist

                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

                   removeTester(long employeeID): removes the given tester from the testers arraylist

                   removeDeveloper(long employeeID): removes the developer from the developers arraylist

                   toString(): prints number of tester,& developers,  PO name, SM name, BA name
     */
    String productOwner;
    String scrumMaster;
    int    sprintNumber;
    ArrayList<Developer> allDevelopers; // this is reference

    static  String companyName;
    static  String ceo;

    public ScrumTeam(int sprintNumber) {
        this.sprintNumber = sprintNumber;
        allDevelopers = new ArrayList<>();
    }

    public ScrumTeam(String productOwner, String scrumMaster, int sprintNumber, ArrayList<Developer> allDevelopers) {
        this(sprintNumber);
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;

        this.allDevelopers .addAll(allDevelopers);
    }

    public void addDeveloper(Developer developer){
        allDevelopers.add(developer);


    }
    public void addDeveloper(Developer [] developers){
        allDevelopers.addAll(Arrays.asList(developers));
    }
}
