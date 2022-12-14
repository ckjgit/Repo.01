package com.nt.beans;

import java.util.Date;
import java.util.Set;

public class ContactsInfo {
	private Set<Long> phoneNumbers;
	private Set<Date> dates;

	// generating constructor injection
	public ContactsInfo(Set<Long> phoneNumbers, Set<Date> dates) {
		System.out.println(phoneNumbers.getClass());
		this.phoneNumbers = phoneNumbers;
		this.dates = dates;
	}

	// generating to string method
	@Override
	public String toString() {
		return "ContactsInfo [phoneNumbers=" + phoneNumbers + ", dates=" + dates + "]";
	}

}
