import 'package:flutter/material.dart';
import 'package:my_flutter_login/pages/home_page.dart';
import 'package:my_flutter_login/pages/login_page.dart';

void main () {
  // 화면 이동을 위한 Routes (경로 - /a/b/c)
  // runApp(MaterialApp(home: MyAppHome(), routes: '/a' : () => Mypage(), ));

  runApp(MyApp());

}
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      initialRoute: "/login",
      routes: {
        "/login" : (context) => LogiinPage(),
        "/home" : (context) => HomePage()
      },
    );
  }
}
