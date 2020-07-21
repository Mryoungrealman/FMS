package fsm.entity;

public class Manage {
	private String staff_id;
	private String ware_id;
	
	public Manage() {
		super();
	}

	public Manage(String staff_id, String ware_id) {
		super();
		this.staff_id = staff_id;
		this.ware_id = ware_id;
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public String getWare_id() {
		return ware_id;
	}

	public void setWare_id(String ware_id) {
		this.ware_id = ware_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((staff_id == null) ? 0 : staff_id.hashCode());
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
		Manage other = (Manage) obj;
		if (staff_id == null) {
			if (other.staff_id != null)
				return false;
		} else if (!staff_id.equals(other.staff_id))
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
		return "Manage [staff_id=" + staff_id + ", ware_id=" + ware_id + "]";
	}
	
}
