package com.ex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer> {
	
	@Query("SELECT h.name FROM HobbyEntity h WHERE h.personId=:personId")
	public String findByPersonId(Integer personId);
}
