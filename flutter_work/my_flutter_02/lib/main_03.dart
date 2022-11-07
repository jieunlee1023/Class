
/// 변수
/// 명시적 타입, 타입추론
/// bool b1 = true;  불리언은 축약
void main(){
  var name = 'Voyager I';
  var year = 1997;
  var diameter = 3.7;
  var flybyObjects = ['Jupiter', 'Saturn', '홍길동'];
  var image = {
    'tags' : ['홍길동', '티모'],
    'url' : 'path/to/juppiter.png'
  };

  print(image);
  print(image['tags']);
  print(image['tags'].runtimeType); //타입을 알려줌
  print(name.runtimeType);
  print(year.runtimeType);
  print(diameter.runtimeType);

  List<String> tagList = image['tags'] as List<String>; // 형변환
  print (tagList[0]);
  print (tagList[1]);

  Map images ={}; // Map --> {}  / List --> []
}
