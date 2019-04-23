 package domain;

import java.io.Serializable;

public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1008;
	private int fid;
	private int anum;
	private int aid;
	private String uuid;
	public Account() {
		super();
	}
	public Account(int fid, int anum, int aid, String uuid) {
		super();
		this.fid = fid;
		this.anum = anum;
		this.aid = aid;
		this.uuid = uuid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getAnum() {
		return anum;
	}
	public void setAnum(int anum) {
		this.anum = anum;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	@Override
		public String toString() {
		  return this.fid+","+this.anum+","+this.aid+","+this.uuid;
		}

}
