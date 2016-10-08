package com.aotuspace.web.global.clientinfo.model;

/**
 * 
 * Title:ClientAddressData
 * Description:地址数据
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-15 下午3:53:17
 *
 */
public class ClientAddressData {
	private String ip;
	private String country;
	private String province;
	private String city;
	private String district;
	private String carrier;//运营商

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

}
