package jjbuy;

import java.util.ArrayList;

public class Buyer {
	
	int total = 0;
	int money = 10000000;
	int bonusPoint = 0;
	ArrayList list = new ArrayList();
	
	Buyer(){}
	Buyer(int money, int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	void myInfo() {
		System.out.printf("[ 보유금액 : %d ]\n",money);
		System.out.printf("[ 보유포인트 : %d ]\n",bonusPoint);
	}
	
	void buy(Product p) {
		list.add(p);
		money -= p.price;
		bonusPoint += p.bonusPoint;
		total += p.price;
	}
	
	void cartInfo() {
		System.out.print("구매목록 : ");
		for(int i=0;i<list.size();i++) {
			System.out.printf("%s ",((Product)list.get(i)).name);
		}
		System.out.println();
		System.out.printf("구매개수 : %d개 \n",list.size());
		System.out.printf("총 구매금액 : %,d원 \n",total);
	}

}
