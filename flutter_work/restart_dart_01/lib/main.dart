enum Status { ready, start, end }

void main() {
  // 데이터 범주화, 타입처럼 사용.
  // 개발자에게 코드의 가독성을 높혀주고, 안정적인 프로그래밍 방식에 하나
  Status myStatus = Status.ready;
  if (myStatus == Status.ready) {
    print('준비중입니다.');
  } else if (myStatus == Status.start) {
    print('시작 했습니다.');
  } else if (myStatus == Status.end) {
    print('종료 되었습니다.');
  }

  switch (myStatus) {
    case Status.ready:
      print('준비중입니다.');
      break;
    case Status.start:
      print('시작 했습니다.');
      break;
    case Status.end:
      print('종료 되었습니다.');
      break;
    default :
      print('3개 다 없으면 기본값 !');
  }
}
