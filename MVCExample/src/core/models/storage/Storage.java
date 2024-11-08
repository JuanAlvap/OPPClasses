package core.models.storage;

import core.models.Person;
import java.util.ArrayList;

public class Storage {
    
    private static Storage instance;
    
    private ArrayList<Person> persons;
    
    private Storage(){
        this.persons = new ArrayList<>();
    }
    
    public static Storage getInstance(){
        if (instance == null){
            instance = new Storage();
        }
        return instance;
    }
    
    public boolean addPerson(Person person){
        for (Person p : this.persons) {
            if(p.getId() == person.getId()){
                return false;
            }
        }
        this.persons.add(person);
        return true;
    }
    
    public Person getPerson(int id){
        for (Person person : this.persons) {
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }
    
    public boolean delPerson(int id){
        for (Person person : this.persons) {
            if(person.getId() == id){
                this.persons.remove(person);
                return true;
            }
        }
        return false;
    }
    
}
