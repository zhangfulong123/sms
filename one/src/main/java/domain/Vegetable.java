package domain;

import java.io.Serializable;

public class Vegetable implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1008;
	private int vid;
	private String vname;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Vegetable(int vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}
	public Vegetable() {
		super();
	}
	@Override
	public String toString() {
		return this.vid+","+this.vname;
	}
}
