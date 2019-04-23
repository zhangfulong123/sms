package control;


import java.util.Date;
import java.util.List;
import domain.Employee;
import domain.Fmenu;
import domain.Vegetable;


//代理
public interface SMSService {
	//员工信息管理（员工信息查询、信息添加、信息修改、信息删除
	/**
	 * @return
	 * TODO 查询所有员工
	 */
	public List<Employee> selectAllemp();
	/**
	 * @param eid
	 * @return
	 * TODO 通过员工编号查询个别员工
	 */
	public Employee selectEmpbyid(int eid);
	/**
	 * @param eid
	 * @param name
	 * @param esex
	 * @param mgr
	 * @param ephone
	 * @param edate
	 * @param job
	 * @param power
	 * @return
	 * TODO 添加员工信息 返回添加成功？添加失败  
	 */
	public String addEmpmsg(Employee emp); 
	/**
	 * @param emp
	 * @return
	 * TODO 员工信息修改
	 */
	public String updateEmpmsg(Employee emp);
	/**
	 * @param eid
	 * @return
	 * TODO 通过查找员工编号删除该员工
	 */
	public boolean deleteEmp(int eid);
	//菜品类别管理（菜品信息查询、菜品信息添加、菜品信息修改、菜品信息删除）
	/**
	 * @param vid
	 * @return
	 * TODO 菜品信息查询
	 */
	public Vegetable selectVege(int vid);
	public List<Vegetable> selectAllvege();
	/**
	 * @param vid
	 * @param vName
	 * @return
	 * TODO 菜品信息添加
	 */
	public String addVege(int vid,String vName);
	/**
	 * @param vid
	 * @return
	 * TODO菜品信息修改
	 */
	public boolean updateVege(int vid,String vName);
	/**
	 * @param vid
	 * @return
	 * TODO菜品信息删除
	 */
	public boolean deleteVege(int vid);
	//菜单信息管理  （菜单信息添加、菜单信息查询、菜单信息修改、菜单信息删除）
	/**
	 * @param fid
	 * @return
	 * TODO 全部菜单
	 */
	public List<Fmenu> selectMenu();
	/**
	 * @param fid
	 * @param fname
	 * @param fprice
	 * @param num
	 * @param vid
	 * @return
	 * TODO 添加菜单信息
	 */
	public String addMenu(int fid,String fname,double fprice,int num,int vid);
	/**
	 * @param fid
	 * @return
	 * TODO 通过菜单id找到该菜单并进行修改
	 */
	public boolean updateMenu(Fmenu f);
	public Fmenu selectMenubyfid(int fid);
	/**
	 * @param fid
	 * @return
	 * TODO 通过菜单id找到该菜单并进行删除
	 */
	public boolean deleteMenu(int fid);
	//卡信息管理（修改卡的类型、修改卡的状态）
	/**
	 * @param cid
	 * @return
	 * TODO 通过卡id找到这张卡然后进行修改类型（金卡-银卡）
	 */
	public boolean updateCardtype(int cid,int tid);
	/**
	 * @param cid
	 * @return
	 * TODO 通过卡id找到这张卡然后进行修改状态（激活-冻结）
	 */
	public boolean updateCardstate(int cid,String state);
	public boolean updateCardquoat(int cid,double cquota);
	
	
}
