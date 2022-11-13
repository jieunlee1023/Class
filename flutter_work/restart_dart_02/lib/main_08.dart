// 가상서버라고 가정 해본다
Future<String> vmServer(int id) async{ // 명시해도 되고 안해도 됨 할거면 Future<String>
  // var _fServerData;
  // if (id == 1){
  //   _fServerData = await Future.delayed(const Duration(seconds: 2), () => "홍길동");
  // }else{
  //   _fServerData = await Future.delayed(const Duration(seconds: 2), () => "티모");
  // }

  // var _fServerData = Future.delayed(const Duration(seconds: 2), () => "홍길동");
  // Future<String> -- > 안에 홍길동이 들어가있다.
  print("서버실행");
  return await Future.delayed(const Duration(seconds: 2), () => "홍길동");
}
void main(){

  // fetchData1();
  // fetchData2();
  fetchData3();
  print("메인에서 나는 놀지요--------------------------------------");
}

fetchData1() async{
  print("start");
  var _data = await Future.delayed(Duration(seconds: 2), () => print("비동기를 동기로"));
  print("end");
  // return _data;
}


fetchData2() {
  print("start2");
  var _data = Future.delayed(Duration(seconds: 2), () => print("비동기를 동기로2"));
  print("end2");
  // return _data;
}

//async 와 await << 기다려 ~ (개한테하듯)
fetchData3() async{
  print("start");
  // 서버에서 데이터를 전달 받을 때 까지 기다릴 거야!!
  var _data = await Future.delayed(Duration(seconds: 2), () => "홍길동");

  print("전달 받은 값 : $_data");
  // return _data;

}