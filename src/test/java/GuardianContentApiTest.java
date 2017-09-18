import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import bean.Article;
import bean.Response;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

public class GuardianContentApiTest {
  @org.junit.Test
  public void getContent() throws Exception {

    GuardianContentApi api = new GuardianContentApi("30c5a1f2-3132-4f94-bba1-38b397fdec67");
    api.setSection("business");
    List<Article> results = api.getContent("money");
    results.forEach(System.out::println);
  }

}