package io.github.hcelebi.jirateams.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Team implements Serializable {
    @Serial
    private static final long serialVersionUID = -2187175487834372608L;
    private String teamId;
    private String organizationId;
    private String displayName;
    private String description;
    private String teamType;
}