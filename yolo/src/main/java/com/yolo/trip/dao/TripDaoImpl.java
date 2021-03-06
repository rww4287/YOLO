package com.yolo.trip.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.yolo.trip.vo.TripSearchVO;
import com.yolo.trip.vo.TripVO;

public class TripDaoImpl extends SqlSessionDaoSupport implements TripDao {

	@Override
	public String generateTripPK() {
		return getSqlSession().selectOne("TripDao.generateTripPK");
	}

	@Override
	public int insertOneTrip(TripVO tripVO) {
		return getSqlSession().insert("TripDao.insertOneTrip",tripVO);
	}

	@Override
	public List<TripVO> getAllTrips(TripSearchVO tripSearchVO) {
		return getSqlSession().selectList("TripDao.getAllTrips",tripSearchVO);
	}

	@Override
	public int getAllTripCount(TripSearchVO tripSearchVO) {
		return getSqlSession().selectOne("TripDao.getAllTripCount",tripSearchVO);
	}

	@Override
	public int deleteTrip(String tripId) {
		return getSqlSession().delete("TripDao.deleteTrip",tripId);
		
	}

	@Override
	public TripVO getOneTrip(String tripId) {
		return getSqlSession().selectOne("TripDao.getOneTrip", tripId);
	}

	@Override
	public int tripLikeCountUpdatePlus(String tripId) {
		return getSqlSession().update("TripDao.tripLikeCountUpdatePlus",tripId);
	}

	@Override
	public int tripLikeCountUpdateMinus(String tripId) {
		return getSqlSession().update("TripDao.tripLikeCountUpdateMinus",tripId);
	}

	@Override
	public int updateOneTrip(TripVO tripVO) {
		return getSqlSession().update("TripDao.updateOneTrip",tripVO);
	}

	@Override
	public List<TripVO> getAllTripByUserId(String userId) {
		return getSqlSession().selectList("TripDao.getAllTripByUserId", userId);
	}
	
	@Override
	public List<TripVO> getAllNewestTrips() {
		return getSqlSession().selectList("TripDao.getAllNewestTrips");
	}

}
