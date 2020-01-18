package com.apprentices.KeepMeAlive.repository;

import com.apprentices.KeepMeAlive.entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {

}
