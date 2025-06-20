package edu.dav.resume.model.resume;


import edu.dav.resume.model.enums.SkillType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Enumerated(EnumType.STRING)
    private SkillType type;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "resume_id", nullable = false)
    private U_Resume resume;

}

