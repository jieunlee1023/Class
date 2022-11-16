import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert' as convert; //타입을 변형하는 패키지

import '../utils/constant.dart';
//as는 우선권을 준다.

class InitUsersPage extends StatefulWidget {
  const InitUsersPage({Key? key}) : super(key: key);

  @override
  State<InitUsersPage> createState() => _InitUsersPageState();
}

class _InitUsersPageState extends State<InitUsersPage> {
  // 메모리에 올라 갈 때 한번만 호출되는 메서드
  @override
  void initState() {
    fetchUserList();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(centerTitle: true, title: Text('사용자 조회')),
      body: ListView(
        children: [
          Text("전체 사용자 목록 조회"),
        ],
      ),
    );
  }
  fetchUserList() async {

    //http://lalacoding.site/init/user
    // var endPoint = "/users";
    var uri = Uri.parse("http://lalacoding.site/init/user");
    http.Response response = await http.get(uri);
    // print(response.statusCode);
    // 방어적 코드
    if (response.statusCode == 200) {
    //   print(response.body.runtimeType);
    // print(response.body);
    // map 구조로 변환이 된다
    var jsonRes = convert.jsonDecode(response.body) as Map<String, dynamic>;
      // print("-------------------------------");
    //   // map['code'] <--value
    //   print(jsonRes.runtimeType);
      jsonRes.forEach((key, value) {
        // print("key : $key");
        // print("value : ${jsonRes["$key"]}");

        //1. 만약 키가 data라면
        if (key == "data"){
          //2. 화면에 사용자 이름만 출력하시오!
          // print(jsonRes["$key"].runtimeType);
          List list = jsonRes['$key'];
          list.forEach((e) {
            print("---------------------------");
            print(e.runtimeType);
            print("---------------------------");
            print(e['username']);
            // print(e['id']);
            // print("---------------------------");
          });

        }
      });

    } else {}
  }
}
