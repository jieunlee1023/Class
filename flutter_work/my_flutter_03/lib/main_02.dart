void main(){
  // 부호연산자 : 단항 연산자, 부호만 바꿈, 값을 변경하지 않는 연산자
  // 실제 값을 변경하려면 대입 연산자를 사용해야한다.
  var number = 10;
  print(-number);
  print(number);

  // 복합 대입 연산자 +=, -=, *=, /=
  var num1 = 0;
  num1 += 2;
  print(num1);

  var num2 = 0;
  num2 -= 2;
  print(num2);

  var num3 = 3;
  num3 *= 3;
  print(num3);

  var num4 = 10.0;
  num4 /= 2;
  print(num4);
  // 나누기의 경우 실수형으로 만들어주어야 오류가 나지 않는다.

  // 증감 & 감소 연산자
  var gameScore = 10;
  var lastSCrore;
  lastSCrore = ++gameScore;
 // lastSCrore = gameScore++;

  //연산자가 항의 앞에 있는가 뒤에 있는가에 따라서 연산 지점과 결과가 달라질 수 있다.
  // 문장 끝 (statement)을 기준으로 연산 시점을 생각해야 한다.
  print('lastScore : ${lastSCrore}');
  print ('gameScore : ${gameScore}');

}