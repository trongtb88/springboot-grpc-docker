package com.thanh.repository;

import com.thanh.dao.SeatEntity;
import com.thanh.dao.SeatIdentity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeatEntityRepository extends CrudRepository<SeatEntity, SeatIdentity> {

    @Query("SELECT s FROM SeatEntity s WHERE s.status = 'empty'")
    public List<SeatEntity> findAllByStatusEqualsEmpty();
}
