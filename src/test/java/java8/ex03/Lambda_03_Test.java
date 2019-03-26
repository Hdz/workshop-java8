package java8.ex03;

import java8.data.Data;
import java8.data.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Exercice 03 - ForEach
 */
public class Lambda_03_Test {

    // tag::PersonProcessor[]
    interface PersonProcessor {
        void process(Person p);
    }
    // end::PersonProcessor[]

    // tag::forEach[]
    private void forEach(List<Person> source, PersonProcessor processor) {
       // TOD0
    	List<Person> res = new ArrayList<>();
		res.forEach(re->System.out.println(res));
	
    }
    
    // end::forEach[]


    // tag::test_verify_person[]
    @Test
    public void test_verify_person() throws Exception {

        List<Person> personList = Data.buildPersonList(100);
        
                // TODO vérifier qu'une personne à un prénom qui commence par first
        // TODO vérifier qu'une personne à un nom qui commence par last
        // TODO vérifier qu'une personne à un age > 0
       
        PersonProcessor verifyPerson = p->{
        assertTrue(p.getFirstname().contains("first"));
        assertTrue(p.getLastname().contains("last"));
        assertTrue(p.getAge() >=0);
        };
       // PersonProcessor verifyName = p->p.getLastname().equals("last");
      //  PersonProcessor verifyAge = p-> p.getAge() >= 0;
        

        forEach(personList, verifyPerson);
    }
    // end::test_verify_person[]

}
