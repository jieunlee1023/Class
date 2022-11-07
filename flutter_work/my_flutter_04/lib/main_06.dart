void main(){

  String name1 ='홍길동';
  String name2 ='이순신';

  print(name1 + name2);
  // 문자열 + 문자열은 가능!
  // - , * , / 등은 불가능하다.

  // 서로 다른 데이터 표기를 더하기 위해서는
  print('${name1} ${name2}');
  print('$name1 $name2');
  print('${name1.runtimeType} $name2.runtimeType');
  // 점 연산자 사용시 축약이 불가능하다.

  var myVar ='1';
  //myVar = 100;
  dynamic youtData ='11';
  youtData = 100;

  //nullable - 변수가 null이 될 수 있다.
  //non-nullable - 변수가 null이 될 수 없다.
  // null - 아무런 값도 없다.

  String name = '텐코딩';
  // name = null; // 컴파일 시점에 오류 (불가능)

  String? name3 = '홍길동';
  // 타입을 지정 할 수 있고, null도 사용가능하다
  name3 = null; //?를 사용하여 null 허용시킴
  print(name3);
  // print(name3!);
  // ! : 여기 값은 반드시 null이 아니야라는 의미임
  // 현재 null이므로 오류 발생

  // 상수 const , final

  DateTime now1 = DateTime.now();
  print(now1);

  DateTime now2 = DateTime.now();
  print(now2);
  
  print("---------------------------------------");
  final DateTime now3 = DateTime.now();
  print(now3);

  // 컴파일 타입에 값을 받아야하는 const ,
  // DataTime.now()는 실행 시점에 실행 되기 때문에,
  // 여기서는 사용이 안된다.
  //const DateTime now4 = DateTime.now();
  //print(now4);
}
