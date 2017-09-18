import java.text.SimpleDateFormat;
import java.util.Date;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequest;
import org.json.JSONArray;

public class GuardianContentApi {

  private final static String TARGET_URL = "http://content.guardianapis.com/search";
  private final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
  private final String apiKey;
  private String section;
  private Date toDate;
  private Date fromDate;

  public GuardianContentApi(final String apiKey) {
    this.apiKey = apiKey;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public void setFromDate(Date date) {
    this.fromDate = date;
  }

  public void setToDate(Date date) {
    this.toDate = date;
  }

  public HttpResponse<JsonNode> getContent() throws UnirestException {
  return getContent(null);
  }

  public HttpResponse<JsonNode> getContent(String query) throws UnirestException {
    HttpRequest request = Unirest.get(TARGET_URL)
        .queryString("api-key", apiKey)
        .header("accept", "application/json");
    if (query != null && !query.isEmpty()) {
      request.queryString("q", query);
    }

    if (section != null && !section.isEmpty()) {
      request.queryString("section", section);
    }

    if (fromDate != null){
      request.queryString("from-date", dateFormat.format(fromDate));
    }
    if (toDate != null){
      request.queryString("to-date", dateFormat.format(toDate));
    }

   return request.asJson();
  }
}
