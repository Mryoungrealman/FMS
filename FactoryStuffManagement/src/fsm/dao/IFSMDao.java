package fsm.dao;

import java.util.List;

import fsm.entity.Client;
import fsm.entity.ReWaCo;
import fsm.entity.Repertory;
import fsm.entity.Sale;
import fsm.entity.Supplier;
import fsm.entity.Supply;

public interface IFSMDao {
	
	public List<ReWaCo> QueryRepertory();
	
	public List<Repertory> QueryTinyRepertory();
	
	public boolean IsExist(String info, String table, String pk);
	
	
	public int AddOrder(Supply supply);
	
	public int AddRpertory(Repertory repertory, String defId);
	
	public int AddSale(Sale sale);
	
	public int DecNum(Sale sale, String wareId);
	
	public int AddSupplier(Supplier supplier);
	
	public int AddClient(Client client);
	
	
	public int UpdateRepertoryNum(Repertory repertory);
	
	public int UpdateRepertoryWareId(Repertory repertory);
	
	public int UpdateRepertoryCompId(Repertory repertory);
	
	
	public int IntegerAlteredInfo(Repertory repertory);
	
	public int AddAlteredInfo(Repertory repertory);
	
	public int DeleteOrigInfo(Repertory repertory);
	
	
}
