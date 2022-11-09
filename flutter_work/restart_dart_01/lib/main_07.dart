// 함수형 프로그래밍
//다트 컬렉션 (stream)

// 기본기 - 형변환
void main (){

  List<String> game = ['스타그래프트', '롤', '망나뇽', '앵그리버드', '롤', '롤'];
  print(game);

  print(game.asMap()); // map으로 변환 - 데이터 타입 반환
  Map myLikeGame = game.asMap();
  print(myLikeGame);


  print(game.toSet()); // set으로 변환 - 중복을 보여주지 않음
  Set myGame = game.toSet();
  print(myGame);

  Set myGame2 = Set.from(game);
  print(myGame2);

  // set --> list
  print(myGame2.toList());   // 리스트로 형변환



}