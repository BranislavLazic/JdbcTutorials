package com.dao;

import com.entities.Person;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Branislav
 * Date: 5/19/13
 * Time: 10:10 PM
 */
public interface PersonDao {

	void createPersonTable();

	void insert(Person person);

	Person selectById(int id);

	List<Person> selectAll();

	void delete(int id);

	void update(Person person,int id);
}
