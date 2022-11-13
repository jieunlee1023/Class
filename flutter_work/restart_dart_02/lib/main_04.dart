
void main () {

  print("start");
  Future futureDelay = sleepDuration(2);
  futureDelay.then((value) => print('작업완료됨!'));
  // 결과가 들어오면 then이 실행된다 (listen 처럼!)
  userFutureType().then((value) => print(value));
  print("end");

}

Future sleepDuration(var s){
  return Future.delayed(Duration(seconds: s));
}

// 데이터 넘겨보자
Future<String> userFutureType (){
  var _mFuture = Future.delayed(Duration(seconds: 2), () => "홍길동");
  // var _mFuture = Future(() => "수행결과 넘기기");
  return _mFuture;
}