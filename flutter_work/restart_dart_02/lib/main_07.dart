//오류를 찾아보시오~

void main() async{

  Future<String> fData = Future.value("홍길동");
  print(fData);
  // String name = vmServer(1); // 안됨!! 미래 타입으로 받아야 한다 !

  Future<String> name = vmServer(2); // 1초뒤에 값이 담김 ( 이벤트루프에 담아놓고 우선 다른놈부터 시작됨 )
  name.then((value) => print(value));    //여기로 들어옴   (우선 주석)

  // name.then((value) { // 람다는 한줄바께안대서 이걸루함  (이것도 우선주석 티모나와야함..)
  //   String data = "<<<<<<" +value + ">>>>>>";
  //   print(data);
  // });

  // String customResult = await name.then((value) => value).toString(); // 함수에 async 잇어야 await 가 됩니다
  // String temp = "$customResult, 100";
  // print(temp);
  // 홍길동, 100

  String result = await vmServer(1).then((value) => value).toString();
  print("$result : 100");
  print("메인함수 종료");


}
Future<String> vmServer(int id) async{
  print("서버실행");

  var _fServerData;
  if (id == 1){
    _fServerData = await Future.delayed(const Duration(seconds: 2), () => "홍길동");
  }else{
    _fServerData = await Future.delayed(const Duration(seconds: 2), () => "티모");
  }

  return await _fServerData;
}