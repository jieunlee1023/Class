// Set과 Stream의 활용

void main () {

  Set blackPinkSet = {
    '로제',
    '지수',
    '리사',
    '제니'
  };

  final newBlackPink = blackPinkSet.map((e) => '블랙핑크 $e').toSet();
  print(newBlackPink);
}