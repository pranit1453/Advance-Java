package com.demo.services;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Carts;
import com.demo.beans.Items;
import com.demo.dao.CartDao;
import com.demo.dao.CartDaoImpl;

public class CartServiceImpl implements CartService {
	private CartDao cdao;

	public CartServiceImpl() {
		cdao = new CartDaoImpl();
	}

	@Override
	public boolean showManyToMany() {
		Set<Items> iset = new HashSet<>();
		Set<Carts> cset = new HashSet<>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter amount of items to add : ");
			int data = sc.nextInt();
			sc.nextLine();

			for (int a = 0; a < data; a++) {
				System.out.println("---Enter Item Details for " + (a + 1) + " ---");
				System.out.print("Enter item id : ");
				int iid = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter item name : ");
				String iname = sc.next();

				System.out.print("Enter item Quantity : ");
				int iqty = sc.nextInt();
				sc.nextLine();

				Items i = new Items(iid, iname, iqty);
				iset.add(i);

				System.out.println("-------------------------------------------------");

				System.out.println("---Enter Cart Details for " + (a + 1) + " ---");
				System.out.print("Enter cart id : ");
				int cid = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter cart price : ");
				double cprice = sc.nextDouble();

				System.out.print("Enter cart qty : ");
				int cqty = sc.nextInt();
				sc.nextLine();

				Carts c = new Carts(cid, cprice, cqty, iset);
				cset.add(c);

				Set<Carts> cartsForItem = new HashSet<>();
				/*
				 * Each Item knows which Carts it belongs to.
				 * 
				 * Each Cart knows which Items it contains.
				 */
				cartsForItem.add(c);
				i.setCset(cartsForItem);
			}

		}

		return cdao.showManyToMany(iset, cset);
	}

	@Override
	public Set<Carts> getData() {
		Set<Integer> cids = new HashSet<>();
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 2; i++) {
				System.out.print("Enter id for cart : ");
				int id = sc.nextInt();
				cids.add(id);
			}
		}

		return cdao.getData(cids);
	}
}
