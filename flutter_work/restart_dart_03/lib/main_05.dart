
import 'dart:async';

/// asBroadcastStream 활용
void main () {

  final controller = StreamController();
  final stream = controller.stream.asBroadcastStream();

  // 구독자 1 - 전체 이벤트를 받는 구독자
  stream.listen((event) => print("기다리다 지쳐 넘어 온 너 : $event"));
  // 구독자 2 - 홀수만 받는 구독자 (리스너)
  stream.where((event) => (event%2 == 0)).listen((event) => print("2번째 구독자 : $event"));
  // 구독자 3 - 짝수만 받는 구독자(리스너)
  stream.where((event) => (event%2 == 1)).listen((event) => print("3번째 구독자 : $event"));

  controller.add(1);
   controller.add(2);

  print("main end 비동기 확인");

}