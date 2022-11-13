
void main () {

  var result = testcode();
  print(result.runtimeType);
  print(result.then((value) => print('value: $value')));

}

Future<String> testcode() async {

  print("start");
  var _futureValue = await Future(() {
    for (var i = 0; i<3; i++){
      print("---> i : $i");
    }
    return" i 연산 완료 !";
  });
  print("end");

  return _futureValue;
}
