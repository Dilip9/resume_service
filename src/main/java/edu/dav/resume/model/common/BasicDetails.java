package edu.dav.resume.model.common;

import jakarta.persistence.PrePersist;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.time.Instant;


@Getter
@Setter
@ToString
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class BasicDetails {

    private Instant createdAt;
    private Instant updatedAt;
    private String createdBy;
    private String updatedBy;

    @PrePersist
    public Instant getCreatedAt() {
        return createdAt != null ? createdAt : Instant.now();
    }
    @PrePersist
    public Instant getUpdatedAt() {
        return updatedAt != null ? updatedAt : Instant.now();
    }

}
