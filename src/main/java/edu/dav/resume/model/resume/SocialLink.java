package edu.dav.resume.model.resume;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_social_links")
public class SocialLink {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String platfrom;

    private String url;

    @ManyToOne
    private U_Resume resume;
}
