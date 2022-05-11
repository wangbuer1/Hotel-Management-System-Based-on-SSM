package com.ischoolbar.programmer.dao.admin;

import com.ischoolbar.programmer.entity.admin.Floor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Â¥²ãdao
 * @author Administrator
 *
 */
@Repository
public interface FloorDao {
	public int add(Floor floor);
	public int edit(Floor floor);
	public int delete(Long id);
	public List<Floor> findList(Map<String, Object> queryMap);
	public List<Floor> findAll();
	public Integer getTotal(Map<String, Object> queryMap);
}
