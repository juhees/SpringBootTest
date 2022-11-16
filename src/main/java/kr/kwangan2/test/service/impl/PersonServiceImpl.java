package kr.kwangan2.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.kwangan2.test.domain.Person;
import kr.kwangan2.test.service.PersonService;


@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public String hello(String name) {
		return "Hello : " + name;
	}

	@Override
	public Person getPerson() {
		Person person = new Person();
		   person.setName("juhee");
		   person.setAge(20);
		   return person;
	}

	@Override
	public List<Person> getPersonList() {
		Person person1 = new Person();
		   person1.setName("juhee");
		   person1.setAge(20);
		   Person person2 = new Person();
		   person2.setName("jieun");
		   person2.setAge(21);
		   
		   List<Person> personList = new ArrayList<Person>();
		   personList.add(person1);
		   personList.add(person2);
		   
		   return personList;
	}

}
