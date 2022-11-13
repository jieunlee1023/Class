

// main도 함수! 동기화로 만들고 싶을 때 ~
void main () async{

  // await 부분 동기 방식임!
  await addNumbers(10, 10);
  print("--------------------------------------------");
  await addNumbers(20, 20);

}

// 비동기 방식의 함수에 리턴타입은 무조건 미래 타입이어야 한다.
Future<int> addNumbers(int n1, int n2) async {

  print("*********************");
  await Future.delayed(const Duration(seconds: 2),() => n1 + n2);
  print('${n1+n2}');
  print("*********************");

  return n1 + n2 ;
}