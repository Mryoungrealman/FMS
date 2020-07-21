package fsm.service;

import java.util.List;

import fsm.entity.Client;
import fsm.entity.ReWaCo;
import fsm.entity.Repertory;
import fsm.entity.Sale;
import fsm.entity.Supplier;
import fsm.entity.Supply;

public interface IFSMService {
	
	public List<ReWaCo> QueryRepertory();
	
	public List<Repertory> QueryTinyRepertory();
	
	public String CheckSupId(String supId);
	
	public String CheckCompId(String compId);
	
	public String CheckWareId(String wareId);
	
	public String CheckCliId(String cliId);
	
	
	public String AddOrder(Supply supply);
	
	public String AddRpertory(Repertory repertory, String defId);
	
	public String AddSale(Sale sale, String wareId);
	
	public String AddSupplier(Supplier supplier);
	
	public String AddClient(Client client);
	
	
	public String UpdateRepertoryNum(Repertory repertory);
	
	public String UpdateRepertoryWareId(Repertory repertory, Repertory origRepertory);//试验函数
	
	public String UpdateRepertoryCompId(Repertory repertory);//试验函数
	
	public String UpdateRepertoryWCId(Repertory repertory, Repertory origRepertory);//正式使用函数
	
	
	public String DeleteRepertory(Repertory repertory);
	
}
