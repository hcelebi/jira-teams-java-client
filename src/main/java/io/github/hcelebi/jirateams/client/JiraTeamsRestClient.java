package io.github.hcelebi.jirateams.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.hcelebi.jirateams.domain.response.MemberResponse;
import io.github.hcelebi.jirateams.domain.response.Team;
import io.github.hcelebi.jirateams.exception.JiraTeamsRunTimeException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class JiraTeamsRestClient {
    private final String baseUri;
    private final String token;

    private final String orgId;
    private final HttpClient client;

    public JiraTeamsRestClient(String baseUri, String orgId, String token) {
        this.baseUri = baseUri;
        this.orgId = orgId;
        this.token = token;
        client = HttpClient.newHttpClient();
    }

    public Team getTeam(String teamId) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            HttpResponse<String> response = client.send(HttpRequest.newBuilder()
                    .uri(URI.create(baseUri + "/teams/v1/org/" + orgId + "/teams/" + teamId))
                    .header("Authorization", "Basic " + token)
                    .header("Content-Type", "application/json")
                    .GET()
                    .build(), BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), Team.class);
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new JiraTeamsRunTimeException(e.getMessage());
        }
    }

    public MemberResponse getMembers(String teamId) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            HttpResponse<String> response = client.send(HttpRequest.newBuilder()
                    .uri(URI.create(baseUri + "/teams/v1/org/" + orgId + "/teams/" + teamId + "/members"))
                    .header("Authorization", "Basic " + token)
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.noBody())
                    .build(), BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), MemberResponse.class);
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new JiraTeamsRunTimeException(e.getMessage());
        }
    }
}
