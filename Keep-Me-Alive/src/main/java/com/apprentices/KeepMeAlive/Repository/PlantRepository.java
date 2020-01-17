package com.apprentices.KeepMeAlive.Repository;

import com.apprentices.KeepMeAlive.Entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {

}
