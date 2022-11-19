import 'package:basic_http_flutter_3/models/photo.dart';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert' as convert;

import 'models/todo.dart';
import 'models/user.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    fetchPhotos();
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Center(
        child: Container(
          width: 50,
          height: 50,
          color: Colors.orange[300],
        ),
      ),
    );
  }

  fetchUsersOne() async {
    var uri = Uri.parse("https://jsonplaceholder.typicode.com/users/1");
    var response = await http.get(uri);
    if (response.statusCode == 200){
      print("response : ${response.body}");
      Map<String,dynamic> userone = convert.jsonDecode(response.body);
      userone.forEach((key, value) {
        print("key : $key");
        print("value : $value");
      });
    }
  }

  fetchUsers() async {
    List<User> userlist =[];
    var uri = Uri.parse("https://jsonplaceholder.typicode.com/users");
    var response = await http.get(uri);
    if (response.statusCode == 200){
      List<dynamic> list = convert.jsonDecode(response.body);
      for (var e in list) {
        userlist.add(User.fromJson(e));
      }
    } else {
      throw Exception("fail load : ${response.statusCode}");
    }
    print("모든 user의 자료가 자료구조에 담겼음!");
    // print("userList의 길이 : ${userlist.length}");
    // print(userlist);
  }

  fetchPhotos() async {
    List<Photo> photoList =[];
    Map<int, Photo>? photomap ;
    int a = 1;
    var uri = Uri.parse("https://jsonplaceholder.typicode.com/photos");
    var response = await http.get(uri);
    if (response.statusCode == 200){
      List listData = convert.jsonDecode(response.body);
      listData.forEach((e) {
        // print(e.runtimeType); --> map
        // print("e: $e");
        // photoList.add(Photo(albumId: e["albumId"], id: e["id"], title: e["title"], url: e["url"], thumbnailUrl: e["thumbnailUrl"]));
        // photoList.add(Photo.init(e["title"]));
        // photoList.add(Photo.formJson(e));
        photomap?.addAll({a,Photo(id: e)} as Map<int, Photo>);
        photomap={
          a : Photo.formJson(e),
        };
      });

      print("모든 photo의 자료가 자료구조에 담겼음!");
      // print("photoList의 길이 : ${photoList.length}");
      // print(photoList);
      print("photomap 길이 : ${photomap?.length}");
      print(photomap);
    }
  }

  fetchTodos() async {
    List<Todo> todoList = [];
    var uri = Uri.parse("https://jsonplaceholder.typicode.com/todos");
    var response = await http.get(uri);
    print(response.runtimeType);
    if (response.statusCode == 200) {
      List listData = convert.jsonDecode(response.body);
      for (var e in listData) {
        //print("Data Type Check : ${e.runtimeType}");
        //print("Data : ${e}");
        //print("---------------------------------");
        //e --> {} (맵 구조)
        // e[key]
        //todoList.add(Todo(userId: e['userId'], id: e['id'], title:e['title'], completed: e['completed']));
        // Todo todo = Todo.init(userId: e["userId"],title: e["title"],completed: e["completed"]); //id는 null 값으로 들어옴
        // todoList.add(todo);

        todoList.add(Todo.fromJson(e));
      }
    }
    print("통신이 끝나고 자료구조에 데이터 담음!");
    print("todoList 길이: ${todoList.length}");
    print(todoList);
  }
}
