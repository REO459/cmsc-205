package edu.ben.sandbox.queues;

public class Main {
	
public static void main(String[] args) {
	methodA();
	methodB();
	methodC();
	}


public static void methodA() {
	int[] a = new int[15];
	a[0] = 6; 
	a[1] = 2;
	
	for (int i = 0; i < a.length; i++) {
		int j = 0;
		int num = 0;
		while (a[j] != 0) {
			num += a[j++];
		}
		a[i] = num;
	}
	for (int i : a) {
		System.out.print("[" + i + "] ");
	}
	System.out.println();
}

public static void methodB() {
	int[] a = new int[15];
	
	int num = 4;
	for (int i = a.length - 1; i > 0; i--) {
		a[i] = num * i;
	}
	for (int i : a) {
		System.out.print("[" + i + "] ");
	}
	System.out.println();
}

public static void methodC() {
	int[][] a = new int[15][15];
	for (int i = 0; i < a.length - 1; i++) {
		a[i][i + 1] = i * 3;
		}
	int loc = 4;
	for (int i = a.length - 1; i > 3; i--) {
		a[loc][i] = i * 3;
		loc++;
		}
	loc = 0;
	for (int i = 0; i < a.length; i++) {
		a[i][loc] = i + i;
		}
	for (int i = 0; i < a.length; i++) {
		a[loc][i] = i * i;
		}
	System.out.println("Array a: ");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print("[" + a[i][j] + "] ");
			}
		System.out.println();}
	}

}
