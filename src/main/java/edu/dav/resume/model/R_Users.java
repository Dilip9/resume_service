package edu.dav.resume.model;

import edu.dav.resume.model.common.Address;
import edu.dav.resume.model.common.BasicDetails;
import edu.dav.resume.model.education.Educations;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class R_Users {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String username;

    private String email;

    private String contactNumber;

    private Educations education;

    private Address address;

    private Habbit habbit;

    private String experience;

    @Embedded
    private BasicDetails basicDetails;






}
