package io.github.hcelebi.jirateams.domain.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class GetMembersRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -2944523348051734059L;
    @JsonIgnore
    private String teamId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String after;
    private Integer first;
}
