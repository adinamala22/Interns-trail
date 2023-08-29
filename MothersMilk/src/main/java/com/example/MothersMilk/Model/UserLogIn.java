package com.example.MothersMilk.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "MothersGift.Sign_UP")
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserLogIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "account_type")
    @NotBlank(message = "Enter Account Type")
    private String accountType;
    @Column(name = "user_name")
    @NotBlank(message = "Enter User Name")
    private String userName;
    @Column(name = "password")
    @NotBlank(message = "Enter Password")
    private String password;
    @Column(name = "aadhar_id")
    private String aadharId;
    @Column(name = "age")
    private Integer age;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "contact")
    private String contact;
    @Column(name = "address")
    private String address;
    @Column(name = "doctor_certificate")
    private String doctorCertificate;
    @Column(name = "medical_report")
    private String medicalReport;
    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "updated_by")
    private String updatedBy;
}