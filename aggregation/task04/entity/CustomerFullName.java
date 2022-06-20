package by.mikem.jonline.module4.aggregation.task04.entity;

public class CustomerFullName {
	private String firstName;
	private String surmame;
	private String patronymic;

	public CustomerFullName() {
	}

	public CustomerFullName(String firstName, String surmame, String patronymic) {
		this.firstName = firstName;
		this.surmame = surmame;
		this.patronymic = patronymic;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurmame() {
		return surmame;
	}

	public void setSurmame(String surmame) {
		this.surmame = surmame;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surmame == null) ? 0 : surmame.hashCode());
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
		CustomerFullName other = (CustomerFullName) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surmame == null) {
			if (other.surmame != null)
				return false;
		} else if (!surmame.equals(other.surmame))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("CustomerFullName [firstName=%s, surmame=%s, patronymic=%s]", firstName, surmame,
				patronymic);
	}
}
