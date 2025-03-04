package com.ttn.H2Project.dao;

import com.ttn.H2Project.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface H2Repository extends JpaRepository<Employee, Integer> {

}
