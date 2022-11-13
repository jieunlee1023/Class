
import 'dart:async';

/// asBroadcastStream
/// 리스너는 기본적으로 하나만 가질 수 있다
void main () {

  final controller = StreamController();
  final stream = controller.stream;
  // 기본적으로 스트림 리스닝은 한번만 할 수 있다.
  // = 구독자를 한명만 가질 수 있다.

  stream.listen((event) => print("메인 리스너 : $event"));
  controller.add("빅게임");
  controller.add(1);
  controller.add(2);

  // 두번째 리스너(구독자) 만들어 보기 --> 오류! 리스너는 하나만 가질 수 있다!
  // stream.listen((event) => print("2번째 리스너 : $event"));
  // print("main end 비동기 확인")


}