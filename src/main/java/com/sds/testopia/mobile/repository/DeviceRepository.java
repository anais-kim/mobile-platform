package com.sds.testopia.mobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sds.testopia.mobile.model.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
    
}
