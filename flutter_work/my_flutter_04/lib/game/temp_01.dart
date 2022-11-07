import 'package:my_flutter_04/main_07.dart';

void main(){
  //다른 패키지면 import 선언을 해주어야 한다.
  Warrior w1 = Warrior('야스오', 10);
  // w1._level private으로 접근불가
  String myName = w1.name;
  print(myName);
}