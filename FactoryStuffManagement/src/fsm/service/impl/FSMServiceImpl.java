package fsm.service.impl;

import java.util.List;

import fsm.dao.IFSMDao;
import fsm.dao.impl.FSMDaoImpl;
import fsm.entity.Client;
import fsm.entity.ReWaCo;
import fsm.entity.Repertory;
import fsm.entity.Sale;
import fsm.entity.Supplier;
import fsm.entity.Supply;
import fsm.service.IFSMService;

public class FSMServiceImpl implements IFSMService{
	
	IFSMDao FSMDao = new FSMDaoImpl();
	
	@Override
	public List<ReWaCo> QueryRepertory() {
		List<ReWaCo> list = FSMDao.QueryRepertory();
		return list;
	}

	@Override
	public String CheckSupId(String supId) {
		boolean result = FSMDao.IsExist(supId, "supplier", "sup_id");
		if(result == true) {
			return "yes";
		}else {
			return "no";
		}
	}

	@Override
	public String CheckCompId(String compId) {
		boolean result = FSMDao.IsExist(compId, "component_", "comp_id");
		if(result == true) {
			return "yes";
		}else {
			return "no";
		}
	}

	@Override
	public String CheckWareId(String wareId) {
		boolean result = FSMDao.IsExist(wareId, "warehouse", "ware_id");
		if(result == true) {
			return "yes";
		}else {
			return "no";
		}
	}



	@Override
	public String AddOrder(Supply supply) {
		if(FSMDao.AddOrder(supply) == 0) {
			return "no";
		}else {
			return "yes";
		}
	}

	@Override
	public String AddRpertory(Repertory repertory, String defId) {
		if(FSMDao.AddRpertory(repertory, defId) == 0) {
			return "no";
		}else {
			return "yes";
		}
	}

	@Override
	public String UpdateRepertoryNum(Repertory repertory) {
		if(FSMDao.UpdateRepertoryNum(repertory) == 0) {
			return "no";
		}else {
			return "yes";
		}
	}

	@Override
	public String UpdateRepertoryWareId(Repertory repertory, Repertory origRepertory) {
		if(FSMDao.IntegerAlteredInfo(repertory) == 0) {
			int res = FSMDao.AddAlteredInfo(repertory);
			if(res == 0 || res == -1) {
				return "update and insert fail";
			}else {
				FSMDao.DeleteOrigInfo(origRepertory);
				return "insert ok";
			}
		}else {
			FSMDao.DeleteOrigInfo(origRepertory);
			return "update ok";
		}
	}

	@Override
	public String UpdateRepertoryCompId(Repertory repertory) {
		return null;
	}

	@Override
	public String UpdateRepertoryWCId(Repertory repertory, Repertory origRepertory) {
		if(FSMDao.IntegerAlteredInfo(repertory) == 0) {
			int res = FSMDao.AddAlteredInfo(repertory);
			if(res == 0 || res == -1) {
				return "update and insert fail";
			}else {
				FSMDao.DeleteOrigInfo(origRepertory);
				return "insert ok";
			}
		}else {
			FSMDao.DeleteOrigInfo(origRepertory);
			return "update ok";
		}
	}

	@Override
	public String DeleteRepertory(Repertory repertory) {
		if(FSMDao.DeleteOrigInfo(repertory) == 0) {
			return "no";
		}else {
			return "yes";
		}
	}

	@Override
	public String AddSale(Sale sale, String wareId) {
		if(FSMDao.DecNum(sale, wareId) == 0) {
			return "not enough";
		}else {
			int res = FSMDao.AddSale(sale);
			if(res == 0 || res == -1) {
				return "dup or error";
			}else {
				return "yes";
			}
		}
	}

	@Override
	public List<Repertory> QueryTinyRepertory() {
		List<Repertory> list = FSMDao.QueryTinyRepertory();
		return list;
	}

	@Override
	public String CheckCliId(String cliId) {
		boolean result = FSMDao.IsExist(cliId, "client_", "cli_id");
		if(result == true) {
			return "yes";
		}else {
			return "no";
		}
	}

	@Override
	public String AddSupplier(Supplier supplier) {
		int res = FSMDao.AddSupplier(supplier);
		if(res == 0 || res == -1) {
			return "duplicate or error";
		}else {
			return "yes";
		}
	}

	@Override
	public String AddClient(Client client) {
		int res = FSMDao.AddClient(client);
		if(res == 0 || res == -1) {
			return "duplicate or error";
		}else {
			return "yes";
		}
	}

	
}
