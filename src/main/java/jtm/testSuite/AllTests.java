package jtm.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;


import jtm.activity03.ArrayTest;
import jtm.activity03.BlackKnightTest;
import jtm.activity03.RandomPersonTest;
import jtm.activity04.TrafficManagementTest;
import jtm.activity05.EncapsulationTests;
import jtm.activity06.InterfaceTests;
import jtm.activity07.AnimalTests;
import jtm.activity08.SimpleCalcTests;
import jtm.activity09.OrdersTests;
import jtm.activity10.StreamEditorTest;
import jtm.activity11.ArrayFillerManagerTest;
import jtm.activity13.DatabaseTest;
import jtm.extra01.GetOneTest;
import jtm.extra01.ZodiacTest;
import jtm.extra02.ArrayListMethodsTest;
import jtm.extra02.LetsRideTest;
import jtm.extra03.PracticalNumbersTest;
import jtm.extra05.XMLCarsTest;
import jtm.extra06.GenericsTest;
import jtm.extra06.HolidayTest;
import jtm.extra06.RegExTest;
import jtm.extra08.InvoiceManagerTest;
import jtm.extra09.BoardTest;
import jtm.extra09.CrocodileTest;
import jtm.extra09.GameTest;
import jtm.extra10.LogTest;
import jtm.extra11.PersonMatcherTests;

@RunWith(JtmSuite.class)
@SuiteClasses({

		// First week
		ArrayTest.class, // 3
		BlackKnightTest.class, // 3
		RandomPersonTest.class, // 3
		TrafficManagementTest.class, // 4
		EncapsulationTests.class, // 5

		InterfaceTests.class, // 6
		AnimalTests.class, // 7
		SimpleCalcTests.class, // 8
		OrdersTests.class, // 9
		StreamEditorTest.class, // 10

		// Second week

		ArrayFillerManagerTest.class, // 11
		DatabaseTest.class, // 13

		// extra activities
		GetOneTest.class, // 1
		ZodiacTest.class, // 1
		ArrayListMethodsTest.class, // 2
		LetsRideTest.class, // 2
		PracticalNumbersTest.class, // 3
		XMLCarsTest.class, // 5
		GenericsTest.class, // 6
		HolidayTest.class, // 6
		RegExTest.class, // 6
		InvoiceManagerTest.class, // 8
		CrocodileTest.class, // 9
		GameTest.class, // 9
		LogTest.class, // 10
		PersonMatcherTests.class, // 11

})
public class AllTests {

}
