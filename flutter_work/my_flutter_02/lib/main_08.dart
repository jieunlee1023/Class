void main() {
  // 논리 연산자 = true , false

  // 부정
  print("!true ---> ${!true}");

  // && (논리곱) || (논리합)
  print("true && false --> ${true && false}");
  print("true || false --> ${true || false}");

  // 조건문
  int point = 90;
  if (point >= 90) {
    print("A학점");
  } else if (point >= 80) {
    print("B학점");
  } else if (point >= 70) {
    print("C학점");
  }

  // 삼항 연산자
  // 조건식  ? (참이면 실행) : (거짓이면 실행)
  int level = 5;
  print (level >= 10 ? "용사" : "시민");

  // null 대체 연산자
  // 변수의 값이 null 이면 ?? 뒤의 값이 출력이 되고,
  // null이 아니면 변수에 값이 출력 됩니다.

  String? username = null;
  print(username);
  print(username ?? "이름 없음");
  // 값이 대입된 상태는 아님 (아래처럼 대입연산자를 이용해서 대입해주면 됨)
  var str2 = username ?? "이름 없음";
  print (str2);


  int? number = null;
  print (number);
  print (number ?? 010);
  print (number ?? "010");


}