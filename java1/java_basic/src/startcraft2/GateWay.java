package startcraft2;

public class GateWay {

	static int zealotTotalCount;
	static int dragoonTotalCount;

	private String name;

	public GateWay() {
		this.name = "게이트웨이";
		zealotTotalCount = 0;
	}

	// 질럿 생성하기
//	public String createZealot() {} 
	public Zealot createZealot() {
		return new Zealot("질럿");
	}

	public Zealot createZealot(int count) {
		while (count > 0) {
			System.out.println("질럿을 생산합니다.");
			for (int i = 0; i < 10; i++) {
				System.out.print("-");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			count--;
			System.out.println();
			zealotTotalCount++;
		}
		return new Zealot("질럿" + zealotTotalCount);
	}

	// 드라군 생성하기
	public Dragoon createDragoon() {
		System.out.println("드라군을 생산합니다.");
		for (int i = 0; i < 10; i++) {
			System.out.print("-");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		dragoonTotalCount++;
		return new Dragoon("드라군" + dragoonTotalCount);

	}

}
