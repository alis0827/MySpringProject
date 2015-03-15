package com.javanoob.myspringproject.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javanoob.myspringproject.data.domain.StudentRecord;

@Repository
public interface StudentRepository extends CrudRepository<StudentRecord, Long> {
	
}
