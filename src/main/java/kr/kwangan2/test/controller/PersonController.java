package kr.kwangan2.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.kwangan2.test.domain.Person;

@RestController
public class PersonController {
   
   public PersonController() {
      System.out.println("====> 생성");
   }
   
//   @GetMapping("/hello")
//   public String hello(String name) {
//      return "Hello : " + name;
//   }
//   
//   @GetMapping("/getPerson")
//   public Person getPerson() {
//	   Person person = new Person();
//	   person.setName("juhee");
//	   person.setAge(20);
//	   return person;
//   }
//   
//   @GetMapping("/getPersonList")
//   public List<Person> getPersonList(){
//	   Person person1 = new Person();
//	   person1.setName("juhee");
//	   person1.setAge(20);
//	   Person person2 = new Person();
//	   person2.setName("jieun");
//	   person2.setAge(21);
//	   
//	   List<Person> personList = new ArrayList<Person>();
//	   personList.add(person1);
//	   personList.add(person2);
//	   
//	   return personList;
//   }



}//class

