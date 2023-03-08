package com.crudoperation.crud.repository;

import com.crudoperation.crud.modelClass.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepo extends JpaRepository<Registration,Integer> {
}
