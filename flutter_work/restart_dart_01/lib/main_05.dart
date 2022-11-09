
void main (){


  // dart 함수는 1급 객체 조건을 만족한다
  // 익명 함수 개념을 알아야 한다
  // 클로저 개념 !
  // 클로져는 addBy가 살아있음
  // Laxical closure
  var add2 = makeAdder(2);
  var add4 = makeAdder(4);
  //함수의 생명력은 여기서 끝이 났는데
  //add2나 4에 또 다른 함수가 살아있다.

  print(add2(10));
  print(add4(0));
  assert(add2(3) == 5); // 개발시에만 쓰는 코드
}

//데이터타입을 적어주면 가독성이 높음!
Function makeAdder(int addBy) {
  return (int i) => addBy + i; // 함수를 반환
}






