
void main(){
  // Mixin 은 여러 클래스 계층에서 클래스의 코드를 재사용하는 방법입니다.
  // Mixin 을 사용하게 되면 다중 상속 문제를 해결 할 수 있고, 컴퍼지션을 사용하지 않고,
  // 다른 클래스의 코드를 재사용 할 수 있습니다.

  BMW bmw = BMW();
  print(bmw.power);
  print(bmw.wheelName);

  Wheel2 car = new Wheel2();
  print(car.color);
}

class Engine{
  int power = 5000;
}

class Wheel{
  String wheelName = '4륜 구동 바퀴';
}

class BMW with Engine , Wheel {
}

class Wheel2 with MyCar {
  String wheelName = '4륜 구동 바퀴';
}

class MyCar {
  String color = 'black';
}