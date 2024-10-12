package org.url.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShortURLResponse {
    private UUID id;
    private String shortURL;
    private String longURL;
    private LocalDateTime expiry;
    private String exception;
}
