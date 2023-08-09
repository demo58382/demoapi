package com.practice.repository;

import com.practice.entity.LeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LeadRepository extends JpaRepository<LeadEntity, Long> {
    @Query("from LeadEntity where name=:name and city=:city")
    List<LeadEntity> findByName(@Param("name") String name, @Param("city") String city);
}
