package Database;
import java.util.ArrayList;
import java.util.Map;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.Query;
import org.skife.jdbi.v2.sqlobject.Transaction;

public class DatabaseConnection {
	

	public static <T> ArrayList<Map<String, Object>> fetch_query_from_database(String cmd)
	{

	    Handle handle = null;
	    try {
	    	DBI dbi = new DBI("jdbc:oracle:thin:@127.0.0.1:1521/czasopisma",
          		  "teter", "fx0507");
	        handle = dbi.open();
	        Query<Map<String, Object>> query = handle.createQuery(cmd);
	        ArrayList<Map<String, Object>> result = (ArrayList<Map<String, Object>>) query.list();
	        return result;

	    } finally {
	        if (handle != null) {
	            handle.close();
	        }
	    }
		
	}
	
	@Transaction
	public static void execute_sql_command(String cmd)
	{
		Handle handle = null;
		
		try{
			DBI dbi = new DBI("jdbc:oracle:thin:@127.0.0.1:1521/czasopisma",
		      		  "teter", "fx0507");
		  handle = dbi.open();
		  handle.execute(cmd);
		  handle.commit();
		}
		finally {
		  if (handle != null) {
		      handle.close();
		  }
		}
	}
}
