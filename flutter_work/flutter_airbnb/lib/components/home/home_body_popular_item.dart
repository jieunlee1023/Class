import 'dart:html';

import 'package:flutter/material.dart';
import 'package:flutter_airbnb/size.dart';
import 'package:flutter_airbnb/styles.dart';

import '../../constants.dart';

class HomeBodyPopularItem extends StatelessWidget {
  HomeBodyPopularItem({Key? key, required this.id}) : super(key: key);

  final id;
  final popularList = [
    "p1.jpeg",
    "p2.jpeg",
    "p3.jpeg",
  ];
  final popularCommentList = [
    "깔끔하고 다 갖춰져있어서 좋았어요:) 위치도 완전 좋아용 다들 여기서 살고 싶다구ㅋㅋㅋㅋㅋ"
        "화장실도 3개예요!!! 5명이서 씻는것도 전혀 불편함없이 좋았어요 ^^ 이불도 포근하고 좋습니당 ㅎㅎ",
    "한강뷰로 해주셨어요 감사합니다 . 체크인전 친절하게 짐 보관 해주셨어요. 조식도 깔끔하게 좋았습니다^^",
    "체크인을 하는 데에 시간이 오래 걸려서 그 부분이 좀 아쉽습니다. "
        "어메니티부터 룸 상태까지 굉장히 만족스럽습니다. 여태 사용한 어메니티 중에 가장 마음에 들어서 따로 개별 구매도 생각 중입니다."
        " 화장실과 샤워실은 다소 공간이 협소한데 방 크기 커서 답답하지 않고 티비도 커서 호캉스를 즐기기에는 더할나위 없이 좋았네요. "
        "역 근처라 접근성은 물론이고, 호텔 바로 나와서 뒤편에 편의점과 카페가 있어서 편의성도 최고입니다.",
  ];
  final nickName = ["이지은", "김지은", "박지은"];

  @override
  Widget build(BuildContext context) {
    double popularItemWidth = getBodyWidth(context) / 3 - 5;
    return Container(
      constraints: BoxConstraints(
        minWidth: 320,
      ),
      child: SizedBox(
        width: popularItemWidth,
        child: Column(
          children: [
            _buildPopularItemImage(),
            _buildPopularItemStar(),
            _buildPopularItemComment(),
            _buildPopularItemUserInfo(),
          ],
        ),
      ),
    );
  } //end of build

  Widget _buildPopularItemImage() {
    return Column(children: [
      ClipRRect(
        borderRadius: BorderRadius.circular(10),
        child: Image.asset(
          "assets/${popularList[id]}",
          fit: BoxFit.cover,
        ),
      ),
      const SizedBox(height: gap_s),
    ]);
  }

  Widget _buildPopularItemStar() {
    return Column(
      children: [
        Row(
          children: [
            Icon(Icons.star, color: kAccentColor),
            Icon(Icons.star, color: kAccentColor),
            Icon(Icons.star, color: kAccentColor),
            Icon(Icons.star, color: kAccentColor),
            Icon(Icons.star, color: kAccentColor),
          ],
        ),
        const SizedBox(height: gap_s),
      ],
    );
  }

  Widget _buildPopularItemComment() {
    return Column(
      children: [
        Text(
          popularCommentList[id],
          style: body1(),
          maxLines: 3, //최대 3줄까지만 보여줘!
          overflow: TextOverflow.ellipsis, // 글자가 더 있다는 ...처리
        ),
        const SizedBox(
          height: gap_s,
        )
      ],
    );
  }

  Widget _buildPopularItemUserInfo() {
    return Column(
      children: [
        Row(
          children: [
            CircleAvatar(
              backgroundImage: AssetImage("assets/${popularList[id]}"),
            ),
            SizedBox(
              width: gap_s,
            ),
            Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  nickName[id],
                  style: subtitle1(),
                ),
                Text(
                  "대한민국",
                  style: subtitle2(mColor: Colors.grey),
                ),
              ],
            ),
          ],
        ),
        const SizedBox(height: gap_l),
      ],
    );
  }
}
