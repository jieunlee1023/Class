 import 'dart:core';
// import 'dart:async';

// Stream
void main (){

  // java stream --> 비동기를 지원하지 않는다
  // dart stream --> java stream + 비동기를 지원한다.

  // dart Stream 클래스는 패키지 dart:core 에서 사용 가능
  //                              패키지 dart:async 패키지 사용 가능

  // import 'dart:async';  --> 이 패키지는 더 많은 기능을 가지고 있다.

  // print("실행 1");
  // // Stream을 생성하는 방법 1. value 사용
  // Stream stream1 = Stream.value(100);
  // print("실행 2");
  // //listen -> than과 비슷한 기능
  // stream1.listen((v) {print("여기로 넘어온 값 $v");});
  //
  // // ▼ cpu 속도 처리가 더 빠르기 때문에 listen보다 먼저 출력이 된다
  // print("------------------------------");
  // print('실행 3');

  // print("=============================================");
  // Future 에서는 한번 이벤트가 넘어오면 종료 !
  // 새로운 스트림 생성
  // 한꺼번에 통으로 넘어온다.
  Stream.value([1,2,3,4,5,6,7]).forEach((e) { print("여기는 : $e"); });

  print("restart 1");
  // Stream을 생성하는 법 2.periodic 사용 -> 주기적으로 받고 싶을 때!
  // Dart에서 Stream은 한꺼번에 넘어오지만, periodic을 사용하면 주기적으로 받아 올 수 있다.
  // take() : 받아 올 횟수
  var stream = Stream.periodic(Duration(microseconds: 300), (x) => (x + 1) ).take(10);
  stream.listen((event) {print("이벤트가 넘어온다! $event");});
  print("restart 2");
  print("-----------------------------");
}