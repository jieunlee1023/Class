
void main() {

  var strs = ['A', 'B', 'C'];

  for(var i =0; i<strs.length; i++){
    print(strs[i]);
  }
  print("-----------------------------");
  for(var el in strs) {
    print("for each : ${el}");
  }

  print("-----------------------------");
  var coll = [1,2,3];
  print("=================");
  coll.forEach(print);
  print("=================");
  coll.forEach((e) {print(e);});

  // StringBuffer : 문자열을 효율적으로 연결하기 위한 클래스
  var message = StringBuffer("Date is fun");
  for(var i = 0; i < 5; i++){
    message.write('!');
  }
  print(message);
  
  var count = 0;
  var sum = 0;

  // 1부터 100까지 
  while(count < 100){
    count ++;
    print("sum :  ${sum +=count}");
  }


}
