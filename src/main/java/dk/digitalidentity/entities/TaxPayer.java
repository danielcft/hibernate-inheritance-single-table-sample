package dk.digitalidentity.entities;

import javax.persistence.Entity;


@Entity
public class TaxPayer extends Person {
	private long taxNumber;

	public long getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(long taxNumber) {
		this.taxNumber = taxNumber;
	}

	@Override
	public String toString() {
		return "TaxPayer [taxNumber=" + taxNumber + ", id=" + getId() + ", FirstName=" + getFirstName() + ", LastName=" + getLastName() +"]";
	}
}
