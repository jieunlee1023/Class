
import 'package:basic_http_flutter_55/constants.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert' as convert;

import 'models/request_post.dart';
import 'models/request_user.dart';

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int selectedId = 0;
  String? authToken;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text("< User >",
                style: TextStyle(fontWeight: FontWeight.bold, fontSize: 20)),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                _buildHeaderlectorButton(0, Icons.people_rounded, "회원가입"),
                _buildHeaderlectorButton(1, Icons.login, "로그인"),
                _buildHeaderlectorButton(2, Icons.tips_and_updates, "수정"),
                _buildHeaderlectorButton(3, Icons.delete, "삭제"),
              ],
            ),
            SizedBox(
              height: 50,
            ),
            Text("< Post >",
                style: TextStyle(fontWeight: FontWeight.bold, fontSize: 20)),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                _buildHeaderlectorButton(
                    4, Icons.format_list_numbered_outlined, "조회"),
                _buildHeaderlectorButton(5, Icons.people_rounded, "글쓰기"),
                _buildHeaderlectorButton(
                    6, Icons.browser_updated_outlined, "수정"),
                _buildHeaderlectorButton(7, Icons.delete, "삭제"),
              ],
            )
          ],
        ),
      ),
    );
  }

  Widget _buildHeaderlectorButton(int id, IconData mIcon, String text) {
    return Padding(
      padding: const EdgeInsets.all(8.0),
      child: Container(
        width: 70,
        height: 70,
        decoration: BoxDecoration(
          color: id == selectedId ? Colors.pinkAccent : Colors.grey,
          borderRadius: BorderRadius.circular(20),
        ),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            IconButton(
              icon: Icon(mIcon, color: Colors.black),
              onPressed: () {
                setState(() {
                  selectedId = id;
                  if (id == 0) {
                    createUser();
                  } else if (id == 1) {
                    loginUser();
                  } else if (id == 2) {
                    updateUser(121);
                  } else if (id == 3) {
                    showCupertinoDialog(
                        context: context,
                        builder: (context) {
                          return CupertinoAlertDialog(
                            title: Text('현재는 지원하지 않는 기능입니다.'),
                            actions: [
                              CupertinoDialogAction(
                                child: Text("확인"),
                                onPressed: () {
                                  Navigator.pop(context);
                                },
                              )
                            ],
                          );
                        });
                  } else if (id == 4) {
                    getPost(146);
                  } else if (id == 5) {
                    createPost();
                  } else if (id == 6) {
                    updatePost(124);
                  } else if (id == 7) {
                    deletePost(124);
                  }
                });
              },
            ),
            Text('$text', style: TextStyle(fontWeight: FontWeight.bold),),
          ],
        ),
      ),
    );
  } //end of build

  createUser() async {
    var uri = Uri.parse(BASE_URL + "/join");
    var requestUserObj = RequestUser(
        username: "123", password: "1234", email: "new@gmail.com");
    var requestHeaderMsg = {'Content-type': 'application/json; charset=UTF-8'};
    var jsonEncodePost = convert.jsonEncode(requestUserObj.toJsonCreate());

    await http
        .post(
      uri,
      body: jsonEncodePost,
      headers: requestHeaderMsg,
    )
        .then((res) {
      print(res.statusCode);
      print(res.body);
    });
  } // end of createUser

  loginUser() async {
    var uri = Uri.parse(BASE_URL + "/login");
    var requestUserObj = RequestUser(username: "ming", password: "12345");
    var requestHeaderMsg = {'Content-type': 'application/json; charset=UTF-8'};
    var jsonEncodePost = convert.jsonEncode(requestUserObj.toJsonLogin());

    await http
        .post(
      uri,
      body: jsonEncodePost,
      headers: requestHeaderMsg,
    )
        .then((res) {
      print(res.statusCode);
      print(res.headers);
      authToken = res.headers["authorization"];
      print(res.body);
    });
  }

  updateUser(var id) async {
    var uri = Uri.parse(BASE_URL + "/user/$id");
    var requestUserObj =
    RequestUser(password: "12345", email: "ming_update@naver.com");
    var requestHeaderMsg = {
      'Content-Type': 'application/json; charset=UTF-8',
      'Authorization': '$authToken'
    };
    var jsonEncodePost = convert.jsonEncode(requestUserObj.toJsonUpdate());

    await http.put(
      uri,
      body: jsonEncodePost,
      headers: requestHeaderMsg,
    )
        .then((res) {
      print(res.statusCode);
      print(res.body);
    });
  }

  getPost(var id) async {
    var uri = Uri.parse(BASE_URL + "/post/$id");
    var requestHeaderMsg = {'Authorization': '$authToken'};
    await http.get(
      uri,
      headers: requestHeaderMsg,
    )
        .then((res) {
      print(res.statusCode);
      print(res.body);
    });
  }

  createPost() async {
    var uri = Uri.parse(BASE_URL + "/post");
    var requestUserObj =
    RequestPost(title: "이지은 글쓰기", content: "안녕하세요우");
    var requestHeaderMsg = {
      'Content-type': 'application/json; charset=UTF-8',
      'Authorization': '$authToken'
    };
    var jsonEncodePost = convert.jsonEncode(requestUserObj.toJsonCreate());
    await http.post(
      uri,
      body: jsonEncodePost,
      headers: requestHeaderMsg,
    )
        .then((res) {
      print(res.statusCode);
      print(res.body);
    });
  }

  updatePost(var id) async {
    var uri = Uri.parse(BASE_URL + "/post/$id");
    var requestUserObj =
    RequestPost(title: "이지은 글쓰기_수정", content: "안녕하세요우_수정");
    var requestHeaderMsg = {
      'Content-type': 'application/json; charset=UTF-8',
      'Authorization': '$authToken'
    };
    print("response : $authToken");
    var jsonEncodePost = convert.jsonEncode(requestUserObj.toJsonCreate());
    await http.put(
      uri,
      body: jsonEncodePost,
      headers: requestHeaderMsg,
    )
        .then((res) {
      print(res.statusCode);
      print(res.body);
    });
  }

  deletePost(var id) async {
    var uri = Uri.parse(BASE_URL + "/post/$id");
    var requestHeaderMas = {
      'Authorization': '$authToken'};
    await http.delete(
      uri,
      headers: requestHeaderMas,
    ).then((res) {
      print(res.statusCode);
      print(res.body);
    });

  }
}


