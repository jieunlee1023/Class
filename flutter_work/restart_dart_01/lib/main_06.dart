
// Lexical scope
// Dart 에서 중첩함수 방식으로 함수 안에 함수를 선언할 수 있다.
void main (){

  var insideMain = true;

  //메인 함수 안에서 함수도 Ok
  void myFunction () {
    var insideFunction = true;
    print(insideMain);

    void nestedFunction(){
      print("nested ${insideFunction}");
    }

  }
}
