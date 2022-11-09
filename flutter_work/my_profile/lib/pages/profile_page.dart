import 'package:flutter/material.dart';
import 'package:my_profile/components/profile_buttons.dart';
import 'package:my_profile/components/profile_count_info.dart';
import 'package:my_profile/components/profile_drawer.dart';
import 'package:my_profile/components/profile_header.dart';
import 'package:my_profile/components/profile_tab.dart';

class ProfilePage extends StatelessWidget {
  const ProfilePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: _buildProfileAppBar(),
      endDrawer: ProfileDrawer(),
      body: Column(
        // 스크롤 만들고 싶으면 ListView
        children: [
          const SizedBox(height: 20),
          ProfileHeader(),
          const SizedBox(height: 20),
          ProfileCountInfo(),
          const SizedBox(height: 20),
          ProfileButtons(),
          // //남아 있는 세로 공간을 모두 차지하기 위해 Expended를 준다.
          const SizedBox(height: 20),
          Expanded(child:ProfileTab()),
        ],
      ),
    );
  } // build 화면 렌더링 함수

  AppBar _buildProfileAppBar(){
    return AppBar(
      leading: Icon(Icons.arrow_back_ios),
      title: Text("Profile", style: TextStyle(color: Colors.black),),
      centerTitle: true,
    );
  }
}//end of class
