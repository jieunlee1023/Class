import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: Center(
          child: Counter(),
        ),
      ),
    );
  }
}

class Counter extends StatefulWidget {
  const Counter({Key? key}) : super(key: key);

  @override
  State<Counter> createState() => _CounterState();
}

class _CounterState extends State<Counter> {
  int _count = 0;
  // statefull 위젯에서 다시 렌더링 시키는 방법은 약속된 메서드를 호출해주면 된다.
  // statefull에서만 가능!
  void _increment(){
    setState(() {
       _count ++;
    });
  }
  @override
  Widget build(BuildContext context) {
    print("호출 확인 !!");
    return Row(
      children: [
        ElevatedButton(onPressed: () {
          _increment();
        },
            child: const Text("increment")),
        const SizedBox(
          width: 20,
        ),
        Text('count: $_count'),
      ],
    );
  }
}
