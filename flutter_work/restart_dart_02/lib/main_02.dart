
void main () async {

  //미래타입 함수는 비동기 방식이기 때문에, 무조건 Future 타입으로 받아야 한다.
  //실행 시키는 스택에서 동기 방식으로 코드를 진행 했다면, 먼저 값을 확인 할 수 없다.
  // 그냥 Future 타입이라고만 확인 된다.


  var result = await testcode();
  print(result);

}

Future<String> testcode() async {

  print("start");
  // 서버 데이터를 요청하고 2초뒤에 받았다!
  var _futureValue = await Future(() {
    for (var i = 0; i<3; i++){
      print("---> i : $i");
    }
    return" i 연산 완료 !";
  });
  print("end");

  return _futureValue;
}

