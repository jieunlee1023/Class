import 'package:flutter/material.dart';

class ProfileButtons extends StatelessWidget {
  const ProfileButtons({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceAround,
      children: [
        _buildFlowButton(),
        _buildMessageButton(),
      ],
    );
  }

  //InkWell 위젯은 모든 위젯을 버튼화 시켜주는 위젯 입니다.
  // TextButton, ElevatedButton, OutlinedButton
  Widget _buildFlowButton() {
    return InkWell(
      onTap: () {
        print("Follow 버튼 클릭됨");
      },
      child: Container(
        alignment: Alignment.center,
        width: 150,
        height: 45,
        decoration: BoxDecoration(
          color: Colors.blue,
          borderRadius: BorderRadius.circular(10),
        ),
        child: Text(
          "Follow",
          style: TextStyle(color: Colors.white),

        ),
      ),
    );
  }

  Widget _buildMessageButton() {
    return InkWell(
      onTap: () {
        print("메시지 버튼 클릭됨");
      },
      child: Container(
        alignment: Alignment.center,
        width: 150,
        height: 45,
        decoration: BoxDecoration(
          color: Colors.white,
          borderRadius: BorderRadius.circular(10),
          border: Border.all(),
        ),
        child: Text(
          "Message",
          style: TextStyle(color: Colors.black),

        ),
      ),);
  }
}
