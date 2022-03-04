package com.hambalieu.bcrypt.repository;

import com.hambalieu.bcrypt.model.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteUserRepository extends JpaRepository<SiteUser, Long>
{
    SiteUser findByUsername(String username);
}
