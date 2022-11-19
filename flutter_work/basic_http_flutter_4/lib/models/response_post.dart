class ResponsePost {
  var id;
  var title;
  var body;
  var userId;

  ResponsePost.fromJson(Map<String, dynamic> map)
      : id = map["id"],
        title = map["title"],
        body = map["body"],
        userId = map["userId"];

  @override
  String toString() {
    return '서버로부터 응답 : {id: $id, title: $title, body: $body, userId: $userId}';
  }
}
