package edu.dav.resume.model.education;

import edu.dav.resume.model.common.BasicDetails;
import edu.dav.resume.model.resume.U_Resume;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "user_educations")
public class Educations {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String level;

    @Column(name = "institution", nullable = false)
    private String institution;

    @Column(name = "bordorunversity", nullable = false)
    private String boardOrUnversity;

    @Embedded
    private BasicDetails basicDetails;

    @ManyToOne(fetch = FetchType.LAZY)
    private U_Resume u_resume;


}
