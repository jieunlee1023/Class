package interfaces2;

import java.util.Iterator;
import java.util.Random;

public class MainTest {

	public static void main(String[] args) {
		
		Random random;
		
		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		ToyRobot toyRobot2 = new ToyRobot();
		
		televison.turnOn();
		televison.turnOff();
		System.out.println("---------------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("---------------");
		toyRobot.turnOn();
		toyRobot.turnOff();
		
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = televison;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = toyRobot;
		remoteControllers[3] = toyRobot2;
		
		// index를 활용한 for문
		// 좀 더 간소화 된 문법 (for-each)
		//: 중간에 멈추는 것은 조금 불편.. 처음부터 끝까지 뭔가를 뿌려야할때~
		for (RemoteController a : remoteControllers) {
			a.turnOn();
			a.turnOff();
			System.out.println("-----------------------");
		}
		
		//문제 1 for - index를 사용해서 전원을 전부 꺼주세요.
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOff();
		}
		
		// 문제2 배열을 활용해서 toy에 name 값을 화면에 출력하시오.
	
		for (int i = 0; i < remoteControllers.length; i++) {
			//만약 주소값 타입 ToyRobot 이라면
			if(remoteControllers[i] instanceof ToyRobot) {
				System.out.println(((ToyRobot)remoteControllers[i]).name);
			}
		}
		
		for (RemoteController remoteController : remoteControllers) {
			if (remoteController instanceof ToyRobot) {
				System.out.println(((ToyRobot)remoteController).name);
				
			}
		}
//		 인터페이스
//		 띠소리가 나는 기능을 추가해주세요
//		 단 냉장고는 띵띵띵 소리나게
//		 장난감 로봇을 뚜뚜뚜~ 소리나게
		SoundEffect[] soundEffects = new SoundEffect[2];
		soundEffects[0] = refrigerator;
		soundEffects[1] = toyRobot;
		
		for (SoundEffect i : soundEffects) {
			i.soundOn();
		}
		
	}
}
