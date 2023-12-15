package com.beyondid.data;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name="category")
@Entity
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", insertable = false, nullable = false)
    private Integer categoryId;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "exam_type")
    private String examType;

    @CreationTimestamp
    @Column(name = "created_ts", nullable = false)
    private LocalDateTime createdTs;

    @UpdateTimestamp
    @Column(name = "last_updated_ts", nullable = false)
    private LocalDateTime lastUpdatedTs;
}
