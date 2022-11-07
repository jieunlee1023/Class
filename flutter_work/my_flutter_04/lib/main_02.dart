void main() {
  // collections
  // List , Set , Map

  // List list;
  // Set set;
  // Map map;

  List list = [1, 2, 3, 4, 5]; //리스트만 대괄호를 사용한다.
  print(list[0]);
  print(list[1]);

  //(element) { } : 익명 (구현) 클래스
  list.forEach((element) {
    print("요소 확인 : ${element.runtimeType}");
  });

  // 마지막 요소 삭제
  list.removeLast();
  print(list);

  // 전체 요소 삭제
  list.clear();
  print(list);

  // 컴파일 타임 상수 만들어 보기
  var constList = const [1, 2, 3];
  // constList.add(4); 상수는 추가 할 수 없음!
  print(constList);

  var amIList = [1, "A", 1.0, true];
  print(amIList);

  amIList.forEach((e) {
    print("데이터 타입 확인 : ${e.runtimeType}");
  });

  // Dart.2.3 이상 부터는 컬렉션에 삽입하는 간결한 방법을 제공하는
  // 스프레드 연산자 (...) 와 널(null) 인식 스프레드 연산자 (...?) 사용 할 수 있다.

  var list3 = [1,2,3];
  // 스프레드 연산자는 하나씩 반복하면서 뿌려주는 녀석 이다.
  var list4 = [0, ...list3, 100];
  print(list4);

  //널 인식 스프레드 연산자
  // 스프레드 연산자 오른쪽에 있는 표현식이 null 일 수 있는 경우
  // ...? 을 사용하여 예외를 피할 수 있다.

  var list5;
  // var list6 = [0, ...list5]; --> list5가 null 이므로 오류 발생
  var list6 = [0, ...?list5];
  print(list6);

  // 추가
  // 조건문, 반복을 사용하여 컬렉션을 구축하는데 사용할 수 있는 컬렉션 if 를 제공한다.
  var promoActive = true;
  // var promoActive = false;
  var nav = ['home', 'fun', 'p', if(promoActive)'outlet'];
  print(nav);

  // 추가 2
  var listOfInts =[1,2,3];
  var listOfStrings = [ '#0', for(var i in listOfInts) '#$i' ];
  print(listOfStrings);

  for(var e in listOfInts){
    print("e : ${e}");
  }


}
