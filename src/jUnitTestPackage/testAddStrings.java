package jUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;

public class testAddStrings {


	@Test
	public void test() {
		jUnitFunctions Junit = new jUnitFunctions();
		String a = "Swaraj";
		String b = "Bachu";
		String c = "SwarajBachu";
		String result = Junit.addString(a,b);
		//fail("Not yet implemented");
		assertEquals (c,result);
	}

}
