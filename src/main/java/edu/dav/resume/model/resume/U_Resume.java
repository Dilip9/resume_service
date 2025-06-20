package edu.dav.resume.model.resume;

import edu.dav.resume.model.R_Users;
import edu.dav.resume.model.WorkExperience;
import edu.dav.resume.model.common.BasicDetails;
import edu.dav.resume.model.education.Educations;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Vector;

@Entity
@Data
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "resumes")
public class U_Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private R_Users user;

    @Column(name = "resume_title", nullable = false)
    private String resumeTitle;

    @Embedded
    private BasicDetails details;

    @Lob
    private String summary;

    private String fileName;

    private String fileType;

    private String filePath;

    @JoinColumn(nullable = false)
    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Skill> skills;


    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Educations> educations;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkExperience> workExperiences;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Award> awards;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ContactInfo> contactInfos;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SocialLink> socialLinks;

    @OneToOne(mappedBy = "resume", cascade = CascadeType.ALL, orphanRemoval = true)
    private ResumeEmbedding embedding;




}
