package main.java;

public class Connection {

	public String db;
	
	public String sid;
	
	public String userName;
	
	public String password;
	
	public Connection(String db,String sid,String userName,String password)
	{
		this.db=db;
		this.sid=sid;
		this.userName=userName;
		this.password=password;
	}
	
	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
