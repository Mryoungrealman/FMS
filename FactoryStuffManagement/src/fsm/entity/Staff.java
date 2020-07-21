package fsm.entity;

public class Staff {
	private String staff_id;
	private String staff_name;
	private int staff_age;
	private String staff_sex;
	private String staff_tele;
	
	public Staff() {
		super();
	}

	public Staff(String staff_id, String staff_name, int staff_age, String staff_sex, String staff_tele) {
		super();
		this.staff_id = staff_id;
		this.staff_name = staff_name;
		this.staff_age = staff_age;
		this.staff_sex = staff_sex;
		this.staff_tele = staff_tele;
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public int getStaff_age() {
		return staff_age;
	}

	public void setStaff_age(int staff_age) {
		this.staff_age = staff_age;
	}

	public String getStaff_sex() {
		return staff_sex;
	}

	public void setStaff_sex(String staff_sex) {
		this.staff_sex = staff_sex;
	}

	public String getStaff_tele() {
		return staff_tele;
	}

	public void setStaff_tele(String staff_tele) {
		this.staff_tele = staff_tele;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + staff_age;
		result = prime * result + ((staff_id == null) ? 0 : staff_id.hashCode());
		result = prime * result + ((staff_name == null) ? 0 : staff_name.hashCode());
		result = prime * result + ((staff_sex == null) ? 0 : staff_sex.hashCode());
		result = prime * result + ((staff_tele == null) ? 0 : staff_tele.hashCode());
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
		Staff other = (Staff) obj;
		if (staff_age != other.staff_age)
			return false;
		if (staff_id == null) {
			if (other.staff_id != null)
				return false;
		} else if (!staff_id.equals(other.staff_id))
			return false;
		if (staff_name == null) {
			if (other.staff_name != null)
				return false;
		} else if (!staff_name.equals(other.staff_name))
			return false;
		if (staff_sex == null) {
			if (other.staff_sex != null)
				return false;
		} else if (!staff_sex.equals(other.staff_sex))
			return false;
		if (staff_tele == null) {
			if (other.staff_tele != null)
				return false;
		} else if (!staff_tele.equals(other.staff_tele))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Staff [staff_id=" + staff_id + ", staff_name=" + staff_name + ", staff_age=" + staff_age
				+ ", staff_sex=" + staff_sex + ", staff_tele=" + staff_tele + "]";
	}
	
	
}
