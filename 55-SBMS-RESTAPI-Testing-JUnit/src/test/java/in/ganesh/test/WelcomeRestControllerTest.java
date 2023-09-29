package in.ganesh.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.ganesh.rest.WellcomeController;
import in.ganesh.wlcm.Wellcome;

@WebMvcTest(value = WelcomeRestControllerTest.class)
public class WelcomeRestControllerTest 
{

	@MockBean
	private WellcomeController service;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void welcomeMsgTest() throws Exception
	{

		// defining mock obj behaviour
		when(service.wlcmMessage()).thenReturn("Welcome to Testing .....");

		// preparing request
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/getmsg");

		// sending request
		MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();

		// get the response
		MockHttpServletResponse response = mvcResult.getResponse();

		// validate response status code
		int status = response.getStatus();
		assertEquals(200, status);

	}

}


