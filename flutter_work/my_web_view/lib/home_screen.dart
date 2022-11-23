import 'package:flutter/material.dart';
import 'package:webview_flutter/webview_flutter.dart';

class HomeScreen extends StatelessWidget {
  HomeScreen({Key? key}) : super(key: key);

  WebViewController? mController;
  var homeUrl = "https://blog.naver.com/ji_euni";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.grey,
        title: Text("JI EUN BLOG"),
        centerTitle: true,
        actions: [
          IconButton(onPressed: () {
            if(mController == null){
              return;
            }
            mController!.loadUrl(homeUrl);
          }, icon: Icon(Icons.home, color: Colors.black,)),
        ],
      ),
      body: SafeArea(
        child: WebView(
          //controller: 위젯들을 프로그램적으로 조정할 수 있는 기능을 제공해주는 녀석
          onPageStarted: (url){
            print("url: $url");
          },
          onWebViewCreated: (controller) {
            this.mController = controller;
            } ,
          initialUrl: homeUrl,
          javascriptMode: JavascriptMode.unrestricted,
        ),
      ),
    );
  }
}
