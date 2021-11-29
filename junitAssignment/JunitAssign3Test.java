package junitAssignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitAssign3Test {

	@Test
	void test() {
		JunitAssign3 ob= new JunitAssign3(15000);
		assertThrows(InsufficientFundsException.class, () -> ob.withdraw(20000));
	}

}
