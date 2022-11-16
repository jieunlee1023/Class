import 'package:flutter/material.dart';
import 'package:flutter_airbnb/constants.dart';
import 'package:flutter_airbnb/size.dart';
import 'package:flutter_airbnb/styles.dart';

import '../common/common_form_field.dart';

class HomeHeaderForm extends StatelessWidget {
  const HomeHeaderForm({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    double screenWidth = MediaQuery.of(context).size.width;
    print("------------------->screenWidth $screenWidth");
    // Align은 정렬 위젯
    return Align(
      // -1.0 ~ 1.0까지 가로 범위에서 위치를 정렬
      // 0.1의 값은 전체 화면에서 5%이다.
      alignment: screenWidth < 520 ? Alignment(0, 0) : Alignment(-0.6, 0),
      child: Container(
        width: 420,
        decoration: BoxDecoration(
          borderRadius: BorderRadius.circular(20),
          color: Colors.white,
        ),
        child: Form(
          child: Padding(
            padding: const EdgeInsets.all(gap_l),
            child: Column(
              children: [
                _buildFormTitle(),
                _buildFormField(),
                _buildFormSumbit(),
              ],
            ),
          ),
        ),
      ),
    );
  }

  Widget _buildFormTitle() {
    return Column(
      children: [
        Text("에어비앤비에서 숙소를 검색하세요.", style: h4()),
        SizedBox(height: gap_xs),
        Text("혼자하는 여행에 적합한 개인실부터 여럿이 함께하는 여행에 좋은 공간전체 숙소까지 에어비엔비에 다 있습니다.",
            style: body1()),
        SizedBox(height: gap_m),
      ],
    );
  }

  Widget _buildFormField() {
    return Column(
      children: [
        CommonFormField(prefixText:"위치",hintText:"근처 추천 장소"),
        SizedBox(height: gap_s,),
        Row(
          children: [
            Expanded(child: CommonFormField(prefixText:"체크인",hintText:"날짜 입력")),
            SizedBox(width: gap_s),
            Expanded(child: CommonFormField(prefixText:"체크 아웃",hintText:"날짜 입력")),
          ],
        ),
        SizedBox(height: gap_s,),
        Row(
          children: [
            Expanded(child: CommonFormField(prefixText:"성인",hintText:"2")),
            SizedBox(width: gap_s),
            Expanded(child: CommonFormField(prefixText:"어린이",hintText:"0")),
          ],
        ),
        SizedBox(height: gap_m),
      ],
    );
  }

  Widget _buildFormSumbit() {
    return SizedBox(
      width: double.infinity,
      height: 50,
      child: TextButton(
        child: Text(
          "검색",
          style: TextStyle(fontWeight: FontWeight.bold, color: Colors.white),
        ),
        onPressed: () {
          //POST -> 데이터 서버 전송
          print("서브밋 클릭됨");
        },
        style: TextButton.styleFrom(
            backgroundColor: kAccentColor,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(10),
            )),
      ),
    );
  }
}
