package control;

import java.sql.Date;
import java.util.List;

import domain.Account;
import domain.Card;
import domain.Employee;
import domain.Fmenu;
import domain.Sale;
import domain.Type;
import domain.Users;
import domain.Vegetable;

public interface SMSservice {
	/**
	 * @param account
	 * @param password
	 * TODO 员工登录验证的方法
	 * @return
	 */
	public Employee login(int eid);
	/**2019年4月19日上午9:22:03
	 * long
	 * @param eid
	 * @param name
	 * @param esex
	 * @param mgr
	 * @param ephone
	 * @param edate
	 * @param job
	 * @param power
	 * @return 字符串
	 * TODO 添加员工信息，是经理添加
	 */
	public String addemployee(int eid,String name,String esex,int mgr,int ephone,String edate,String job,int power);
	/**2019年4月19日上午9:22:53
	 * long
	 * @param eid
	 * @return 员工 
	 * TODO 查询员工信息通过id
	 */
	public Employee selectemp(int eid);
	/**2019年4月19日上午9:23:39
	 * long
	 * @param eid
	 * @return
	 * TODO 删除员工 通过id 经理管
	 */
	public String deleteemp(int eid);
	/**2019年4月19日上午9:24:01
	 * long
	 * @param eid
	 * @return boolean
	 * TODO 更改员工信息 
	 */
	//public boolean updateemp(int eid);
	/**2019年4月19日上午9:24:26
	 * long
	 * @return
	 * TODO 查询所有员工信息
	 */
	public List<Employee> selectAllemp();
	/**2019年4月19日上午9:25:18
	 * long
	 * @param fid
	 * @param fname
	 * @param fprice
	 * @param num
	 * @param vid
	 * @return 
	 * TODO 添加菜单信息
	 */
	public String addfmenu(int fid,String fname,double fprice,int num,int vid);
	/**2019年4月19日上午9:25:38
	 * long
	 * @param fid
	 * @return
	 * TODO 删除菜单
	 */
	public String deletefmenu(int fid);
	/**2019年4月19日上午9:25:47
	 * long
	 * @param fid
	 * @return
	 * TODO 更改菜单
	 */
	//public boolean updatefmenu(int fid);
	/**2019年4月19日上午9:27:00
	 * long
	 * @param fid
	 * @return
	 * TODO 查询菜单 通过菜单id
	 */
	public Fmenu selectfmenu(int fid);
	/**2019年4月19日上午9:27:15
	 * long
	 * @return
	 * TODO 查询所有菜单
	 */
	public List<Fmenu> selectAllfmenu();
	/**2019年4月19日上午9:27:35
	 * long
	 * @param vid
	 * @param vname
	 * @return
	 * TODO 添加菜品类别
	 */
	public String addveg(int vid,String vname);
	/**2019年4月19日上午9:27:51
	 * long
	 * @param vid
	 * @return
	 * TODO 删除菜品类别
	 */
	public String deleteveg(int vid);
	/**2019年4月19日上午9:27:59
	 * long
	 * @param vid
	 * @return
	 * TODO 更改菜品类别 通过id
	 */
	//public boolean updateveg(int vid);
	/**2019年4月19日上午9:28:21
	 * long
	 * @param vid
	 * @return
	 * TODO 查询菜品类别通过id
	 */
	public Vegetable selectveg(int vid);
	/**2019年4月19日上午9:28:40
	 * long
	 * @return
	 * TODO 查询所有菜品类别
	 */
	public List<Vegetable> selectAllveg();
	/**2019年4月19日上午9:28:58
	 * long
	 * @param cid
	 * @param state
	 * @param tid
	 * @param scoring
	 * @param cprice
	 * @param cquota
	 * @return 
	 * TODO 添加卡的信息
	 */
	public String addcard(int cid,String state,int tid,int scoring,double cprice,double cquota);
	/**2019年4月19日上午9:29:10
	 * long
	 * @param cid
	 * @return
	 * TODO 删除卡的信息 通过id
	 */
	public String deletecard(int cid);
	/**2019年4月19日上午9:29:27
	 * long
	 * @param cid
	 * @return
	 * TODO 
	 */
	//public boolean updatecardstate(int cid);
	//public boolean updatecardcquota(int cid);
	/**2019年4月19日上午9:32:39
	 * long
	 * @param cid
	 * @return
	 * TODO 查询卡信息 通过id
	 */
	public Card selectcard(int cid);
	//public List<Card> selectAllcard();
	/**2019年4月19日上午9:33:08
	 * long
	 * @param fid
	 * @param anum
	 * @param aid
	 * @param uuid
	 * @return
	 * TODO 添加购物车
	 */
	public String addacc(int fid,int anum,int aid,String uuid);
	/**2019年4月19日上午9:33:22
	 * long
	 * @param fid
	 * @return
	 * TODO 删除购物车 通过id
	 */
	public String deleteacc(int fid);
	
	public boolean deleteAllacc(String uuid);
	/**2019年4月19日上午9:33:36
	 * long
	 * @param fid
	 * @return
	 * TODO 更改购物车  通过id
	 */
	public boolean updateacc(int aid,int anum,int fid);
	/**2019年4月19日上午9:34:04
	 * long
	 * @param uuid
	 * @return
	 * TODO 查询购物车信息通过桌号并结账
	 */
	public List<Account> selectacc(String uuid);
	
	/**2019年4月19日下午5:31:09
	 * long
	 * @param uuid
	 * @return
	 * TODO 结账
	 */
	public double moneyacc(String uuid);
	/**2019年4月19日上午9:34:26
	 * long
	 * @param fid
	 * @param num
	 * @return
	 * TODO 添加总销售
	 */
	public String addsal(int fid,int num);
	//public String deletesal();
	public List<Sale> selectAllsal();
	/**2019年4月19日上午9:34:46
	 * long
	 * @param tid
	 * @param tname
	 * @return
	 * TODO 添加卡类型
	 */
	public String addtype(int tid,String tname);
	//public boolean updatetype(int tid);
	public List<Type> selectAlltype();
	/**2019年4月19日上午9:35:16
	 * long
	 * @param id
	 * @param uname
	 * @param cid
	 * @param uphone
	 * @return
	 * TODO 添加用户
	 */
	public String addusers(int id,String uname,int cid,int uphone);
	//public String deleteusers(int id);
	//public boolean updateusers(int id);
	public List<Users> selectAllusers();
	/**
	 * @param cid
	 * @return
	 * TODO 通过卡的id来充值卡 更改卡内金额    cprice表示要充值的金额
	 */
	public boolean updatecardmoney(int cid,double cprice);

	
	
}
