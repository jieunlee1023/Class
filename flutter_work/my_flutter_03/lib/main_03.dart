void main() {
  // 타입 비교 연산자
  // 자바의 instance of , Dart는 is , !is

  int _num1 = 10; // _ 은 private 을 뜻한다
  var _num2 = 100.0;
  var _str1 = "hello flutter";
  var _isOk = true;
  var _pi = 3.14;

  print("_num1 : ${_num1 is int}");
  print("_num2 : ${_num2 is double}");
  print("_isOk ; ${_isOk is bool}");

  print("_str1 : ${_str1 is !bool}");


}
