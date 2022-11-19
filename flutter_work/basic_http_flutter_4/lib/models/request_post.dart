class RequestPost{
  var id;
  var title;
  var body;
  var userId;

  RequestPost({this.title, this.body, this.userId});
  RequestPost.init({this.id, this.title, this.body, this.userId});

  Map<String, dynamic> toJson() {
    Map<String,dynamic> data = {};
    data['id'] = id.toString();
    data['title'] = title.toString();
    data['body'] = body.toString();
    data['userId'] = userId.toString();
    return data;
  }

  @override
  String toString() {
    return 'RequestPost{id: $id, title: $title, body: $body, userId: $userId}';
  }
}