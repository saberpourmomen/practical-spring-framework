package org.apsystem.practical_spring_framework.spring_batch.repository;

import org.apsystem.practical_spring_framework.spring_batch.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
