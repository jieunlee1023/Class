// 컬렉션 Map 과 Stream의 활용

void main (){
  Map<String, String> games = {
    "블리자드" : "스타그래프트" ,
    "라이엇" : "롤" ,
    "펍지" : "배틀그라운드" ,
  };

  final result = games.map((k, v) => MapEntry('mobile $k', '신작 $v'));
  print(result);
  print(games); // 원본 데이터는 변하지 않는다
  print("--------------------------------------------------");

  final keys = games.keys.map((e) => 'boot $e').toList();
  final values = games.values.map((e) => 'like $e').toList();
  print(keys);
  print(values);
}