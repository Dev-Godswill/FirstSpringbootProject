package com.daudugodswill.Springboot.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data //contains getter and setter
@NoArgsConstructor //contains constructor
@AllArgsConstructor //contains all argument
@Builder //would be implemented for this program
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;

    //am adding this annotation "@NotBlank" to stress importance on a particular field (Department Name), so
    //I want this field to be an important field for users to input data
    @NotBlank(message = "Please input Department Name")
    /*@Length(max = 5, min = 1)
    @Size(max = 10, min = 0)
    @Email
    @Positive
    @Negative
    @PositiveOrZero
    @NegativeOrZero
    @Future
    @FutureOrPresent
    @Past*/

    private String  departmentName;
    private String departmentAddress;
    private String departmentCode;
    private String departmentLecturer;
}
