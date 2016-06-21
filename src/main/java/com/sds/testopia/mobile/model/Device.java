package com.sds.testopia.mobile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	@Column(name="deviceId", nullable=false)
	private String deviceId;

	@Column(name="deviceName", nullable=false)
	private String deviceName;

	@Column(name="modelId", nullable=false)
	private String modelId;
	
	@Column(name="modelName", nullable=false)
	private String modelName;
	
	@Column(name="androidOS", nullable=false)
	private String androidOS;
	
	@Column(name="resolution", nullable=false)
	private String resolution;
	
	@Column(name="ip", nullable=false)
	private String ip;
	
	@Column(name="isUsed", nullable=true)
	private String isUsed;

	@Column(name="image", nullable=true)
	private String image;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getAndroidOS() {
		return androidOS;
	}

	public void setAndroidOS(String androidOS) {
		this.androidOS = androidOS;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Device [Id=" + Id + ", deviceId=" + deviceId + ", deviceName=" + deviceName + ", modelId=" + modelId
				+ ", modelName=" + modelName + ", androidOS=" + androidOS + ", resolution=" + resolution + ", ip=" + ip
				+ ", isUsed=" + isUsed + ", image=" + image + "]";
	}
	
}
