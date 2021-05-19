package com.xfactor.lably.Repository;



import com.xfactor.lably.entity.Lab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabRepository extends JpaRepository<Lab,Long>
{
    
}