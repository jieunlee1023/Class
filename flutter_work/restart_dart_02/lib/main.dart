void main() async {
  // 미래 타입 사용
  // Future - 미래에 받아 올 값
  Future<String> name = Future.value('텐코딩');
  // name.then((value) => print(value));
  Future<int> number = Future.value(10);
  Future<bool> isTrue = Future.value(true);

  print(name);

  addNum(10, 10);
  print("-------------------------");
  addNum(20, 20);
  print("-------------------------");
  // 비동기는 물리적으로 막는 것이 아니라 논리적으로 막아서 처리한다
  //1

  // student('이지은', 1023, 100, 'A+');
  // print("-------------------------------");
}

// 10 + 10;
// 20 + 20;

// void addNum(int n1, int n2)  {
//   print("계산중 : $n1 + $n2");
//
//   // 서버 데이터를 요청했다.
//    Future.delayed(Duration(seconds:3), () {
//     print("계산완료 : ${n1 + n2}");
//   },);
//
//   print("함수 실행 완료 !");
// }

// 필요에 의해서 비동기 방식의 흐름을 동기 방식으로 만드는 방법
// 함수 선언부와 구현부 사이에 async 를 넣어 주어야 한다.
// async  : 비동기 방식이야 ~
// await : 여기서 멈춰 ~
// 함께 await라는 키워드를 사용해야 한다.


void addNum(int n1, int n2) async {
  print("계산중 : $n1 + $n2");

  // 서버 데이터를 요청했다.
  await Future.delayed(
    Duration(seconds: 3),
    () {
      print("계산완료 : ${n1 + n2}");
    },
  );

  print("함수 실행 완료 !");
}

// 문제 1번. 비동기 방식 함수 만들어보기 및 사용
// 단 리턴은 void로 처리해주세요

// void student(String name, int classNum, int score, String grade) async {
//   print("$name 의 학번은 $classNum 입니다. 점수와 학점 확인 중. . .");
//
//   await Future.delayed(
//       Duration(seconds: 3), () => print("점수는 $score , 학점은 $grade 입니다"));
//
//   print("$name 정보 확인 완료 !");
// }
//
