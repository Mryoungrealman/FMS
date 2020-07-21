package fsm.entity;

public class Repertory {
	private String ware_id;
	private String comp_id;
	private int num;
	
	public Repertory() {
		super();
	}
	
	public Repertory(String ware_id, String comp_id, int num) {
		super();
		this.ware_id = ware_id;
		this.comp_id = comp_id;
		this.num = num;
	}
	
	public Repertory(String ware_id, String comp_id) {
		super();
		this.ware_id = ware_id;
		this.comp_id = comp_id;
	}

	public String getWare_id() {
		return ware_id;
	}

	public void setWare_id(String ware_id) {
		this.ware_id = ware_id;
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
		Repertory other = (Repertory) obj;
		if (comp_id == null) {
			if (other.comp_id != null)
				return false;
		} else if (!comp_id.equals(other.comp_id))
			return false;
		if (num != other.num)
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
		return "Repertory [ware_id=" + ware_id + ", comp_id=" + comp_id + ", num=" + num + "]";
	}
	
	
}
