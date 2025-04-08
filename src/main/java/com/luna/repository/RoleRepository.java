package com.luna.repository;

import com.luna.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Position, Long> {
    Position findByName(String name);
}
