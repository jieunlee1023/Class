import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert' as convert;

class InitPostsPage extends StatefulWidget {
  const InitPostsPage({Key? key}) : super(key: key);

  @override
  State<InitPostsPage> createState() => _InitPostsPageState();
}

class _InitPostsPageState extends State<InitPostsPage> {
  @override
  void initState() {
    fetchPostList();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        centerTitle: true,
        title: Text("사용자 조회"),
      ),
      body: ListView(
        children: [Text("전체 사용자 목록 조회")],
      ),
    );
  }

  fetchPostList() async {
    var uri = Uri.parse("http://lalacoding.site/init/post");
    http.Response response = await http.get(uri);

    if (response.statusCode == 200) {
      var jsonRes = convert.jsonDecode(response.body) as Map<String, dynamic>;
      jsonRes.forEach((key, value) {
        print("key : $key");
        print("value : $value");

        if (key == "data") {
          print(jsonRes["$key"].runtimeType);
          List list = jsonRes["$key"];
          list.forEach((e) {
            print(e['user']);
            print( e['user'].runtimeType);
            Map map = e['user'];
            print("email : ${map['email']}");
          });
        }
      });
    }
  }
}
