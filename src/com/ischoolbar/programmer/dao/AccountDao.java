package com.ischoolbar.programmer.dao;

import com.ischoolbar.programmer.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * �ͻ�dao
 */

@Repository
public interface AccountDao {
	public int add(Account account);
	public int edit(Account account);
	public int delete(Long id);
	public List<Account> findList(Map<String, Object> queryMap);
	public Integer getTotal(Map<String, Object> queryMap);
	public Account find(Long id);
	public Account findByName(String name);
	public List<Account> findAll();
}
