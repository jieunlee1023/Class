import 'package:flutter/material.dart';
import 'package:flutter_airbnb/size.dart';

import '../../styles.dart';
import 'home_body_popular_item.dart';


class HomeBodyPopular extends StatelessWidget {
  const HomeBodyPopular({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(top: gap_m),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          _buildPopularTitle(),
          _buildPopularlist(),
        ],
      ),
    );
  }

  Widget _buildPopularTitle() {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text("한국 숙소에 직접 다녀간 게스트의 후기", style: h5(mColor: Colors.black)),
        Text("게스트 후기 2,500,000개 이상 평균 평점 4.7(5점 만점)",
            style: body1(mColor: Colors.grey)),
        const SizedBox(height: gap_m,),
      ],
    );
  }

  Widget _buildPopularlist() {
    return Wrap(
      crossAxisAlignment: WrapCrossAlignment.start,
      // 자동으로 전체 크기에 따라 내려줌
      children: [
        HomeBodyPopularItem(id: 0),
        SizedBox(width: 7,),
        HomeBodyPopularItem(id: 1),
        SizedBox(width: 7,),
        HomeBodyPopularItem(id: 2),
      ],
    );
  }
}
