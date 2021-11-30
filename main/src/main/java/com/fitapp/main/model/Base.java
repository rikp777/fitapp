package com.fitapp.main.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@JsonIgnoreProperties(
        {"hibernateLazyInitializer", "handler", "createAt", "updatedAt"}
)
public class Base implements Serializable {
    //Constructor
    public Base() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    //Data
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Version
    private int version;

    @Basic
    @Column(
            name = "created_at",
            nullable = false,
            insertable = true,
            updatable = false,
            columnDefinition = "TIMESTAMP NOT NULL"
    )
    @CreatedDate
    private LocalDateTime createdAt;

    @Basic
    @Column(
            name = "updated_at",
            nullable = false,
            insertable = true,
            updatable = false,
            columnDefinition = "TIMESTAMP NOT NULL"
    )
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
