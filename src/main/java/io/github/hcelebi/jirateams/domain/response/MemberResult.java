package io.github.hcelebi.jirateams.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberResult implements Serializable {
    @Serial
    private static final long serialVersionUID = -5080992379441110954L;

    private String accountId;
}
