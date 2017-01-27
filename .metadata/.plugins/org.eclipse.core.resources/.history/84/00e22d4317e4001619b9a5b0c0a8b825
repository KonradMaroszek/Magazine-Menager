package Database;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;

public class FetchQuery implements Callable<ArrayList<Map<String, Object>>> 
{
	String sql;
	
	public FetchQuery(String sql) {
		super();
		this.sql = sql;
	}

	@Override
	public ArrayList<Map<String, Object>> call() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Map<String, Object>> query = DatabaseConnection.fetch_query_from_database(sql);
		return query;
		
	}
	
}
