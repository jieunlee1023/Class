class Dog {
  String name = 'Toto';
  int age = 13;
  String color = 'white';
  int thirsty = 100;

  void drinkWater(Water w) {
    w.drink();
    thirsty = thirsty - 50;
  }
}

class Water {
  double liter = 2.0; // 물 2리터

  void drink() {
    liter = liter - 0.5;
  }
}

void main() {
  Dog d1 = new Dog(); // 객체 생성 (메모리 로드)
  Water water1 = Water(); // 객체 생성 (메모리 로드)

  print(d1.name);
  print(d1.age);
  print(d1.color);
  print(d1.thirsty);
  // d1.thirsty = 50; // 객체 지향에서는 마법같은 일임
  d1.drinkWater(water1);
  print(d1.thirsty);
  print(water1.liter);

  // 다트에서 변수와 함수명을 정의할 때 카멜표기법(낙타표기법)을 사용합니다.
  // Dart 파일을 정의할 때 언더스코어 방식 (스네이크케이스) 방식을 사용합니다.
  // Dart에서 클래스 명을 정의할 때 파스칼 표기법을 사용합니다. (class명 대문자) --> class MyNum();



}
