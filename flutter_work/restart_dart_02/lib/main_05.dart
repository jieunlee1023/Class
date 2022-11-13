
void main () {
  // Future는 내부적으로 상태값을 가진다
  // 1. 미완료 상태 (Uncompleted)
   // 2. 완료 상태 (Complete)
  // 2-1. data -> 정상적으로 작업을 수행 결과까지 넘겨 받고 완료
  // 2-2. error -> 작업중에 문제 발생시 error를 반환 후 완료

  userFutureType(); //-> 현재 미완료 상태
  userFutureType().then((value) => null,
      onError: (error) => {print('잘못된 요청')} ); //-> 완료 상태에서 정보를 받는 then

}

// 데이터 넘겨보자
Future<String> userFutureType (){
  var _mFuture = Future.delayed(Duration(seconds: 2), () => "홍길동");
  // var _mFuture = Future(() => "수행결과 넘기기");
  return _mFuture;
}