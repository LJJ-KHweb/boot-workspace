package com.kh.study.busan.model.dao;

public class SceenDto {
	
	private int id;                // 식별값
	private String lng;     	   // 경도
    private String lat;      	   // 위도
    private String mediaType;      // 미디어타입
    private String breakTime;      // 브레이크타임
    private String businessHours;  // 영업시간
    private String placeName;      // 장소명
    private String description;    // 장소설명
    private String placeType;      // 장소타입
    private String phone;          // 전화번호
    private String title;          // 제목
    private String address;        // 주소
    private String updatedAt;      // 최종작성일
    private String closedDay;      // 휴무일
	public SceenDto() {
		super();
	}
	public SceenDto(int id, String lng, String lat, String mediaType, String breakTime, String businessHours,
			String placeName, String description, String placeType, String phone, String title, String address,
			String updatedAt, String closedDay) {
		super();
		this.id = id;
		this.lng = lng;
		this.lat = lat;
		this.mediaType = mediaType;
		this.breakTime = breakTime;
		this.businessHours = businessHours;
		this.placeName = placeName;
		this.description = description;
		this.placeType = placeType;
		this.phone = phone;
		this.title = title;
		this.address = address;
		this.updatedAt = updatedAt;
		this.closedDay = closedDay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public String getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPlaceType() {
		return placeType;
	}
	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getClosedDay() {
		return closedDay;
	}
	public void setClosedDay(String closedDay) {
		this.closedDay = closedDay;
	}
	@Override
	public String toString() {
		return "SceenDto [address=" + address + ", breakTime=" + breakTime + ", businessHours=" + businessHours
				+ ", closedDay=" + closedDay + ", description=" + description + ", id=" + id + ", lat=" + lat + ", lng="
				+ lng + ", mediaType=" + mediaType + ", phone=" + phone + ", placeName=" + placeName + ", placeType="
				+ placeType + ", title=" + title + ", updatedAt=" + updatedAt + "]";
	}

    

}
