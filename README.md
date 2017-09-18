# content-api-the-guardian
A java client for the guardian api: http://open-platform.theguardian.com/explore/

## Creating Request

Here is a basic GET request that will show how easy is to use the client, you just nedd a valid api-key:

```java
    GuardianContentApi api = new GuardianContentApi("<api-key>");
    HttpResponse<JsonNode> results = api.getContent();
    System.out.println(results);
```

If you need to specify a query:


If you need to specify a section:


If you need to specify an interval of time:
