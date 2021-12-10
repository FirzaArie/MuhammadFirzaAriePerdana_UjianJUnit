package com.Ujian3.main.function;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junitparams.FileParameters;
import static junitparams.JUnitParamsRunner.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestSuhu {
Suhu suhu;
	@Before
	public void setUp() throws Exception {
	suhu = new Suhu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/Suhu.csv")
	public void testFtoC(double farenheit, double hasil) {
		assertEquals(hasil, suhu.FtoC(farenheit),0.000001);
		
	}


}
