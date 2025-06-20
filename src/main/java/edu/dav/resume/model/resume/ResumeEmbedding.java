package edu.dav.resume.model.resume;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  Implementation of Resume Embedding for pgVector application.
 * ****/

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "resume_embeddings")
public class ResumeEmbedding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resume_id;

    @OneToOne
    @MapsId
    private U_Resume resume;

    @Column(name = "embedding_vector", columnDefinition = "vector(1536)")
    private Float[] embedding;

}
