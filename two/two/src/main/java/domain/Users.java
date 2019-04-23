package domain;

import java.io.Serializable;

public class Users implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1009;
	private int id;
	private String uname;
	private int cid;
	private int uphone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getUphone() {
		return uphone;
	}
	public void setUphone(int uphone) {
		this.uphone = uphone;
	}
	public Users(int id, String uname, int cid, int uphone) {
		super();
		this.id = id;
		this.uname = uname;
		this.cid = cid;
		this.uphone = uphone;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return this.id+","+this.uname+","+this.cid+","+this.uphone;
	}
}
