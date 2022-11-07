import 'package:my_flutter_04/Main_08.dart';

void main(){

  Person person = Person();

  // person.name = '홍길동';
  // print(person.name);
  //즉, getter / setter로 접근할 때도 name 이라는 이름으로 사용된다.

  // person.setName = '홍길동';
  // print(person.getName);
  // 헷갈릴 수 있으므로 get,set을 붙여주는 것이 좋다.

  person.setName = null;
  print(person.getName);

}