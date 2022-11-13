import 'package:flutter/material.dart';
import 'package:my_flutter_login/size.dart';

class CustomTextFromField extends StatelessWidget {
  const CustomTextFromField({Key? key, required this.text}) : super(key: key);
  final String text;

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(text),
        SizedBox(
          height: small_gap,
        ),
        TextFormField(
          // TextFormField
          // 1. 가만히 있을 때 모양
          // 2. 포커스 했을 때 모양
          // 3. 값을 잘못 넣었을 때

          // ! : null이 절대 아니라고 컴파일러한테 알려주는 것
          //Validator : 방어적 코드 (따로 값이 안들어왔을 때, 데이터를 보낼 필요 X)
         validator: (value) => value!.isEmpty ? "Please enter some text" : null,
          obscureText: text=="Password" ? true : false,
          decoration: InputDecoration(
            hintText: "Enter $text",
            enabledBorder: OutlineInputBorder(
              // 활성화 되었을 때
              borderRadius: BorderRadius.circular(20),
            ),
            focusedBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(20),
            ),
            errorBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(20),
            ),
            focusedErrorBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(20),
            ),
          ),
        )
      ],
    );
  }
}
