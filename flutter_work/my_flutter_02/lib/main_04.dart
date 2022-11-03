
/// 변수를 사용할 때 명시적 타입
/// 타입 추론은 값이 들어 올 때, 타입을 추록하여 변수를 초기화 한다.
/// var, dynamic
void main() {
  int n1 = 1;
  double d1 = 10.1;
  bool b1 = true;
  String s1 = "이순신";

  // print('정수 : ' + n1);
  print ('정수 : $n1');
  print ('실수 : ${d1}');
  print ('부울 : $b1');
  print ("문자열 : $s1 반가워");
  print ('정수 $n1 + 10');
  print ('정수 ${n1 + 10} = ??');
  // 식을 더하기 위해서 중괄호 필요함

  print ('정수 : ${n1.runtimeType}');
  print ('실수 : ${d1.runtimeType}');
  print ('부울 : ${b1.runtimeType}');
  print ('문자열 : ${s1.runtimeType}');
}
