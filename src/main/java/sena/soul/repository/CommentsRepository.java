package sena.soul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sena.soul.models.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {    
}