package fsm.entity;

public class Supplier {
	private String sup_id;
	private String sup_name;
	private String sup_address;
	private String sup_tele;
	
	public Supplier() {
		super();
	}

	public Supplier(String sup_id, String sup_name, String sup_address, String sup_tele) {
		super();
		this.sup_id = sup_id;
		this.sup_name = sup_name;
		this.sup_address = sup_address;
		this.sup_tele = sup_tele;
	}

	public String getSup_id() {
		return sup_id;
	}

	public void setSup_id(String sup_id) {
		this.sup_id = sup_id;
	}

	public String getSup_name() {
		return sup_name;
	}

	public void setSup_name(String sup_name) {
		this.sup_name = sup_name;
	}

	public String getSup_address() {
		return sup_address;
	}

	public void setSup_address(String sup_address) {
		this.sup_address = sup_address;
	}

	public String getSup_tele() {
		return sup_tele;
	}

	public void setSup_tele(String sup_tele) {
		this.sup_tele = sup_tele;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sup_address == null) ? 0 : sup_address.hashCode());
		result = prime * result + ((sup_id == null) ? 0 : sup_id.hashCode());
		result = prime * result + ((sup_name == null) ? 0 : sup_name.hashCode());
		result = prime * result + ((sup_tele == null) ? 0 : sup_tele.hashCode());
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
		Supplier other = (Supplier) obj;
		if (sup_address == null) {
			if (other.sup_address != null)
				return false;
		} else if (!sup_address.equals(other.sup_address))
			return false;
		if (sup_id == null) {
			if (other.sup_id != null)
				return false;
		} else if (!sup_id.equals(other.sup_id))
			return false;
		if (sup_name == null) {
			if (other.sup_name != null)
				return false;
		} else if (!sup_name.equals(other.sup_name))
			return false;
		if (sup_tele == null) {
			if (other.sup_tele != null)
				return false;
		} else if (!sup_tele.equals(other.sup_tele))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Supplier [sup_id=" + sup_id + ", sup_name=" + sup_name + ", sup_address=" + sup_address + ", sup_tele="
				+ sup_tele + "]";
	}
	
	
	
}
