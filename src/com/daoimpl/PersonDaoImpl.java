package com.daoimpl;

import com.dao.PersonDao;
import com.entities.Person;
import com.util.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Branislav
 * Date: 5/19/13
 * Time: 10:12 PM
 */
public class PersonDaoImpl implements PersonDao {
	@Override
	public void createPersonTable() {
		Connection connection = null;
		Statement statement = null;

		try{
			connection = ConnectionConfiguration.getConnection();
			statement = connection.createStatement();
			statement.execute("CREATE TABLE IF NOT EXISTS person (id int primary key unique auto_increment," +
					"first_name varchar(55), last_name varchar(55))");

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(statement !=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void insert(Person person) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionConfiguration.getConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO person (first_name,last_name)" +
					"VALUES (?, ?)");
			preparedStatement.setString(1, person.getFirstName());
			preparedStatement.setString(2, person.getLastName());
			preparedStatement.executeUpdate();
			System.out.println("INSERT INTO person (first_name,last_name)" +
					"VALUES (?, ?)");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(connection !=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Person selectById(int id) {
		return null;
	}

	@Override
	public List<Person> selectAll() {
		return null;
	}

	@Override
	public void delete(int id) {

	}

	@Override
	public void update(Person person, int id) {

	}
}
