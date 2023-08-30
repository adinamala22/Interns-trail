package com.example.MothersMilk.Model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
@Entity
@Data
@Table(name="Milk_Donation_Listings")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Donation {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Don_list_id")
    private Integer DonListId;

    @ManyToOne
    @JoinColumn(name="donor_id")
    private UserLogIn donor;

    @ManyToOne
    @JoinColumn(name="recipient_id")
    private UserLogIn recipient;

    @Column(name="Availability")
    @NotBlank(message="Enter Availability")
    private String Availability;

    @Column(name="Collection_Address")
    @NotBlank(message="Enter Collection_Address")
    private String CollectionAddress;

    @CreationTimestamp
    @Column(name="Created_at")
    private Timestamp CreatedAt;

    @Column(name="Created_by")
    private String CreatedBy;

    public UserLogIn getDonor() {
        return donor;
    }

    public UserLogIn getRecipient() {
        return recipient;
    }


    // ... other attributes and methods
}

