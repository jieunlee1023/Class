import 'package:flutter/material.dart';

import '../../../textstyle.dart';

class BestDojeonHeader extends StatelessWidget {
  const BestDojeonHeader({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(16.0),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            "오늘의 인기 베스트",
            style: h6(),
          ),
          SizedBox(
            height: 10,
          ),
          Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: [
            _buildTodayBest("zzz", "조의 괴기만화", "ky****"),
            _buildTodayBest("zzz", "시놉시스", "joy_****"),
            _buildTodayBest("zzz", "육식 토끼", "bybo****"),
          ],
            ),
        ],
      ),
    );
  }

  Widget _buildTodayBest(var img, var title, var id) {
    return Container(
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Container(
            width: 110,
            height: 80,
            child: ClipRRect(
              borderRadius: BorderRadius.circular(100),
              child: Image.asset(
                "assets/$img.jpg",
              ),
            ),
          ),
          SizedBox(
            height: 10,
          ),
          Text(
            title,
          ),
          SizedBox(
            height: 5,
          ),
          Text(id, style: h0(),),
        ],
      ),
    );
  }
}
