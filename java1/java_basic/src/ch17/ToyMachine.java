package ch17;

// 사자인형, 곰인형, 권총, 에어팟... 
public class ToyMachine { //포함관계
	
	Product[] products;

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public Product[] getProduct(int count) {
		Product[] targetOk = new Product[count];
		// ToyMachine 안에 있는 Product 상품들을 랜덤으로 가지고 와서
		// targetOk에 담고 리턴하면 된다.
		
		for (int i = 0; i < targetOk.length; i++) {
			System.out.println();
			targetOk[i] = products[i];
			products[i] = null;
		}
		
		//실제 products[] 녀석들을 null 처리 해주면 된다.
		
		return targetOk;
	}
	
	
//	//곰인형 뽑기
//	public TeddyBear pullBearDoll(String name) {
//		System.out.println(name + "이 뽑혔습니다.");
//		return new TeddyBear("곰인형");
//	}
//	
//	//사자인형 뽑기
//	public LionDoll pullLionDoll(String name) {
//		System.out.println(name + "이 뽑혔습니다.");
//		return new LionDoll("사자인형");
//	}
//	
//	
//	//장난감 총 뽑기
//	public Gun pullGun(String name) {
//		System.out.println(name + "이 뽑혔습니다.");
//		return new Gun("장난감 총");
//	}
//	
//	
//	//에어팟 뽑기
//	public Airpot pullAirpot(String name) {
//		System.out.println(name + "이 뽑혔습니다.");
//		return new Airpot("에어팟");
//	}
//	
//	public void showInfo() {
//		System.out.println("상품명 : " + name);
//	}

}
//객체 지향 패러다임으로 코드를 설계하고
// 동작을 구현시킬 수 있는 코딩능력을 테스트!
