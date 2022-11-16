package kr.kwangan2.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class PersonControllerTest {
   
   @Autowired
   private MockMvc mockMvc;
   
   @org.junit.jupiter.api.Test
   public void test() throws Exception{
      
   }
   
   @org.junit.jupiter.api.Test
   public void testGetPerson() throws Exception{
	   mockMvc.perform(get("/getPerson")
			   .param("name","juhee")
			   .param("age","20")
			   )
	.andExpect(status().isOk())
	.andExpect(content().string("{\"name\":\"juhee\",\"age\":20}"))
	.andDo(print());
	   
   }
   
   @org.junit.jupiter.api.Test
   public void testGetPersonList() throws Exception{
	   mockMvc.perform(get("/getPersonList")
			   .param("name[0]","juhee")
			   .param("age[0]","20")
			   .param("name[1]","jieun")
			   .param("age[1]","20")
			   )
	.andExpect(status().isOk())
	.andExpect(content().string("[{\"name\":\"juhee\",\"age\":20},{\"name\":\"jieun\",\"age\":21}]"))
	.andDo(print());
   }

}//class
