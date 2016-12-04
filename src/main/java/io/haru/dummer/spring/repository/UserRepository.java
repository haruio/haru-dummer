package io.haru.dummer.spring.repository;

import io.haru.dummer.spring.domain.master.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pheadra on 12/4/16.
 */
public interface UserRepository extends JpaRepository<Long, User>{
}
