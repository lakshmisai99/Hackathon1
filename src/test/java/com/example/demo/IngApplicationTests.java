package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ing.domain.DemoModel;
import com.ing.domain.ProductGroup;

public class IngApplicationTests extends AbstractTest {

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void getViewCountTest() throws Exception {
		String uri = "/api/viewCount";
		// String inputJson = super.mapToJson(review);

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		// System.out.println(mvcResult.getResponse().getStatus());
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
	}

	@Test
	public void getProductTest() throws Exception {
		String uri = "/api/products";
		DemoModel review = new DemoModel(9,333);
//		System.out.println("review "+review);
		String inputJson = super.mapToJson(review);

		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();
		 System.out.println("response "+mvcResult.getResponse().getStatus());
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		ProductGroup productInfo = super.mapFromJson(content, ProductGroup.class);
		assertNotNull(productInfo);
	}
	
	
	@Test
	public void getGroupTest() throws Exception {
		String uri = "/api/getGroup";
		// String inputJson = super.mapToJson(review);

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		// System.out.println(mvcResult.getResponse().getStatus());
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		System.out.println("content  "+content);
		 //List<ProductGroup> productInfo = (List)super.mapFromJson(content, ProductGroup.class);
		assertNotNull(content);
	}
	
	
	
}
