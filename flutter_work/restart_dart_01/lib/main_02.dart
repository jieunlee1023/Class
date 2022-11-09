/// Dart 함수와 매개변수 (optional, named)

void main() {
  addNumbers(1023123, 12312312);

  bool isEven = isEvenNumber(addNumbers2(1212121, 23232323));
  print(isEven == true ? "짝수입니다." : "홀수입니다");

  //  함수 사용과 매개변수
  // 1. 매개변수(positional parameter)
  // 2. optional parameter : 있어도 되고 없어도 된다.
  // 2-1. 기본 값을 정해 줄 수 있고, required 를 설정할 수 있다.
  //           required  - 옵셔널이지만 필수값
  // 2-2. required 를 주게 되면 named parameter 라고 부른다. (옵셔널X)
  //           named parameter  매개변수에 이름이 있고, 순서가 크게 중요하지 않다.
  // 2-3. 기본 값을 주게 되면 역시나 named parameter 라고 부른다.

  // 3. 람다 표현식 (화살표 함수)
  // 코드를 한줄로 표현하고 싶다면 사용한다.
  // return 키워드를 생략 가능하다.

  print(addNumbers3(100, 200, n3: 300));
  addNumbers4(n1: 100, n2: 200, n3: 300);
  addNumbers5(n1: 100, n3: 300);
  print(addNumbers6(n1: 100, n2: 200));

}

//함수를 선언할 때 무엇을 할지 정의하고 만들자
// 두개의 숫자를 받아 더하고 짝수인지 홀수인지 알려주는 함수를 만들어보자 - 1
// 함수는 하나의 기능을 갖고 있는 것이 좋다
// 위 식에서는 더하는 기능 / 홀짝 구분 기능 2개이므로 좋지 않음!

addNumbers(var n1, var n2) {
  int sum = n1 + n2;
  if (sum % 2 == 0) {
    print('짝수입니다.');
  } else {
    print('홀수입니다.');
  }
}

// 두개의 매개변수를 받아 덧셈하는 기능
addNumbers2(var n1, var n2) {
  return n1 + n2;
}

// 옵셔널 파라미터를 사용하기 = 두개의 매개 변수를 받아 덧셈하는 기능
addNumbers3(var n1, var n2, {var n3 = 0}) {
  return n1 + n2 + n3;
}

addNumbers4({ var n1, required var n2, required var n3}) {
  return n1 + n2 + n3;
}

addNumbers5({var n1=0, var n2=0, var n3=0}) {
  // null point 오류를 막기 위해서
  //1. 방어적 코드 사용 2. 기본값으로 초기화 =0
  return n1 + n2 + n3;
}

addNumbers6({var n1=0, var n2=0, var n3=0}) => n1 + n2 + n3;


// 정수 값을 받아 짝수인지 홀수인지, true/false를 반환하는 기능
isEvenNumber(var number) {
  return (number % 2) == 0 ? true : false;
}
