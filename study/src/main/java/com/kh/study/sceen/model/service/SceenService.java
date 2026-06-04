package com.kh.study.sceen.model.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kh.study.busan.model.dao.SceenDto;
import com.kh.study.sceen.model.dto.FindKeywordDto;

@Service
public class SceenService {
	/*
	 * public SceenService() { insertApi(); }
	 * 
	 * private boolean checkSceen = false;
	 * 
	 * private void insertApi() { List<SceenDto> sceens = new ArrayList(); while
	 * (!checkSceen) { int page = 1; int prePage = 10; String url =
	 * "https://api.odcloud.kr/api/15111405/v1/uddi:d8741b9c-f484-4ea8-8f54-bd21ab62de14?serviceKey=e709bd20a5bf6bd9a618ce0c21cb1bd827931622120918517aeb919bbf63fc4c";
	 * url += "&page=" + page + "&perPage=" + prePage; URI uri = null;
	 * 
	 * try { uri = new URI(url); } catch (URISyntaxException e) {
	 * e.printStackTrace(); } String apiResponse = new
	 * RestTemplate().getForObject(uri, String.class);
	 * 
	 * ObjectMapper mapper = new ObjectMapper(); try { JsonNode root =
	 * mapper.readTree(apiResponse); JsonNode data = root.get("data");
	 * 
	 * SceenDto sceen; for (JsonNode item : data) { int id = item.get("연번").asInt();
	 * String lng = item.get("경도").asText(); String lat = item.get("위도").asText();
	 * String mediaType = item.get("미디어타입").asText(); String breakTime =
	 * item.get("브레이크타임").asText(); String businessHours =
	 * item.get("영업시간").asText(); String placeName = item.get("장소명").asText();
	 * String description = item.get("장소설명").asText(); String placeType =
	 * item.get("장소타입").asText(); String phone = item.get("전화번호").asText(); String
	 * title = item.get("제목").asText(); String address = item.get("주소").asText();
	 * String updatedAt = item.get("최종작성일").asText(); String closedDay =
	 * item.get("휴무일").asText(); sceen = new SceenDto(id,lng,lat,
	 * mediaType,breakTime,businessHours, placeName,description,
	 * placeType,phone,title,address,updatedAt,closedDay); sceens.add(sceen); } //
	 * if (data.size() < prePage) { checkSceen = true; // }
	 * 
	 * } catch (JsonMappingException e) { e.printStackTrace(); } catch
	 * (JsonProcessingException e) { e.printStackTrace(); } page++; }
	 * 
	 * }
	 * 
	 * public String getResult(int page) {
	 * 
	 * String url =
	 * "https://api.odcloud.kr/api/15111405/v1/uddi:d8741b9c-f484-4ea8-8f54-bd21ab62de14?perPage=10&returnType=json&serviceKey=e709bd20a5bf6bd9a618ce0c21cb1bd827931622120918517aeb919bbf63fc4c";
	 * url += "&page=" + page; URI uri = null;
	 * 
	 * try { uri = new URI(url); } catch (URISyntaxException e) {
	 * e.printStackTrace(); } String response = new RestTemplate().getForObject(uri,
	 * String.class); System.out.println(response); return response; }
	 */

	/*public String findByKeyword(FindKeywordDto findKeywordDto) {
		
	}*/

}
