/// Dart 에서 함수는 1급 객체로 사용될 수 있다.
///1. 변수나 데이터에 할당 할 수 있어야 한다.
///2. 객체의 (생성자) 인자로 넘길 수 있어야 한다.
///3. 객체의 리턴 값으로 리턴 할 수 있어야 한다.

void main() {
// 모든 함수는 리턴 값을 가진다.
// 리턴 값이 없으면 null 이다.
// 하지만 void 텅빈 - 아무것도 없는 의미이다
// void를 선언하면 리턴을 할  수 없다이고 문법적으로 막는다.

List list = [1,2,3];
// 함수를 인자값으로 전달 받는다
// 한번 반복이 진행 될 때, parameter로 list를 하나씩 전달해줌
list.forEach(printElement);

// 함수 리턴하기
var loudify = (msg) => '!!! ${msg.toUpperCase()} !!!';
print (loudify('hello'));
assert(loudify("hi") == "!!! HI !!!");
}

void printElement(element) {
  print(element);
}
