package com;

import com.daoimpl.PersonDaoImpl;
import com.entities.Person;
import com.util.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Branislav
 * Date: 5/19/13
 * Time: 2:06 PM
 */
public class App {

	public static void main(String [] args) {
		PersonDaoImpl pdi = new PersonDaoImpl();

		/**Create table**/
		pdi.createPersonTable();

		/**Insert a new record**/
		Person person = new Person("John","Johnson");
		pdi.insert(person);

		/**Select by id**/
		Person personSelect = pdi.selectById(2);
		System.out.println(person.getId()+", "+person.getFirstName()+", "+person.getLastName());

		/**Delete person by id**/
		pdi.delete(3);

		/**Update person**/
		Person personUpdate = new Person("Tom","Johnson");
		pdi.update(personUpdate,1);

		/**Select all persons**/
		List<Person> persons = pdi.selectAll();
		for(Person p : persons) {
			System.out.println(p.getId()+", "+p.getFirstName()+", "+p.getLastName());
		}

	}
}
