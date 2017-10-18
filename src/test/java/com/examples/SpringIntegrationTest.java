package com.examples;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.SpringCucumberApitestApplication;

@ContextConfiguration(
 classes = SpringCucumberApitestApplication.class, 
  loader = SpringApplicationContextLoader.class)
@WebAppConfiguration
@IntegrationTest

public class SpringIntegrationTest {
	HttpResponse LatestResponse;
	String body;
	
	public void executeGet (String customerAPI) throws ClientProtocolException, IOException {
		
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(customerAPI);
		 HttpResponse LatestResponse = client.execute(httpGet);
		 
		 ResponseHandler<String> handler = new BasicResponseHandler();

		 String body = client.execute(httpGet, handler);
		 
		 client=null;
		
	}



}
