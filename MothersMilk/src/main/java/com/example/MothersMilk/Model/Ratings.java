package com.example.MothersMilk.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ratings")
public class Ratings {
    @Column(name = "Rating_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer RatingId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserLogIn userId;
    @Column(name = "Rating")
    private Integer Rating;
    @Column(name = "Feedback")
    private String Feedback;
    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "created_by")
    private String createdBy;

}
