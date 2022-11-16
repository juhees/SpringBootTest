package kr.kwangan2.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.test.controller.PersonController;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=PersonController.class,
				properties= {"author.name=juhee",
							 "author.age=25",
							 "author.nation=korea"})
@Log4j2
class SpringBootTestApplicationTests {
	
	@Autowired
	Environment environment;
	//모든 프로퍼티들을 기본적으로 environment를 통해서 확인할 수 잇다. 
	//따라서 environment를 주입받아 getproperty로 프로퍼티를 받아온다
	
	@Test
	void getProperties() {
		
		log.info("이름: "+ environment.getProperty("author.name"));
		log.info("나이: "+ environment.getProperty("author.age"));
		log.info("국적: "+ environment.getProperty("author.nation"));
	}

}
