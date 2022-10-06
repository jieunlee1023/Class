package startcraft2;

public class GateWayMainTest3 {

	public static void main(String[] args) {
		int[] intArr = new int[3];
		
		Zealot[] zealots = new Zealot[30];
		System.out.println(zealots.length); //배열의 크기를 반환
		for(int i = 0; i < zealots.length; i++) {
			zealots[i] = new Zealot("질럿" + (i+1));
		}
		zealots[0] = new Zealot("질럿1");
		zealots[1] = new Zealot("질럿2");
		zealots[2] = new Zealot("질럿3");
		
		for (int i =0 ; i<zealots.length; i++) {
			System.out.println(zealots[i].getName());
			System.out.println(zealots[i].getHp());
			System.out.println(zealots[i].getPower());
			System.out.println("----------------------------");
		}
		
		GateWay gateWay1 = new GateWay();
		// 5번 질럿 생산하기
		Zealot[] zealotArr = new Zealot[5];
		// i = 1;
		// i = 2;
		// i = 3;
		// i = 4;
		// i = 5;
		for (int i = 1; i < zealotArr.length; i++) {
			zealotArr[i] = gateWay1.createZealot();
		}
		System.out.println(zealotArr[0]);
	}

}
