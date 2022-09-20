package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Employee;
@Repository
public interface HomeRepository extends JpaRepository<Employee, Integer> {

}
