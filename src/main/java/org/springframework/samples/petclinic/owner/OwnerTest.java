package org.springframework.samples.petclinic.owner;

import org.junit.Test;

public class OwnerTest {
	@Test
	public void testOwner() {
		Owner owner = new Owner();
		owner.setAddress("Jalahalli");
		owner.setCity("Bangalore");
		owner.setFirstName("Soumya");
		owner.setId(3);


	}
}
