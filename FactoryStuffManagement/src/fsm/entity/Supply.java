package fsm.entity;

public class Supply {
	private String order_no;
	private String sup_id;
	private String comp_id;
	private int num;
	
	public Supply() {
		super();
	}

	public Supply(String order_no, String sup_id, String comp_id, int num) {
		super();
		this.order_no = order_no;
		this.sup_id = sup_id;
		this.comp_id = comp_id;
		this.num = num;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getSup_id() {
		return sup_id;
	}

	public void setSup_id(String sup_id) {
		this.sup_id = sup_id;
	}

	public String getComp_id() {
		return comp_id;
	}

	public void setComp_id(String comp_id) {
		this.comp_id = comp_id;
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
		result = prime * result + num;
		result = prime * result + ((order_no == null) ? 0 : order_no.hashCode());
		result = prime * result + ((sup_id == null) ? 0 : sup_id.hashCode());
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
		Supply other = (Supply) obj;
		if (comp_id == null) {
			if (other.comp_id != null)
				return false;
		} else if (!comp_id.equals(other.comp_id))
			return false;
		if (num != other.num)
			return false;
		if (order_no == null) {
			if (other.order_no != null)
				return false;
		} else if (!order_no.equals(other.order_no))
			return false;
		if (sup_id == null) {
			if (other.sup_id != null)
				return false;
		} else if (!sup_id.equals(other.sup_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Supply [order_no=" + order_no + ", sup_id=" + sup_id + ", comp_id=" + comp_id + ", num=" + num + "]";
	}
	
	
}
