package Practise;

import java.util.ArrayList;
import java.util.List;

//Example for providing deep copy of objects in immutable class
public class ImmutablePractise {
    public static void main(String[] args) {
        List<String> skill = new ArrayList<>();
        skill.add("Java");
        skill.add("python");
        Employee emp = new Employee("Ranjith",skill);
        emp.getSkills().add("c#");
        for (int i=0;i<emp.getSkills().size();i++){
            System.out.println("skills : "+emp.getSkills().get(i));
        }
    }

}

final class Employee{
    private String name;
    private List<String> skills;

    public Employee(String name, List<String> skills){
        this.name = name;
        this.skills = new ArrayList<>(skills);
    }

    public String getName(){
        return this.name;
    }

    public List<String> getSkills(){
        return new ArrayList<>(skills);
    }
}
