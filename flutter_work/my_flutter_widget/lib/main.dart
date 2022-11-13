import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Container(
        color: Colors.white,
        child: Stack(
          // Stack()위젯은 겹쳐서 보여주고 싶을 때 사용
          children: [
            Positioned(
              left: 10.0,
              bottom: 200.0,
              child: Container(
                width: 100,
                height: 100,
                color: Colors.red,
              ),
            ),
            Container(
              width: 90,
              height: 90,
              color: Colors.orange,
            ),
            Container(
              width: 80,
              height: 80,
              color: Colors.yellow,
            ),
          ],
        ),
      ),
    );
  }
}
