package com.ischoolbar.programmer.dao.admin;

import com.ischoolbar.programmer.entity.admin.Room;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * ����dao
 */

@Repository
public interface RoomDao {
	public int add(Room room);
	public int edit(Room room);
	public int delete(Long id);
	public List<Room> findList(Map<String, Object> queryMap);
	public List<Room> findAll();
	public Integer getTotal(Map<String, Object> queryMap);
	public Room find(Long id);
	public Room findBySn(String sn);
}
