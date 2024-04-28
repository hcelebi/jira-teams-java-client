Add Dependency and configure create instance

```xml
<dependency>
    <groupId>io.github.hcelebi</groupId>
    <artifactId>jira-teams-java-client</artifactId>
    <version>1</version>
</dependency>
```

```java
JiraTeamsRestClient client = new JiraTeamsRestClient("baseUri", "token", HttpClient.newHttpClient());
```

```shell
 mvn verify gpg:sign install:install deploy:deploy -s settings.xml -DMAVEN_USERNAME= -DMAVEN_PASSWORD=
```
