

import 'package:flutter/material.dart';
import 'package:my_recipes/pages/recipe_page.dart';

void main(){
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false, // 디버깅 모드 띠를 사라지게 함
      theme: ThemeData(fontFamily: "PatuaOne"), // 적용 폰트
      home: RecipePage(),
    );
  }
}
