import 'dart:async';

void main() async {
  //Future 와 다르게 Stream 의 가장 큰 특징은
  // Future 에서는 기다렸다가 하나의 값을 받을 수 있다.
  // ★ Stream 은 주기적으로 여러번 계속 무언가를 받을 수 있다.

  // 스트림 위에 확장 개념으로 자신이 가지고 있는 스트림들을 다양하게 통제 할 수 있다.
  // 구독자, 관찰자 패턴의 일부
  // 함수 한번 호출로 여러번 값을 전달 받았으면 좋겠다..! 라는 생각으로 개발 되었다.
  var controllerStream1 = StreamController(
    onPause: () => print("1. onPaused"),
    onResume: () => print("2. onResumed"),
    onCancel: () => print("3. onCancel"),
    onListen: () => print("4. onListen"),
  );

  //StreamController ⊃ Stream ⊃ listen
  // listen이 있어서 상태값 onListen (listen이 되었다)이 호출된다.
  controllerStream1.stream.listen(
    (event) => print("event : $event"),
    onDone: () => print("Done"), //모든 처리가 다 끝났다는 의미
    onError: (error) => print("error ----> $error"),
  );

  // 스트림에 구독자가 있는지 확인하려면 hasListener를 사용
  // 즉, 리스너를 만들어 놓았는가 확인하는 코드
  var hasListener = controllerStream1.hasListener; //true, false 리턴
  print("hasListner : $hasListener");

  // 스트림에 데이터 이벤트를 보내려면, add 또는 addStream 을 사용하면 된다.
  controllerStream1.add(1023);
  controllerStream1.add(1024);
  controllerStream1.add("안녕 스트림!");
  //add() -> dynamic 이기 때문에 무엇이든 들어올 수 있다.


  final myStream =
      Stream<int>.periodic(Duration(milliseconds: 500), (count) => count)
          .take(10);
  //StreamController는 여러개의 스트림을 관리할 수 있다.
  await controllerStream1.addStream(myStream);

  // 스트림에 오류 이벤트를 보내려면 addError 또는 addStream을 사용하면 된다.
  controllerStream1.addError(Exception("Issue 404"));
  // addError() -> Object 타입이 들어와야한다!

  // 스트림이 닫혔는지 확인하려면 isClosed를 사용할 수 있다.
  var isClosed = controllerStream1.isClosed;
  print(isClosed);
  // 스트림을 닫으려면 close를 사용하면 된다.
  controllerStream1.close();
  print("---------------------------------");
  print(controllerStream1.isClosed);
  print("---------------------------------");

  print(">>>>>main end<<<<<"); // 비동기 확인 코드
}
