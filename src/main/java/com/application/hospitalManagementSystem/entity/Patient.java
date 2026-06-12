package com.application.hospitalManagementSystem.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;
//import lombok.ToString;
@Data
@Entity

public class Patient {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private Long id;
private LocalDate birthDate;
private String name;
private String email;
private String gender;
//@Override
//public String toString() {
//    return "Patient{" +
//            "id=" + id +
//            ", name='" + name + '\'' +
//            ", email='" + email + '\'' +
//            ", gender='" + gender + '\'' +
//            '}';
//}

}
