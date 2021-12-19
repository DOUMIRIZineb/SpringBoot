package com.example.springbootProject.repository;

import com.example.springbootProject.models.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends JpaRepository<Mission,Integer> {
}
