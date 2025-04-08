package com.luna.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 예: 사원, 대리, 과장, 부장 등
    @Column(nullable = false, unique = true)
    private String name;

    private String description;
}
