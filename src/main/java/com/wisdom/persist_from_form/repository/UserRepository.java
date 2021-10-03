package com.wisdom.persist_from_form.repository;

import com.wisdom.persist_from_form.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
