package fsm.entity;

public class Sale {
	private String comp_id;
	private String cli_id;
	private String order_no;
	private int num;
	
	public Sale(String comp_id, String cli_id, String order_no, int num) {
		super();
		this.comp_id = comp_id;
		this.cli_id = cli_id;
		this.order_no = order_no;
		this.num = num;
	}

	public Sale() {
		super();
	}

	public String getComp_id() {
		return comp_id;
	}

	public void setComp_id(String comp_id) {
		this.comp_id = comp_id;
	}

	public String getCli_id() {
		return cli_id;
	}

	public void setCli_id(String cli_id) {
		this.cli_id = cli_id;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
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
		result = prime * result + ((cli_id == null) ? 0 : cli_id.hashCode());
		result = prime * result + ((comp_id == null) ? 0 : comp_id.hashCode());
		result = prime * result + num;
		result = prime * result + ((order_no == null) ? 0 : order_no.hashCode());
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
		Sale other = (Sale) obj;
		if (cli_id == null) {
			if (other.cli_id != null)
				return false;
		} else if (!cli_id.equals(other.cli_id))
			return false;
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
		return true;
	}

	@Override
	public String toString() {
		return "Sale [comp_id=" + comp_id + ", cli_id=" + cli_id + ", order_no=" + order_no + ", num=" + num + "]";
	}
	
	
}
