package com.ischoolbar.programmer.dao;

import com.ischoolbar.programmer.entity.RoomType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 房间类型dao
 */

@Repository
public interface RoomTypeDao {
	public int add(RoomType roomType);
	public int edit(RoomType roomType);
	public int delete(Long id);
	public List<RoomType> findList(Map<String, Object> queryMap);
	public Integer getTotal(Map<String, Object> queryMap);
	public List<RoomType> findAll();
	public RoomType find(Long id);
	public int updateNum(RoomType roomType);
}
