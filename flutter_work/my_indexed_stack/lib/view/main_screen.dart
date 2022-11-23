import 'package:flutter/material.dart';
import 'package:my_indexed_stack/view/home_screen.dart';
import 'package:my_indexed_stack/view/my_profile.dart';

class MainScreen extends StatefulWidget {
  const MainScreen({Key? key}) : super(key: key);

  @override
  State<MainScreen> createState() => _MainScreenState();
}

class _MainScreenState extends State<MainScreen> {

  int _selectedIndex=0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: IndexedStack(
        index: _selectedIndex,
        children: [
          HomeScreen(),
          MyProfile(),
          //여기 갯수와 버튼의 갯수가 같아야한다.
        ],
      ),
      bottomNavigationBar: BottomNavigationBar(
        //최대 5개까지 만들 수 있다.
        selectedItemColor: Colors.red,
         unselectedItemColor: Colors.grey,
         currentIndex: _selectedIndex,
        onTap: (index) {
          setState(() {
          _selectedIndex = index;
          });
        },
        items: [
          BottomNavigationBarItem(icon: Icon(Icons.home), label: "홈"),
          BottomNavigationBarItem(icon: Icon(Icons.people_rounded), label: "my"),
        ],
      ),
    );
  }
}
