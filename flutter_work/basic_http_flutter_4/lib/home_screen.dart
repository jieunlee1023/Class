import 'package:basic_http_flutter_4/models/Todo.dart';
import 'package:basic_http_flutter_4/models/request_post.dart';
import 'package:basic_http_flutter_4/models/response_post.dart';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert' as convert;

import 'constants.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({Key? key}) : super(key: key);

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  @override
  Widget build(BuildContext context) {
    // Container가 최상위인 경우 전체 크기로 들어오는 제약이 있다.
    // constraints 또한 먹지 않는다.
    // 원하는 크기로 하고 싶다면, Colum혹은 Center 등으로 한번 더 감싸줘야한다.
    return Scaffold(
      body: Align(
        alignment: Alignment.center,
        child: Column(
          children: [
            InkWell(
              onTap: () {
                // fetchGetTodo(1);
                // createPost();
                // putPost(1);
                deletePost(1);
              },
              child: Container(
                width: 100,
                height: 100,
                color: Colors.red,
              ),
            ),
          ],
        ),
      ),
    );
  }

  fetchGetTodo(var id) async {
    var uri = Uri.parse(BASE_URL + "/todos/$id");
    await http.get(uri).then((res) {
      print(res.statusCode);
      print(res.headers);
      print("------------------------------");
      //String --> 변환 (convert.jsonDec) --> Map<String, dynamic> --> Object로 변환
      Map<String, dynamic> bodyMap = convert.jsonDecode(res.body);
      // List 타입이라면 반복문이 들어간다.
      Todo todo = Todo.fromJson(bodyMap);
      print(todo);
    }, onError: (error) {
      print("실패사유 $error");
      // http의 경우 통신 자체가 실패 했을 때 여기로 빠짐
      // 404 에러도 통신이 된 후 알게 된 것이기 때문에!
      // 여기로 빠지진 않는다.
    });
  }

  createPost() async {
    var uri = Uri.parse(BASE_URL + "/posts");

    //1번 : 실패
    var requestPostObj = RequestPost(title: "홍길동", body: "날라차기", userId: 10);

    //2번 : 실패
    var requestHeaderMsg = {
      'Content-type': 'application/json; charset=UTF-8',
    };
    var requestBodyMap = {
      'title': 'foo',
      'body': 'bar',
      'userId': 1,
    };

    //3번 : 성공
    //object --> json 형식으로 변경
    //object --> map --> json !!!!!
    Map<String, dynamic> objectToMap = {
      "title": requestPostObj.title,
      "body": requestPostObj.body,
      "userId": requestPostObj.userId
    };
    var jsonEncodePost = convert.jsonEncode(objectToMap);

    //4번 RequestPost에 기능추가 (메서드 사용)
    var jsonEncodePost1 = convert.jsonEncode(requestPostObj.toJson());

    await http
        .post(
      uri,
      body: jsonEncodePost1,
      headers: requestHeaderMsg,
    )
        .then((res) {
      print(res.statusCode);
      print(res.body.runtimeType); //map --> object
      print(res.body);

      print("-------------------------------CREATE 변환전");

      // 응답 데이터 변환
      var resData = ResponsePost.fromJson(convert.jsonDecode(res.body));
      print('최종 결과문 - $resData');
    }, onError: (error) {
      print(error);
    });
    print("-------------------------------CREATE 변환후 종료");
  }

  putPost(var id) async {
    var uri = Uri.parse(BASE_URL + "/posts/$id");
    var requestPostObj =
        RequestPost.init(id: 1, title: "이순신", body: "날라차기2", userId: 15);
    var requestHeaderMsg = {
      'Content-type': 'application/json; charset=UTF-8',
    };

    Map<String, dynamic> objectToMap = {
      "id": requestPostObj.id,
      "title": requestPostObj.title,
      "body": requestPostObj.body,
      "userId": requestPostObj.userId
    };

    var jsonEncodePost = convert.jsonEncode(objectToMap);

    //메서드 사용해보기
    var jsonEncodePost1 = convert.jsonEncode(requestPostObj.toJson());

    await http
        .put(
      uri,
      body: jsonEncodePost1,
      headers: requestHeaderMsg,
    )
        .then((res) {
      print(res.statusCode);
      print(res.body);
      print("------------------------------PUT 변환전");
      // 응답 데이터 변환
      var resData = ResponsePost.fromJson(convert.jsonDecode(res.body));
      print('최종 결과문 - $resData');

      print("------------------------------PUT 변환 후 종료");
    });
  }

  deletePost(var id) async {
    var uri = Uri.parse(BASE_URL + "/posts/$id");

    await http.delete(uri).then((res) {
      print(res.statusCode);
      print(res.headers);
      print(res.headers.runtimeType);
      print(res.headers['content-length']);
      print(res.body);
      print("------------------------------DELETE 종료");
    });
  }
}
