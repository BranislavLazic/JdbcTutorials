import com.daoimpl.PersonDaoImpl;
import com.entities.Person;
import com.util.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Branislav
 * Date: 5/19/13
 * Time: 2:06 PM
 */
public class App {

	public static void main(String [] args) {
		PersonDaoImpl pdi = new PersonDaoImpl();
		//pdi.createPersonTable();
		//Person person = new Person("Jane","Johnson");
		//pdi.insert(person);
		Person person = pdi.selectById(2);
		System.out.println(person.getId()+", "+person.getFirstName()+", "+person.getLastName());
	}
}
