package org.url.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class ShortURLDTO {
    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime expiry;
    private Long distributedId;
    private String longURL;
    private String alias;
    private String message;
}
