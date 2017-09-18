# content-api-the-guardian
A java client for the guardian api: http://open-platform.theguardian.com/explore/

## Creating Request

Here is a basic GET request that will show how easy is to use the client, you just nedd a valid api-key:

```java
    GuardianContentApi api = new GuardianContentApi("<api-key>");
    Response response = api.getContent();
    Arrays.stream(response.getResults()).forEach(System.out::println);
```

If you need to specify a query:

```java
    GuardianContentApi api = new GuardianContentApi("<api-key>");
    Response response = api.getContent("bitcoin");
    Arrays.stream(response.getResults()).forEach(System.out::println);
```

If you need to specify as well a section:

```java
    GuardianContentApi api = new GuardianContentApi("<api-key>");
    api.setSection("business");
    Response response = api.getContent("bitcoin");
    Arrays.stream(response.getResults()).forEach(System.out::println);
```

If you need to specify as well a interval of time:

```java
    final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    GuardianContentApi api = new GuardianContentApi("<api-key>");
    api.setSection("business");
    api.setFromDate(dateFormat.parse("22/07/2016"));
    api.setToDate(dateFormat.parse("22/07/2017"));
    Response response = api.getContent("bitcoin");
    Arrays.stream(response.getResults()).forEach(System.out::println);
```

In order to build the project, open the test java file `GuardianContentApiTest` set the `apiKey`, and run
from the command line:

```bash
mvn install
```