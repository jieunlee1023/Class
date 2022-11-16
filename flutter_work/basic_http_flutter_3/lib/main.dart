import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert' as convert;

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    fetchTodos();
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

  fetchTodos() async {
    var uri = Uri.parse("https://jsonplaceholder.typicode.com/todos");
    var response = await http.get(uri);
    print(response.statusCode);
    if (response.statusCode == 200) {
      List listData = convert.jsonDecode(response.body);
      for (var value in listData) {
        print("Data Type Check : ${value.runtimeType}");
        print("Data : ${value}");
        print("---------------------------------");
      }
    }
  }
}
