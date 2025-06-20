package edu.dav.resume.model;

import edu.dav.resume.model.resume.U_Resume;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.domain.Auditable;

@Getter
@Setter
@Entity
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_work_experiences")
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobTitle;

    private String companyName;

    private String location;

    private Boolean active;

    @Column(columnDefinition = "TEXT")
    private String responsiblity;

    @ManyToOne
    private U_Resume resume;

    @Embedded
    private Auditable auditable;

}
