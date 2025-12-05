package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.NonPerishableProduct;
import com.demo.beans.NonPerishableProduct1;
import com.demo.beans.NonPerishableProduct2;
import com.demo.beans.NonPerishableProduct3;
import com.demo.beans.PerishableProduct;
import com.demo.beans.PerishableProduct1;
import com.demo.beans.PerishableProduct2;
import com.demo.beans.PerishableProduct3;
import com.demo.beans.Product1;
import com.demo.beans.Product2;
import com.demo.beans.Product3;
import com.demo.beans.Products;
import com.demo.dao.InheritanceDao;
import com.demo.dao.InheritanceDaoImpl;

public class InheritanceServicesImpl implements InheritanceServices {
	private InheritanceDao idao;

	public InheritanceServicesImpl() {
		idao = new InheritanceDaoImpl();
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public boolean showSingleType() {
		Products p1 = null;
		Products p2 = null;

		// Perishable Product
		System.out.println("Enter details for Perishable Product:");
		System.out.print("Enter Product id : ");
		int pid1 = sc.nextInt();
		System.out.print("Enter Product name : ");
		String pname1 = sc.next();
		System.out.print("Enter Product Quantity : ");
		int pqty1 = sc.nextInt();
		System.out.print("Enter Product Price : ");
		double price1 = sc.nextDouble();
		System.out.print("Enter Product Manufacturing Date (dd/mm/yyyy) : ");
		String pmdt1 = sc.next();
		LocalDate pmldt1 = LocalDate.parse(pmdt1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Enter Product Expiry Date (dd/mm/yyyy) : ");
		String pedt = sc.next();
		LocalDate peldt = LocalDate.parse(pedt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		p1 = new PerishableProduct(pid1, pname1, pqty1, price1, pmldt1, peldt);

		// Non-Perishable Product
		System.out.println("\nEnter details for Non-Perishable Product:");
		System.out.print("Enter Product id : ");
		int pid2 = sc.nextInt();
		System.out.print("Enter Product name : ");
		String pname2 = sc.next();
		System.out.print("Enter Product Quantity : ");
		int pqty2 = sc.nextInt();
		System.out.print("Enter Product Price : ");
		double price2 = sc.nextDouble();
		System.out.print("Enter Product Manufacturing Date (dd/mm/yyyy) : ");
		String pmdt2 = sc.next();
		LocalDate pmldt2 = LocalDate.parse(pmdt2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Enter Product Expiry Date (dd/mm/yyyy) : ");
		String npedt = sc.next();
		LocalDate npeldt = LocalDate.parse(npedt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		p2 = new NonPerishableProduct(pid2, pname2, pqty2, price2, pmldt2, npeldt);

		return idao.showSingleType(p1, p2);
	}

	@Override
	public boolean showJoinType() {
		Product1 p1 = null;
		Product1 p2 = null;

		// Perishable Product
		System.out.println("Enter details for Perishable Product:");
		System.out.print("Enter Product id : ");
		int pid1 = sc.nextInt();
		System.out.print("Enter Product name : ");
		String pname1 = sc.next();
		System.out.print("Enter Product Quantity : ");
		int pqty1 = sc.nextInt();
		System.out.print("Enter Product Price : ");
		double price1 = sc.nextDouble();
		System.out.print("Enter Product Manufacturing Date (dd/mm/yyyy) : ");
		String pmdt1 = sc.next();
		LocalDate pmldt1 = LocalDate.parse(pmdt1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Enter Product Expiry Date (dd/mm/yyyy) : ");
		String pedt = sc.next();
		LocalDate peldt = LocalDate.parse(pedt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		p1 = new PerishableProduct1(pid1, pname1, pqty1, price1, pmldt1, peldt);

		// Non-Perishable Product
		System.out.println("\nEnter details for Non-Perishable Product:");
		System.out.print("Enter Product id : ");
		int pid2 = sc.nextInt();
		System.out.print("Enter Product name : ");
		String pname2 = sc.next();
		System.out.print("Enter Product Quantity : ");
		int pqty2 = sc.nextInt();
		System.out.print("Enter Product Price : ");
		double price2 = sc.nextDouble();
		System.out.print("Enter Product Manufacturing Date (dd/mm/yyyy) : ");
		String pmdt2 = sc.next();
		LocalDate pmldt2 = LocalDate.parse(pmdt2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Enter Product Expiry Date (dd/mm/yyyy) : ");
		String npedt = sc.next();
		LocalDate npeldt = LocalDate.parse(npedt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		p2 = new NonPerishableProduct1(pid2, pname2, pqty2, price2, pmldt2, npeldt);

		return idao.showJoinType(p1, p2);
	}

	@Override
	public boolean showMappedBySuperClassType() {
		Product3 p1 = null;
		Product3 p2 = null;

		// Perishable Product
		System.out.println("Enter details for Perishable Product:");
		System.out.print("Enter Product id : ");
		int pid1 = sc.nextInt();
		System.out.print("Enter Product name : ");
		String pname1 = sc.next();
		System.out.print("Enter Product Quantity : ");
		int pqty1 = sc.nextInt();
		System.out.print("Enter Product Price : ");
		double price1 = sc.nextDouble();
		System.out.print("Enter Product Manufacturing Date (dd/mm/yyyy) : ");
		String pmdt1 = sc.next();
		LocalDate pmldt1 = LocalDate.parse(pmdt1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Enter Product Expiry Date (dd/mm/yyyy) : ");
		String pedt = sc.next();
		LocalDate peldt = LocalDate.parse(pedt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		p1 = new PerishableProduct3(pid1, pname1, pqty1, price1, pmldt1, peldt);

		// Non-Perishable Product
		System.out.println("\nEnter details for Non-Perishable Product:");
		System.out.print("Enter Product id : ");
		int pid2 = sc.nextInt();
		System.out.print("Enter Product name : ");
		String pname2 = sc.next();
		System.out.print("Enter Product Quantity : ");
		int pqty2 = sc.nextInt();
		System.out.print("Enter Product Price : ");
		double price2 = sc.nextDouble();
		System.out.print("Enter Product Manufacturing Date (dd/mm/yyyy) : ");
		String pmdt2 = sc.next();
		LocalDate pmldt2 = LocalDate.parse(pmdt2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Enter Product Expiry Date (dd/mm/yyyy) : ");
		String npedt = sc.next();
		LocalDate npeldt = LocalDate.parse(npedt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		p2 = new NonPerishableProduct3(pid2, pname2, pqty2, price2, pmldt2, npeldt);

		return idao.showMappedBySuperClassType(p1, p2);
	}

	@Override
	public boolean showTableType() {
		Product2 p1 = null;
		Product2 p2 = null;

		// Perishable Product
		System.out.println("Enter details for Perishable Product:");
		System.out.print("Enter Product id : ");
		int pid1 = sc.nextInt();
		System.out.print("Enter Product name : ");
		String pname1 = sc.next();
		System.out.print("Enter Product Quantity : ");
		int pqty1 = sc.nextInt();
		System.out.print("Enter Product Price : ");
		double price1 = sc.nextDouble();
		System.out.print("Enter Product Manufacturing Date (dd/mm/yyyy) : ");
		String pmdt1 = sc.next();
		LocalDate pmldt1 = LocalDate.parse(pmdt1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Enter Product Expiry Date (dd/mm/yyyy) : ");
		String pedt = sc.next();
		LocalDate peldt = LocalDate.parse(pedt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		p1 = new PerishableProduct2(pid1, pname1, pqty1, price1, pmldt1, peldt);

		// Non-Perishable Product
		System.out.println("\nEnter details for Non-Perishable Product:");
		System.out.print("Enter Product id : ");
		int pid2 = sc.nextInt();
		System.out.print("Enter Product name : ");
		String pname2 = sc.next();
		System.out.print("Enter Product Quantity : ");
		int pqty2 = sc.nextInt();
		System.out.print("Enter Product Price : ");
		double price2 = sc.nextDouble();
		System.out.print("Enter Product Manufacturing Date (dd/mm/yyyy) : ");
		String pmdt2 = sc.next();
		LocalDate pmldt2 = LocalDate.parse(pmdt2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Enter Product Expiry Date (dd/mm/yyyy) : ");
		String npedt = sc.next();
		LocalDate npeldt = LocalDate.parse(npedt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		p2 = new NonPerishableProduct2(pid2, pname2, pqty2, price2, pmldt2, npeldt);

		return idao.showTableType(p1, p2);
	}

	@Override
	public boolean getMySessionFactoryClose() {

		return idao.getMySessionFactoryClose();
	}
}
