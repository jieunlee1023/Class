import 'package:flutter/material.dart';

import '../components/custom_text_from_field.dart';

import '../components/logo.dart';
import '../size.dart';

class LogiinPage extends StatelessWidget {
  const LogiinPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    // build 화면을 렌더링 할 때마다 매번 불러오는 함수
    return Scaffold(
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: ListView(
          children: [
            SizedBox(height: xlarge_gap),
            Logo(title: 'Login'),
            CustomTextFromField(text: "Email"),
            SizedBox(height: small_gap),
            CustomTextFromField(text: "Password"),
            SizedBox(height: large_gap),
            TextButton(
              style: ButtonStyle(
                  backgroundColor: MaterialStateProperty.all(Colors.black87),
                  shape: MaterialStateProperty.all(RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(20.0),
                      side: BorderSide(color: Colors.black87)))),
              onPressed: () {
                Navigator.pushNamed(context, "/home");
              },
              child: Padding(
                padding: const EdgeInsets.all(12.0),
                child: Text(
                  "Login",
                  style: TextStyle(color: Colors.white, fontSize: 16),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
