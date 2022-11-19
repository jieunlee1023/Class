class Todo {
  // 넘겨받는 키값과 정확히 같아야 받을 수 있다.
  var userId;
  var id;
  var title;
  var completed;

  Todo({this.userId, this.id, this.title, this.completed});

  Todo.init({this.userId, this.title, this.completed});

  Todo.fromJson(Map<String, dynamic> mapData)
      : userId = mapData["userId"],
        id = mapData["id"],
        title = mapData["title"],
        completed = mapData["completed"];

  // 단축키 Alt + insert
  @override
  String toString() {
    return 'Todo{userId: $userId, id: $id, title: $title, completed: $completed}';
  }
}
