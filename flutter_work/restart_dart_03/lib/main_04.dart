
import 'dart:async';

/// asBroadcastStream
void main () {

  final controller = StreamController();
  //final stream = controller.stream;
  // 기본적으로 스트림 리스닝은 한번만 할 수 있다.
  // = 구독자를 한명만 가질 수 있다.

  // 그러면 여러번 리스너를 만들 수는 없을까 ? ?
  // 그 해답은 ? ? --> asBroadcastStream
  final stream = controller.stream.asBroadcastStream(); // 마치 전체 방송!

  // 구독자 1
  stream.listen((event) => print("기다리다 지쳐 넘어 온 너 : $event"));
  controller.add("빅게임");
  controller.add(1);
  controller.add(2);

  // 구독자 2
  stream.listen((event) => print("2번째 구독자 : $event"));

  // 구독자 3
  stream.listen((event) => print("3번째 구독자 : $event"));

  controller.add("3333333333");
  print("main end 비동기 확인");


}