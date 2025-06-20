package edu.dav.resume.model.resume;

import edu.dav.resume.model.enums.ContactType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_contact_info", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"type", "value", "resume_id"})
})
public class ContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ContactType type;

    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    private U_Resume resume;
}
