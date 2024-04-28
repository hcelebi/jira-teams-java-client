package io.github.hcelebi.jirateams.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serial;

@Getter
@AllArgsConstructor
public class JiraTeamsRunTimeException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -3829641624015437540L;

    public JiraTeamsRunTimeException(String message) {
        super(message);
    }
}
