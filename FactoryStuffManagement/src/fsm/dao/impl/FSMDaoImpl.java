package fsm.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fsm.dao.IFSMDao;
import fsm.entity.Client;
import fsm.entity.ReWaCo;
import fsm.entity.Repertory;
import fsm.entity.Sale;
import fsm.entity.Supplier;
import fsm.entity.Supply;
import sql.DBUtil;

public class FSMDaoImpl implements IFSMDao{

	@Override
	public List<ReWaCo> QueryRepertory() {
		List<ReWaCo> list = new ArrayList<ReWaCo>();
		ReWaCo detail = null;
		
		String sql = "select repertory.comp_id, component_.comp_name, component_.comp_size, component_.comp_price, repertory.ware_id, warehouse.ware_address, repertory.num from repertory join component_ on(repertory.comp_id=component_.comp_id) join warehouse on(repertory.ware_id=warehouse.ware_id) order by repertory.comp_id"; 
		ResultSet rs = DBUtil.executeQuery(sql, null);
		
		try {
			while(rs.next()) {
				String comp_id = rs.getString("repertory.comp_id");
				String comp_name = rs.getString("component_.comp_name");
				String comp_size = rs.getString("component_.comp_size");
				double comp_price = rs.getDouble("component_.comp_price");
				String ware_id = rs.getString("repertory.ware_id");
				String ware_address = rs.getString("warehouse.ware_address");
				int num = rs.getInt("repertory.num");
				
				detail = new ReWaCo(comp_id, comp_name, comp_size, comp_price, ware_id, ware_address, num);
				list.add(detail);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			DBUtil.closeAll(rs);
		}
		
	}

	@Override
	public boolean IsExist(String info, String table, String pk) {
		boolean flag = false;
		String sql = "select * from " + table + " where "+ pk +" = ?";
		Object[] params = {info};
		ResultSet rs = DBUtil.executeQuery(sql, params);
		
		try {
			if(rs.next()) {
				flag = true;
			}
			return flag;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return flag;
		}finally {
			DBUtil.closeAll(rs);
		}
		
	}

	@Override
	public int AddOrder(Supply supply) {
		String sql = "insert into supply values(?, ?, ?, ?)";
		Object[] params = {supply.getOrder_no(), supply.getSup_id(), supply.getComp_id(), supply.getNum()};
		
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public int AddRpertory(Repertory repertory, String defId) {
		String sql = "update repertory set num=num+? where ware_id = ? and comp_id = ?";
		if(repertory.getWare_id().equals("")) {
			repertory.setWare_id(defId);
		}
		Object[] params = {repertory.getNum(), repertory.getWare_id(), repertory.getComp_id()};
		
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public int UpdateRepertoryNum(Repertory repertory) {
		
		String sql = "update repertory set num=? where ware_id = ? and comp_id = ?";
		
		Object[] params = {repertory.getNum(), repertory.getWare_id(), repertory.getComp_id()};
		
		return DBUtil.executeUpdate(sql, params);
		
	}

	@Override
	public int UpdateRepertoryWareId(Repertory repertory) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UpdateRepertoryCompId(Repertory repertory) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int IntegerAlteredInfo(Repertory repertory) {
		String sql = "update repertory set num=num+? where ware_id = ? and comp_id = ?";
		
		Object[] params = {repertory.getNum(), repertory.getWare_id(), repertory.getComp_id()};
		
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public int AddAlteredInfo(Repertory repertory) {
		String sql = "insert into repertory values(?, ?, ?)";
		
		Object[] params = {repertory.getWare_id(), repertory.getComp_id(), repertory.getNum()};
		
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public int DeleteOrigInfo(Repertory origRepertory) {
		String sql = "delete from repertory where ware_id = ? and comp_id = ?";
		
		Object[] params = {origRepertory.getWare_id(), origRepertory.getComp_id()};
		
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public int AddSale(Sale sale) {
		String sql = "insert into sale values(?, ?, ?, ?)";
		
		Object[] params = {sale.getComp_id(), sale.getCli_id(), sale.getOrder_no(), sale.getNum()};
		
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public int DecNum(Sale sale, String wareId) {
		String sql = "update repertory set num=num-? where ware_id = ? and comp_id = ? and num >= ?";
		
		Object[] params = {sale.getNum(), wareId, sale.getComp_id(), sale.getNum()};
		
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public List<Repertory> QueryTinyRepertory() {
		List<Repertory> list = new ArrayList<Repertory>();
		Repertory detail = null;
		
		String sql = "select * from repertory"; 
		ResultSet rs = DBUtil.executeQuery(sql, null);
		
		try {
			while(rs.next()) {
				String comp_id = rs.getString("comp_id");
				String ware_id = rs.getString("ware_id");
				int num = rs.getInt("num");
				
				detail = new Repertory(ware_id, comp_id, num);
				list.add(detail);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			DBUtil.closeAll(rs);
		}
	}

	@Override
	public int AddSupplier(Supplier supplier) {
		String sql = "insert into supplier values(?, ?, ?, ?)";
		
		Object[] params = {supplier.getSup_id(), supplier.getSup_name(), supplier.getSup_address(), supplier.getSup_tele()};
		
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public int AddClient(Client client) {
		String sql = "insert into client_ values(?, ?)";
		
		Object[] params = {client.getCli_id(), client.getCli_name()};
		
		return DBUtil.executeUpdate(sql, params);
	}

	

}
