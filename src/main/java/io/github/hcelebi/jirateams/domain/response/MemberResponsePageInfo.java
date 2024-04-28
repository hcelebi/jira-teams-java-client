package io.github.hcelebi.jirateams.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberResponsePageInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = -7785205945027363554L;

    private Boolean hasNextPage;
    private String endCursor;
}
