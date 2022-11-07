/// Dart 에서는 4가지 기본 타입을 제공합니다. (Object)
/// 정수 <int>, 실수 <double> , 문자열 <String>, 논리 <bool>
/// Numbers(int, double)
/// String
/// bool
/// null

///List
///Set
///Map
///변수에 넣을 수 있는 모든 것은 객체이고 모든 객체는 클래스의 인스턴스 입니다.
///null을 제외하고 모든 객체는 Object 클래스에서 상속됩니다.

void main() {
// Dart에서 형변환

// var intTen = '10' as int;
//as는 다운 캐스팅시 사용가능
// print(intTen);

// String --> int
  var intTen = int.parse('10');
  print(intTen);
  print(intTen.runtimeType);

// String --> double
  var onePointOne = double.parse('1.1');
  print(onePointOne);
  print(onePointOne.runtimeType);

  // int --> String
  String oneAsString = 1.toString();
  print(oneAsString);
  print(oneAsString.runtimeType);

  // 이 값이 맞는지 바로 확인 - assert
  assert(oneAsString == '1');
  print('여기 코드 실행 될까요 ?');

  // double --> String
  // String piAsString = 3.141592.toString();
  String piAsString = 3.141592.toStringAsFixed(2); // 소수점 자르고 싶을 때
  print(piAsString);
  print(piAsString.runtimeType);

  // String --> bool
  String str1 = 'false';
  //String str1 = 'true';
  bool isOk = str1.toLowerCase() == 'true';
  print(isOk);
  print(isOk.runtimeType);

  // bool --> String
  bool isEmpty = true;
  String str2 = isEmpty.toString();
  print(str2);
  print(str2.runtimeType);
}
