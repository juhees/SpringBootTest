package kr.kwangan2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.test.domain.Person;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class PersonControllerTest3 {
   
   @Autowired
   private TestRestTemplate restTemplate;
   
   //@Test
   public void testHello() throws Exception{
	 String result = restTemplate.getForObject("/hello?name=둘리", String.class);
	 		assertEquals("Hello : 둘리", result);
   }
   
   @Test
   public void testGetPerson() throws Exception {
	   Person person = restTemplate.getForObject("/getPerson", Person.class);
	   assertEquals("juhee", person.getName());
	   
	   Person person2 = new Person();
	   person2.setName("juhee");
	   person2.setAge(20);
	   
	   System.out.println("person2====>" + person2.hashCode());
	   System.out.println("person====>" + person.hashCode());
	   assertEquals(person2, person);
   }
   
   
   
   
    
   
}//class
