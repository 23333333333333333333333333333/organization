package com.mengyunzhi.organization.repository;

import com.mengyunzhi.organization.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends CrudRepository<User,Long> {
}
