package com.ischoolbar.programmer.dao;

import com.ischoolbar.programmer.entity.BookOrder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Ô¤¶¨¶©µ¥dao
 */

@Repository
public interface BookOrderDao {
	public int add(BookOrder bookOrder);
	public int edit(BookOrder bookOrder);
	public int delete(Long id);
	public List<BookOrder> findList(Map<String, Object> queryMap);
	public Integer getTotal(Map<String, Object> queryMap);
	public BookOrder find(Long id);
}
