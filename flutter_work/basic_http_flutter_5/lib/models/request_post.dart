class RequestPost {
  var id;
  var title;
  var content;
  var user;
  var created;
  var update;

  RequestPost(
      {this.id,
      this.title,
      this.content,
      this.user,
      this.created,
      this.update});

  Map<String, dynamic> toJsonCreate() {
    Map<String, dynamic> data = {};
    data['title'] = title.toString();
    data['content'] = content.toString();
    return data;
  }

  @override
  String toString() {
    return 'RequestPost{id: $id, title: $title, content: $content, user: $user, created: $created, update: $update}';
  }
}
