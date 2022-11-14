import 'package:flutter/material.dart';
import 'package:flutter_svg/svg.dart';

class Logo extends StatelessWidget {
  const Logo ({Key? key, required this.title}) : super(key: key) ;
  final String title;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        //   https://pub.dev/ : 플러터의 모든 라이브러리가 모아져있음
        SvgPicture.asset(
          "assets/logo.svg",
          semanticsLabel: 'Acme Logo',
          height: 70,
          width: 70,
        ),
        Text(
          title,
          style: TextStyle(fontSize: 40, fontWeight: FontWeight.bold),
        ),
      ],
    );
  }

}
