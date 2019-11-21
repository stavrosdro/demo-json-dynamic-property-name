package com.example.demojsondynamicpropertyname;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class DemoJsonDynamicPropertyNameApplication {

	public static void main(String[] args) throws IOException {
		Response response = new Response();
		Map<String, Object> mapper = response.getDetails();

		Element elem1 = new Element();
		Element elem2 = new Element();
		elem2.setFname("test-name-2");
		elem2.setActive(false);
		Element elem3 = new Element();
		elem3.setActive(false);
		elem3.setFname("test-name-3");

		List<Element> list1 = new ArrayList<Element>();
		list1.add(elem1);

		List<Element> list2 = new ArrayList<Element>();
		list2.add(elem1);
		list2.add(elem2);

		List<Element> list3 = new ArrayList<Element>();
		list3.add(elem1);
		list3.add(elem2);
		list3.add(elem3);


		mapper.put("property1", new Test("Stavros", list1));
		mapper.put("property2", new Test("John", list2));
		mapper.put("property3", new Test("Smith", list3));

		ObjectMapper objectMapper = new ObjectMapper();
		String jsonData = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
		System.out.println(jsonData);
	}
}