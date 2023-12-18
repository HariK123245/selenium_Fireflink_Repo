package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void remove() {
		Reporter.log("Remove class executed....",true);
	}
	@Test
	public void add() {
		Reporter.log("Add class executed....",true);
	}
}
