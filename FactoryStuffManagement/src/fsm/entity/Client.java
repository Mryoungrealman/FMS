package fsm.entity;

public class Client {
	private String cli_id;
	private String cli_name;
	
	public Client() {
		super();
	}

	public Client(String cli_id, String cli_name) {
		super();
		this.cli_id = cli_id;
		this.cli_name = cli_name;
	}

	public String getCli_id() {
		return cli_id;
	}

	public void setCli_id(String cli_id) {
		this.cli_id = cli_id;
	}

	public String getCli_name() {
		return cli_name;
	}

	public void setCli_name(String cli_name) {
		this.cli_name = cli_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cli_id == null) ? 0 : cli_id.hashCode());
		result = prime * result + ((cli_name == null) ? 0 : cli_name.hashCode());
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
		Client other = (Client) obj;
		if (cli_id == null) {
			if (other.cli_id != null)
				return false;
		} else if (!cli_id.equals(other.cli_id))
			return false;
		if (cli_name == null) {
			if (other.cli_name != null)
				return false;
		} else if (!cli_name.equals(other.cli_name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [cli_id=" + cli_id + ", cli_name=" + cli_name + "]";
	}
	
}
