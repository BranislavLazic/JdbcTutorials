import com.daoimpl.PersonDaoImpl;
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
		pdi.createPersonTable();

	}
}
