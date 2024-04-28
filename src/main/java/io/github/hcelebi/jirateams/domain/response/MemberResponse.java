package io.github.hcelebi.jirateams.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = -2187115287844074608L;
    private MemberResponsePageInfo pageInfo;
    private List<MemberResult> results;
}
