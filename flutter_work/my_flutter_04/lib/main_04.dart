void main() {
  //Map
  //key : value
  // 키는 중복이 될 수 없다. 값은 중복이 될 수 있다.
  //Dart 에서 new 키워드는 선택 사항입니다.
  //Map 도 중괄호를 사용합니다. { }

  var gifts = {
    'first': 'part',
    'second': 'test',
    'fifth': 'SQLD 자격증'
  };

  var gifts2 = {
    1: 'part',
    2: 'test',
    3 : 'SQLD 자격증'
  };

  final gifts3 = const {
    1: 'part',
    2: 'test',
    3 : 'SQLD 자격증'
  };

  print(gifts2);
  print(gifts2[1]);
  print(gifts2[2]);
  print(gifts2[3]);
  print("-----------------");
  print(gifts);
  print(gifts["first"]);
  print(gifts["second"]);
  print(gifts['fifth']);
  print(gifts['s']); // 없는 경우 null
  print("-----------------");
  // gifts3[2] = "aaaaa"; 상수이므로 변경 불가능!
  print(gifts3);

}