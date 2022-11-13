// 문제1. 미래타입 함수 선언
// UserDto를 생성해서 (값 세팅) 3초 뒤에 리턴하는 함수를 만들어주세요
// main 쪽에서 넘겨 받은 userDto toString 출력해주세요.

void main() {
  fetchUserDto().then((userDto) => print(userDto.toString()));
  Future<UserDto> fUser1 = Future(() => UserDto("이순신", 1));
  Future<UserDto> fUser2 = Future.value(UserDto('이순신', 1));
}

class UserDto {
  String name;
  int age;

  UserDto(this.name, this.age);

  @override
  String toString() {
    return 'UserDto{name: $name, age: $age}';
  }
}

Future<UserDto> fetchUserDto() {
  Future<UserDto> userDto =
      Future.delayed(Duration(seconds: 3), () => UserDto('홍길동', 100));
  print(userDto.runtimeType);
  return userDto;
}
