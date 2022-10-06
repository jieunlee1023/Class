package ch17;

public class MainTest1 {

	public static void main(String[] args) {
		
		Airpot airpot1 = new Airpot();
		TeddyBear bear1 = new TeddyBear();
		TeddyBear bear2 = new TeddyBear();
		
		Product[] products = new Product[3];
		products[0] = airpot1;
		products[1] = bear1;
		products[2] = bear1;
		
		ToyMachine machine1 = new ToyMachine();
		machine1.setProducts(products); //상품을 밀어 넣다
		
		// 실행 랜덤 클래스, 스캐너 이용해서..
		
		//count = 2 
		Product[] gift = machine1.getProduct(3);
		for (int i = 0; i < gift.length; i++) {
			gift[i].showInfo();
		}
		
		
	}
}
