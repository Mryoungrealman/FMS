package fsm.entity;

public class ReWaCo {
	private String comp_id;
	private String comp_name;
	private String comp_size;
	private double comp_price;
	
	private String  ware_id;
	private String  ware_address;
	
	private int num;

	public ReWaCo() {
		super();
	}

	public ReWaCo(String comp_id, String comp_name, String comp_size, double comp_price, String ware_id,
			String ware_address, int num) {
		super();
		this.comp_id = comp_id;
		this.comp_name = comp_name;
		this.comp_size = comp_size;
		this.comp_price = comp_price;
		this.ware_id = ware_id;
		this.ware_address = ware_address;
		this.num = num;
	}

	public String getComp_id() {
		return comp_id;
	}

	public void setComp_id(String comp_id) {
		this.comp_id = comp_id;
	}

	public String getComp_name() {
		return comp_name;
	}

	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}

	public String getComp_size() {
		return comp_size;
	}

	public void setComp_size(String comp_size) {
		this.comp_size = comp_size;
	}

	public double getComp_price() {
		return comp_price;
	}

	public void setComp_price(double comp_price) {
		this.comp_price = comp_price;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comp_id == null) ? 0 : comp_id.hashCode());
		result = prime * result + ((comp_name == null) ? 0 : comp_name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(comp_price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((comp_size == null) ? 0 : comp_size.hashCode());
		result = prime * result + num;
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
		ReWaCo other = (ReWaCo) obj;
		if (comp_id == null) {
			if (other.comp_id != null)
				return false;
		} else if (!comp_id.equals(other.comp_id))
			return false;
		if (comp_name == null) {
			if (other.comp_name != null)
				return false;
		} else if (!comp_name.equals(other.comp_name))
			return false;
		if (Double.doubleToLongBits(comp_price) != Double.doubleToLongBits(other.comp_price))
			return false;
		if (comp_size == null) {
			if (other.comp_size != null)
				return false;
		} else if (!comp_size.equals(other.comp_size))
			return false;
		if (num != other.num)
			return false;
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
		return "ReWaCo [comp_id=" + comp_id + ", comp_name=" + comp_name + ", comp_size=" + comp_size + ", comp_price="
				+ comp_price + ", ware_id=" + ware_id + ", ware_address=" + ware_address + ", num=" + num + "]";
	}
	
	
}
