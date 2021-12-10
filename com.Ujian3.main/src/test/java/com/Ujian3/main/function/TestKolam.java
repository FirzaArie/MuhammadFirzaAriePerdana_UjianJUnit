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
public class TestKolam {
	Kolam kolam;
	
	@Before
	public void setUp() throws Exception {
	kolam = new Kolam();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/KolamLuas.csv")
	public void testLuasKolam(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, kolam.LuasKolam(panjang, lebar, tinggi), 0.0);
		
	}
	@Test
	@FileParameters("src/test/resources/KolamVolume.csv")
	public void testVolumeKolam(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, kolam.VolumeKolam(panjang, lebar, tinggi),0.0);
		
	}

}
