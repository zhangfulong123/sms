package domain;

import java.io.Serializable;

public class Fmenu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1008;
	private int fid;
	private String fname;
	private double fprice;
	private int num;
	private int vid;
	public Fmenu() {
		super();
	}
	public Fmenu(int fid, String fname, double fprice, int num, int vid) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
		this.num = num;
		this.vid = vid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getFprice() {
		return fprice;
	}
	public void setFprice(double fprice) {
		this.fprice = fprice;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	@Override
		public String toString() {
			return this.fid+","+this.fname+","+this.fprice+","+this.num+","+this.vid;
		}
}
