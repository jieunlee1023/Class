import 'package:flutter/material.dart';

class ProfileHeader extends StatelessWidget {
  const ProfileHeader({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        // 동그란 이미지
        SizedBox(width: 20,),
        _buildHeaderAvatar(),
        SizedBox(width: 20,),
        // 이름 - profilez
        _buildHeaderProfile(),
      ],
    );
  }

  Widget _buildHeaderAvatar() {
    return SizedBox(
      width: 100,
      height: 100,
      //CircleAvatar 이미지를 둥글게 만들어주는 위젯입니다.
      child: CircleAvatar(
        backgroundImage: AssetImage("assets/avatar.png"),
        // 이미지는 핫리로드 대상이 아님! (껐다 켜야함)
      ),
    );
  }

  Widget _buildHeaderProfile() {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(
          "부트캠프",
          style: TextStyle(
            fontSize: 25,
            fontWeight: FontWeight.bold,
          ),
        ),
        Text(
          "프로그래머/초특급고수",
          style: TextStyle(
            fontSize: 20,
          ),
        ),
        Text(
          "벤츠타는 개발자",
          style: TextStyle(
            fontSize:15,
          ),
        ),
      ],
    );
  }
}
