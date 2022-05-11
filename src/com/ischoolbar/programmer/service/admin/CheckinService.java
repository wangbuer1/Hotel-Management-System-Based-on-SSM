package com.ischoolbar.programmer.service.admin;
/**
 * Èë×¡service
 */

import com.ischoolbar.programmer.entity.admin.Checkin;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CheckinService {
	public int add(Checkin checkin);
	public int edit(Checkin checkin);
	public int delete(Long id);
	public List<Checkin> findList(Map<String, Object> queryMap);
	public Integer getTotal(Map<String, Object> queryMap);
	public Checkin find(Long id);
	public List<Map> getStatsByMonth();
	public List<Map> getStatsByDay();
}
