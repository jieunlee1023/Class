import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:my_recipes/components/recipe_list_item.dart';
import 'package:my_recipes/components/recipe_menu.dart';
import 'package:my_recipes/components/recipe_title.dart';

class RecipePage extends StatelessWidget {
  const RecipePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: _buildRecipeAppBar(),
      body: Padding(
        padding: const EdgeInsets.symmetric(horizontal: 20),
        // 양쪽 (수평)으로 20만큼 padding이 들어갔음
        child: ListView(
          // LiveView에는 스크롤 뷰가 포함되어 있다.
          children: [Column(
            // mainAxisAlignment: 주축방향
            // crossAxisAlignment: 교차축방향,
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              RecipeTitle(),
              RecipeMenu(),
              RecipeListItem(imageName: "burger", title: "Made Burger",),
              RecipeListItem(imageName: "coffee", title: "Made Coffee",),
              RecipeListItem(imageName: "pizza", title: "Made Pizza",),
            ],
          ),
        ]
        ),
      ),


    );
  }

  AppBar _buildRecipeAppBar(){
    return AppBar(
      backgroundColor: Colors.white,
      elevation: 1.0, // 그림자 속성
      actions: [
        Icon(
          CupertinoIcons.search,
          color: Colors.black,
        ),
        SizedBox(width: 15,),
        Icon(
          CupertinoIcons.heart,
          color: Colors.redAccent,
        ),
        SizedBox(width: 15,),
      ],
    );
  }
} // end of class
