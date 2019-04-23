package domain;

import java.io.Serializable;

public class Sale implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1008;
	private int fid;
	private int num;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Sale(int fid, int num) {
		super();
		this.fid = fid;
		this.num = num;
	}
	public Sale() {
		super();
	}
	@Override
		public String toString() {
			return this.fid+","+this.num;
		}
}
