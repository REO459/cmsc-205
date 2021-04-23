package edu.ben.labs.lab5;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

public class CargoLoaderTest {
	Airplane temp = new Airplane(5, 276, 506, 800);

	@Test
	public void getAirCraftType() {
		int expected = 5;
		int actual = temp.getAircraftType();
		assertEquals(expected, actual);
	}

	@Test
	public void getFlightNumber() {
		int expected = 276;
		int actual = temp.getFlightNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void getCargoCapacity() {
		int expected = 506;
		int actual = temp.getMaximumCapacity();
		assertEquals(expected, actual);
	}

	@Test
	public void getCargoWeight() {
		int expected = 800;
		int actual = temp.getMaximumWeight();
		assertEquals(expected, actual);
	}

	@Test
	public void putCargo() {
		Cargo cargo1 = new Cargo(2548, 100, 1205, 150);
		Cargo cargo2 = new Cargo(415253, 220, 5236, 200);
		Cargo cargo3 = new Cargo(45215, 320, 4521, 400);
		Cargo cargo4 = new Cargo(754415, 152, 521, 125);
		temp.putCargo(cargo1);
		temp.putCargo(cargo2);
		temp.putCargo(cargo3);
		temp.putCargo(cargo4);

		Cargo expected = cargo3;
		Cargo actual = (Cargo) temp.getCargoInPlane().peek();
		assertEquals(expected, actual);
	}

	@Test
	public void fileTest() throws FileNotFoundException {
		CargoLoader.loadCargo(new File("aircraftLog.log"), new File(
				"cargoLog.log"));
	}

	@Test
	public void nonNumericTest() {
		String s = "$234";
		int expected = 234;
		int actual = CargoLoader.nonNumeric(s);
		assertEquals(expected, actual);
	}

}
