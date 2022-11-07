void main(){

  Person person =Person() ;
}

class Person{
  String? _name;

  // String? get name => _name; //getter 기본 형태
  // set name(String? name) => _name = name; //setter 기본 형태

//  데이터타입? get 변수명 => 기본 변수명(_~);
//   set 변수명 (데이터타입? 입력값) => 기본 변수명(_~) = 입력값;

// String? get getName => _name;
// set setName(String? name) => _name = name;

  String? get getName => (_name == null) ? '홍' : _name;
  set setName(String? name) => (name == null) ? 'Part' : _name = name;

}