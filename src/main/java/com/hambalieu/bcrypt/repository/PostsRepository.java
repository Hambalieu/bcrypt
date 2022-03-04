package com.hambalieu.bcrypt.repository;
import com.hambalieu.bcrypt.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}