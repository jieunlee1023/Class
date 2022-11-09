// where - true, false

void main (){
  List<Map<String, String>> person = [
    {
      'name' : '로제',
      'group' : '블랙핑크'
    },
    {
      'name' : '제니',
      'group' : '블랙핑크'
    },
    {
      'name' : 'RM',
      'group' : 'BTS'
    },
    {
      'name' : '정국',
      'group' : 'BTS'
    },
  ];
  print(person);
  final blackPink = person.where((e) => e['group'] == '블랙핑크').toList();
  final bts = person.where((e) => e['group'] == 'BTS').toList();
  print(blackPink);
  print(bts);
}