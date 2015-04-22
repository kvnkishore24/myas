package as;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.Test;

public class NewTest {

	

	@Test
	public void f() throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try{
			HttpGet httpget = new HttpGet(
				"http://localhost/as/api/public/api/1.0/user/login");
			System.out.println("Executing request " + httpget.getURI());
			httpget.getRequestLine();
			System.out.println("Executing request " + httpget.getRequestLine());
		System.out.println("-------------------------");
		
		CloseableHttpResponse response = httpclient.execute(httpget);
		try{
			System.out.println("-------------------------");
			System.out.println(response.getStatusLine());
			httpget.abort();
			System.out.println("-------------------------");
		   }finally{
			   
			   		httpget.abort();
		   }
		
		}finally{
			
			httpclient.close();
		}
		
		;
	
		httpclient.close();
	}
	//
	// @Test
	// public void ClientAbortMethod(){
	//
	// }
}
