package com.sds.testopia.mobile.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sds.testopia.mobile.model.Device;
import com.sds.testopia.mobile.service.DeviceService;

@RestController
@RequestMapping("/rest/device")
public class DeviceRestController {
	
	@Autowired
	DeviceService deviceService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Device>> listDevice()  {
		List<Device> deviceList = deviceService.getDeviceList();
		return ResponseEntity.ok(deviceList);
	}
	
	@RequestMapping(value = "/{deviceId}", method = RequestMethod.GET)
	public ResponseEntity<Device> getDevice(@PathVariable Long deviceId) {
		Device device = deviceService.getDevice(deviceId);
		return ResponseEntity.ok(device);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Device> registerDevice(@RequestBody Device device) {
		Device result = deviceService.saveDevice(device);
		return ResponseEntity.ok(result);
	}
	
	@RequestMapping(value = "/{deviceId}", method = RequestMethod.DELETE)
	public void deleteDevice(@PathVariable Long deviceId) {
		deviceService.deleteDevice(deviceId);
	}
	
}
