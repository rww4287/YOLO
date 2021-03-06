package com.yolo.trippart.dao;

import java.util.List;

import com.yolo.trippart.vo.TripPartVO;

public interface TripPartDao {

	public int insertOneTripPart(List<TripPartVO> tripPartVOList);
	
	public List<TripPartVO> getTripPartByTripId(String partId);
	
	public int updateOneTripPart(TripPartVO tripPartVO);
	
	public TripPartVO getOneTripPart(String tripPartId);
}
