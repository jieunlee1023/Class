// 문제 2 --> 리스트 샘플 만들어서 처리해보기
// 1단계 UserDto 많이 생성해서 던지세요
// 2단계 메인 함수에서 전부 출력
// 3단계 where 활용해서 뽑아보세요

void main() {
  // fetchUserDto().then((person) => print(person.idol));
  Future idol = fetchUserDto().then((person) => print(person.idol));
  fetchUserDto().then((person) {
    print("----------------------------------------------------");
    print(person.idol.where((e) => e['group'] == '블랙핑크').toList());
  });
}

Future<PersonDto> fetchUserDto() {
  Future<PersonDto> person = Future.value(PersonDto());
  return person;
}

class Idol {
  var name;
  var group;
}

class PersonDto {
  List<Map<String, String>> idol = [
    {'name ': '제니', 'group': '블랙핑크'},
    {'name ': '로제', 'group': '블랙핑크'},
    {'name ': '리사', 'group': '블랙핑크'},
    {'name ': '지수', 'group': '블랙핑크'},
    {'name ': '뷔', 'group': 'BTS'},
    {'name ': 'RM', 'group': 'BTS'},
    {'name ': '정국', 'group': 'BTS'},
    {'name ': '슈가', 'group': 'BTS'},
    {'name ': '제이홉', 'group': 'BTS'},
    {'name ': '민지', 'group': '뉴진스'},
    {'name ': '혜린', 'group': '뉴진스'},
  ];
}
