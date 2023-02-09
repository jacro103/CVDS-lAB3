package edu.eci.cvds.tdd.registry;
import java.util.ArrayList; 

public class Registry {

    ArrayList<Integer> person = new ArrayList<Integer>();

    public RegisterResult registerVoter(Person p) {
        boolean a = p.isAlive();

        if(p.getAge() < 18 && p.getAge() >=0 ){
                return RegisterResult.UNDERAGE;
        }else if(p.getAge() < 0 || p.getAge() > 120 ){
            return RegisterResult.INVALID_AGE;
        }else if(!a){
            return RegisterResult.DEAD;
        }else if (person.contains(p.getId())){
            return RegisterResult.DUPLICATED;

        }else{
            // TODO Validate person and return real result.
            person.add(p.getId());
            return RegisterResult.VALID;

        }
        
        }
    
}
