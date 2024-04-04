package fr.wave.remotedemo.repository;

import fr.wave.remotedemo.entity.FileEntity;
import fr.wave.remotedemo.entity.TargetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TargetRepository extends JpaRepository<TargetEntity, String> {

}
