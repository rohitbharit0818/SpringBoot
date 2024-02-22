package com.pro.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.crud.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{

}
