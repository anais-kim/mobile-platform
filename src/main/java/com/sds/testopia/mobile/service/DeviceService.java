package com.sds.testopia.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sds.testopia.mobile.model.Device;
import com.sds.testopia.mobile.repository.DeviceRepository;

@Service
public class DeviceService {
	
	@Autowired
	DeviceRepository deviceRepository;
	
	public List<Device> getDeviceList() {
		return deviceRepository.findAll();
	}
	
	public Device getDevice(Long deviceId) {
		return deviceRepository.findOne(deviceId);
	}
	
	public Device saveDevice(Device device) {
		return deviceRepository.save(device);
	}
	
	public void deleteDevice(Long deviceId) {
		deviceRepository.delete(deviceId);
	}

}
