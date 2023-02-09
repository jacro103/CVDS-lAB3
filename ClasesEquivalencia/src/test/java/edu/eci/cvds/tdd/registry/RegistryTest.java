package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person("juana", 1, 18, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
// TODO Complete with more test cases
    @Test
    public void NotValidateRegistryResultByAge() {
 
        Person person = new Person("juan", 143535, 16, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);

        Person personS = new Person("Alejo", 143535, 11, Gender.MALE, true);
        RegisterResult resultS = registry.registerVoter(personS);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void NotValidateRegistryResultByAgeRange() {
 
        Person person = new Person("juan", 145455, -2, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void NotValidateRegistryResultByAgeRangea() {
 
        Person person = new Person("juan", 145455, 140, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void NotvalidateRegistryResultByDead() {
 
        Person persons = new Person("Sebastian", 1001011, 18, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(persons);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void NotvalidateRegistr() {
 
        Person persons = new Person("Sebastian", 1001011, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(persons);
        Assert.assertNotEquals(RegisterResult.DEAD, result);
    }


    
    @Test
    public void NotvalidateRegistryResultByid() {
 
        Person persons = new Person("Sebastian", 100, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(persons);
        Assert.assertEquals(RegisterResult.VALID, result);

        Person person = new Person("juan", 100, 18, Gender.MALE, true);
        RegisterResult results = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DUPLICATED, results);
    }

    @Test
    public void NotvalidateRegistryResul() {
 
        Person persons = new Person("Sebastian", 100, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(persons);
        Assert.assertEquals(RegisterResult.VALID, result);

        Person person = new Person("juan", 100, 18, Gender.MALE, true);
        RegisterResult results = registry.registerVoter(person);

        Assert.assertNotEquals(RegisterResult.DEAD, results);
    }
    
}
