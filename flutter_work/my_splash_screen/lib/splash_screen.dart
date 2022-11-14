import 'package:flutter/material.dart';
import 'package:my_splash_screen/main.dart';

class SplashScreen extends StatelessWidget {
  const SplashScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    Future.delayed(const Duration(seconds: 3), () {
      Navigator.push(context, MaterialPageRoute(builder: (context){
        return MainScreen();
      }));
    });


    return Column(
      children: [
        Expanded(
          child: Container(
            padding: EdgeInsets.all(16.0),
            // hex code - 0xFFFFFF 0x:16진수 : Color(0xFFFFFF)
            color: Color.fromRGBO(26, 188, 4, 1),
            child: AspectRatio(
              aspectRatio: 9 / 16,
              child: Image.asset(
                "assets/splash.png",
                fit: BoxFit.fill,
              ),
            ),
          ),
        ),
        Flexible(child: CircularProgressIndicator())

      ],
    );
  }
}