void main() {
  // Set 사용해보기
  // 집합 리터럴을 사용하는 간단한 set

  var computerParts = {'mouse', 'keyboard', 'speaker', 'monitor'};
  print(computerParts);

  for (var parts in computerParts) {
    print(parts);
  }

  //반복자를 사용하는 방법
  Iterator iterator = computerParts.iterator;
  while (iterator.moveNext()) {
    print(":: ${iterator.current}::");
  }

  // 다트는 new 해도 되고 안해도 된다
  Set setInter = new Set<int>();
  setInter.add(1);
  setInter.add(2);
  setInter.add(3);
  print(setInter);

  print("----------------------------");
  setInter.remove(1);
  print(setInter);
  print("----------------------------");
  setInter.remove(10);
  print(setInter);

  //얕은 복사
  var elements = computerParts;
  print("elements : ${elements}");
  elements.add("abc");
  print("computerParts : ${computerParts}");
  print("---------------------------------");

  //addAll 깊은 복사가 된다.
  Set elements2 = Set(); // <>도 생략 가능
  elements2.addAll(computerParts);
  elements2.add("이거 들어감?");
  print("elements2 : ${elements2}");
  print("computerParts : ${computerParts}");

//문제
// 반복자 사용해서 while문을 사용하고
//그 요소중에 touchpad가 있으면
// 화면에 touchpad가 존재합니다. 글자를 찍고 더이상 반복을 돌지 마시오.

  var elements3 = computerParts;
  elements3.add('touchpad');
  print(elements3);

  Iterator iterator2 = computerParts.iterator;
  while (iterator2.moveNext()) {
    var hasTouchPad = iterator2.current == 'touchpad' ? true : false;

    if (hasTouchPad) {
      print('touchpad가 존재합니다.');
      break;
    }
  }

  var constantSet = const{
    'a',
    'b',
    'c',
    'd'
  };

  // constantSet.add('c'); 상수이므로 변경 불가
  print(constantSet);



}
