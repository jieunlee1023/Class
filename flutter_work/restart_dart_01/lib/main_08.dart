// 컬렉션 안에 있는 Stream과 함수형 프로그래밍의 이해 활용 ..
// List와 Stream
void main() {
  List<String> game = ['스타그래프트', '롤', '오버워치', '피파온라인', '롤', '롤'];
  //   // 컬렉션을 사용할 때 불필요한 for문 if문을 줄여서 가독성을 높힐 수 있고,
  //   // stream map 함수는 데이터를 원하는대로 변형 할 때 활용할 수 있다.
  final newGame = game.map((e) => "2022 - $e");
  final newGame2 = game.map((e) {
    return "블리자드 $e";
  });
  print(newGame);
  print(newGame2);
  // 괄호는 반복자 타입이다 ( 형변환을 편하게 할 수 있는 중간타입 )
  //리스트로 변환하고 싶다면 -->
  print(newGame2.toList());
  //Set 타입으로 변환하고 싶다면 -->
  print(newGame2.toSet());

  print('-------------------------------------------------------');

  String number = '123456';
  final parsed = number.split('').map((e) => '$e.jpg').toList();
  print(parsed);
}