import 'package:flutter/material.dart';

class BestDojeonTabBarView extends StatefulWidget {
  const BestDojeonTabBarView({Key? key}) : super(key: key);

  @override
  State<BestDojeonTabBarView> createState() => _BestDojeonTabBarViewState();
}

class _BestDojeonTabBarViewState extends State<BestDojeonTabBarView>
    with SingleTickerProviderStateMixin {
  TabController? _controller;

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    _controller = TabController(length: 14, vsync: this);
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        _buildTabBar(),
        Expanded(
          child: _buildTabBarView(),
        ),
      ],
    );
  } // end of build

  _buildTabBarTab(text) {
    return SizedBox(
      child: Tab(
        child: Text(
          text,
          style: h1(),
        ),
      ),
    );
  }

  _buildTabBar() {
    return SizedBox(
      height: 45,
      width: double.infinity,
      child: TabBar(
        isScrollable: true,
        controller: _controller,
        indicatorColor: Colors.green,
        tabs: [
          _buildTabBarTab("전체"),
          _buildTabBarTab("순정"),
          _buildTabBarTab("액션"),
          _buildTabBarTab("스포츠"),
          _buildTabBarTab("스릴러"),
          _buildTabBarTab("판타지"),
          _buildTabBarTab("드라마"),
          _buildTabBarTab("일상"),
          _buildTabBarTab("개그"),
          _buildTabBarTab("감성"),
          _buildTabBarTab("무협/사극"),
          _buildTabBarTab("스토리"),
          _buildTabBarTab("에피소드"),
          _buildTabBarTab("옴니버스"),
        ],
      ),
    );
  }

  _buildTabBarView() {
    return Container(
      color: Colors.white,
      child: TabBarView(
        controller: _controller,
        children: [
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          _buildTabBarViewComPonent(),
          // 탭바 뷰 애들 넣을 자리
        ],
      ),
    );
  }

  _buildTabBarViewComPonent({
    var img,
    var textMain,
    var textId,
    var textInfo,
    var rating,
    var date,
  }) {
    return Container(
      child: Row(
        mainAxisAlignment: MainAxisAlignment.start,
        children: [
          Container(),

        ],
      ),
    );
  }

} // end of class
