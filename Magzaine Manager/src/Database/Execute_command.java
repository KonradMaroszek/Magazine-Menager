package Database;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;

public class Execute_command implements Runnable{
	String sql;
	
	public Execute_command(String sql) {
		super();
		this.sql = sql;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DatabaseConnection.execute_sql_command(this.sql);
	}
	
}
