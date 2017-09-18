import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import bean.Article;
import bean.Response;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

public class GuardianContentApiTest {



  @org.junit.Test
  public void getContent() throws Exception {

    final  SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    GuardianContentApi api = new GuardianContentApi("30c5a1f2-3132-4f94-bba1-38b397fdec67");
    api.setSection("business");
    api.setFromDate(dateFormat.parse("22/07/2016"));
    api.setToDate(dateFormat.parse("22/07/2017"));
    Response response = api.getContent("bitcoin");
    Arrays.stream(response.getResults()).forEach(System.out::println);
  }

}