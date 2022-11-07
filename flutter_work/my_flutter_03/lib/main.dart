
void main() {
  //shift (쉬프트) 연산자

  // 3--> 0011 << 0110
  assert( (3 << 1) == 6);

  // 다트에서 상수
  // const : 컴파일 시점 final : 런타임 시점

  //컴파일 시점 : 프로그램이 시작도 하기 전에 만들어진다.
  const msPerSecond = 100;
  // msPerSecond = 200; -> 값이 들어가지 않음
  print(msPerSecond);

  const secondsUntilRetry = 5;
  const msUntilRetry = msPerSecond + secondsUntilRetry; // 상수 + 상수

  //런타임 시점 : 실행이 되면 만들어지는 것 (한 화면을 렌더링 할 때 상수가 된다.)
  final month = 12;
  // month = 11;
  final year = 2022;
  // year = 2023;
  print(year);

  // 초기화 할 때 컴파일 시점에 초기화 하느냐, 런타임 시점에 초기화 하느냐

  // 문자열 UTF-16 유니코드 사용
  var s1 = '싱글 쿼터즈 사용 가능';
  var s2 = "싱글 쿼터즈 사용 가능".length;
  print(s1);
  print(s2);

}