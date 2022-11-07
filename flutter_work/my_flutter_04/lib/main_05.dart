import 'package:my_flutter_04/student.dart';

void main() {
  //Dart 에서 new 키워드는 선택 사항입니다.
  //   // 함수
  //   // 특별한 목적의 작업ㅇ르 수행하기 위해 독립적으로 설계된 코드의 집합
  //   // 반복적인 프로그래밍을 피하고 코드를 재사용 할 수 있게 해준다.
  //   // 함수로 프로그래밍을 나누어 작성하면 모듈화가 되고 코드의 가독성이 좋아지며,
  //   // 문제가 발생했을 때 손쉽게 유지 보수할 수 있습니다.

  //모듈화란?
  //main이 포함되어 있어 실행 가능한 코드의 프로그램

  var student1 = new Student();
  student1.hello("반가워"); // main에서 모듈을 호출한다.

  var temp = f(100);
  print(temp);

  // 익명 함수와 람다식
  //함수에 이름이 없는게 익명 함수
//  (매개변수) {동작혹은 반환값};

  // magicBox(() {
  //   print("더하기");
  // });
  //
  // magicBox(() {
  //   print("나누기");
  // });

//함수를 매개변수로 전달할 수 있다.
// 변수에 익명 함수를 대입할 수도 있다. 이때  Function타입을 사용한다.

  Function add = (int n1, int n2) {
    print("********************");
    print(n1 + n2);
  };

  add(10, 10);

// 람다식
// 함수를 하나의 식으로 표현하는 것
// (매개변수) => 동작 혹은 반환값

//람다 표현식
  Function addOne = (n) => n + 1;
  print(addOne(10));

  Function addTwo = (n) {
    return n + 2;
  };
  print(addTwo(10));

// // 익명함수와 람다식의 가장 큰 차이는 return 키워드를 적지 않아도 값이 반환되지만
// // 익명함수는 값을 반환하려면 return 키워드를 꼭 적어야 한다.

}

// 함수의 형태
int f(int m) {
  return m;
}

//Dart에서는 함수를 매개변수로 전달 받을 때는Function 키워드를 사용한다.
// void magicBox(Function f) {
//   //함수를 호출하기 위해서는 () <--사용
//   print("----------------");
//   f();
//   print("----------------");
// }
