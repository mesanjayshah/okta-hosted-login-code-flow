 package com.beyondid.data;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "question_answers")
public class QuestionAnswers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id", insertable = false, nullable = false)
    private Integer questionId;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    @Column(name = "question")
    private String question;

    @Column(name = "answer")
    private String answer;

    @CreationTimestamp
    @Column(name = "created_ts", nullable = false)
    private LocalDateTime createdTs;

    @UpdateTimestamp
    @Column(name = "last_updated_ts", nullable = false)
    private LocalDateTime lastUpdatedTs;

}