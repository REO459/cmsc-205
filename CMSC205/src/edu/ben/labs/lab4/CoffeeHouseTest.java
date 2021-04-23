package edu.ben.labs.lab4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoffeeHouseTest {

	@Test
	public void testTakeOrder() {

		CoffeeHouse c = new CoffeeHouse();
		assertEquals(false, c.takeOrder(null));

		Coffee order1 = new Coffee("Coffee", Coffee.GRANDE, 2.00, 30);

		assertEquals(true, c.takeOrder(order1));

		Coffee emptyOrder = new Coffee("", 0, 0, 0);

		assertEquals(true, c.takeOrder(emptyOrder));

	}

	@Test
	public void testServeOrder() {

		CoffeeHouse c = new CoffeeHouse();
		Coffee order1 = new Coffee("Chocolate", Coffee.GRANDE, 2.00, 30);
		assertEquals(true, c.takeOrder(order1));

		assertEquals(order1, c.serveOrder());
	}

	@Test
	public void testGetPotentialProfit() {

		CoffeeHouse c = new CoffeeHouse();
		Coffee order1 = new Coffee("Chocolate", Coffee.GRANDE, 2.00, 30);
		Coffee order2 = new Coffee("Chocolate", Coffee.VENTI, 4.33, 30);
		Coffee order3 = new Coffee("Chocolate", Coffee.GRANDE, 2.16, 30);

		c.takeOrder(order1);
		c.takeOrder(order2);
		c.takeOrder(order3);

		double expected = 8.49;
		double actual = c.getPotentialRevenue();
		assertEquals(expected, actual, 0);

	}

	@Test
	public void testTimeToMakeCoffeeOrders() {
		CoffeeHouse c = new CoffeeHouse();
		Coffee order1 = new Coffee("Chocolate", Coffee.GRANDE, 2.00, 30);
		Coffee order2 = new Coffee("Mocha", Coffee.VENTI, 4.00, 30);
		Coffee order3 = new Coffee("Vanilla", Coffee.GRANDE, 2.00, 30);

		int expected = 0;
		int actual = c.timeToMakeCoffeeOrders();
		assertEquals(expected, actual);

		c.takeOrder(order1);
		c.takeOrder(order2);
		c.takeOrder(order3);

		int expected1 = 90;
		int actual1 = c.timeToMakeCoffeeOrders();
		assertEquals(expected1, actual1);
	}

	@Test
	public void testNumOfOrders() {

		CoffeeHouse c = new CoffeeHouse();
		Coffee order1 = new Coffee("Chocolate", Coffee.GRANDE, 2.00, 30);

		c.takeOrder(order1);

		int expected = 1;
		int actual = c.numOfOrders();
		assertEquals(expected, actual);

		int expected1 = 1;
		int actual1 = c.getNumOrders();
		assertEquals(expected1, actual1);
	}

	@Test
	public void testGetSizeCount() {

		CoffeeHouse c = new CoffeeHouse();
		Coffee order1 = new Coffee("Chocolate", Coffee.TALL, 2.00, 30);
		Coffee order2 = new Coffee("Chocolate", Coffee.TALL, 2.00, 30);
		Coffee order3 = new Coffee("Chocolate", Coffee.GRANDE, 2.00, 30);
		Coffee order4 = new Coffee("Chocolate", Coffee.VENTI, 2.00, 30);

		c.takeOrder(order1);
		c.takeOrder(order2);
		c.takeOrder(order3);
		c.takeOrder(order4);

		int[] array = c.getSizeCount();

		int expected = 2;
		int actual = array[0];
		assertEquals(expected, actual);

		int expected1 = 1;
		int actual1 = array[1];
		assertEquals(expected1, actual1);

		int expected2 = 1;
		int actual2 = array[2];
		assertEquals(expected2, actual2);
	}

	@Test
	public void testViewNextOrder() {

		CoffeeHouse c = new CoffeeHouse();
		Coffee order1 = new Coffee("Chocolate", Coffee.VENTI, 4.00, 30);
		Coffee order2 = new Coffee("Chocolate", Coffee.GRANDE, 2.00, 30);

		c.takeOrder(order2);
		c.takeOrder(order1);
		Coffee expected = order2;
		Coffee actual = c.viewNextOrder();
		assertEquals(expected, actual);

		c.serveOrder();
		c.serveOrder();
		Coffee expected1 = null;
		Coffee actual1 = c.viewNextOrder();
		assertEquals(expected1, actual1);
	}

	@Test
	public void testGetProfit() {

		CoffeeHouse c = new CoffeeHouse();
		Coffee order1 = new Coffee("Chocolate", Coffee.VENTI, 4.00, 30);
		Coffee order2 = new Coffee("Chocolate", Coffee.GRANDE, 2.00, 45);

		double expected = 0;
		double actual = c.getRevenue();
		assertEquals(expected, actual, 0);

		c.takeOrder(order1);
		c.takeOrder(order2);
		c.serveOrder();
		c.serveOrder();

		double expected1 = 6.0;
		double actual1 = c.getRevenue();
		assertEquals(expected1, actual1, 0);

	}
}
