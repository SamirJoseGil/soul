package sena.soul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sena.soul.models.UserProgress;

@Repository
public interface UserProgresRepository extends JpaRepository<UserProgress, Long>{
}