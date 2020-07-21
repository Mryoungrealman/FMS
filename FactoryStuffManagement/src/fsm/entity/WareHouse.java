package fsm.entity;

public class WareHouse {
	private String  ware_id;
	private String  ware_address;
	
	public WareHouse() {
		super();
	}

	public WareHouse(String ware_id, String ware_address) {
		super();
		this.ware_id = ware_id;
		this.ware_address = ware_address;
	}

	public String getWare_id() {
		return ware_id;
	}

	public void setWare_id(String ware_id) {
		this.ware_id = ware_id;
	}

	public String getWare_address() {
		return ware_address;
	}

	public void setWare_address(String ware_address) {
		this.ware_address = ware_address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ware_address == null) ? 0 : ware_address.hashCode());
		result = prime * result + ((ware_id == null) ? 0 : ware_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WareHouse other = (WareHouse) obj;
		if (ware_address == null) {
			if (other.ware_address != null)
				return false;
		} else if (!ware_address.equals(other.ware_address))
			return false;
		if (ware_id == null) {
			if (other.ware_id != null)
				return false;
		} else if (!ware_id.equals(other.ware_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WareHouse [ware_id=" + ware_id + ", ware_address=" + ware_address + "]";
	}
	
	
}
