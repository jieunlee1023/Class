class Todo {
  var userId;
  var id;
  var title;
  var completed;

  // 객체 --> 모든 객체는 클래스의 인스턴스 입니다.
  // 객체를 메모리에 올릴 때에는 생성자가 필요하다.

  Todo.fromJson(Map<String, dynamic> map)
      : userId = map["userId"],
        id = map["id"],
        title = map["title"],
        completed = map["completed"];

  @override
  String toString() {
    return 'Todo{userId: $userId, id: $id, title: $title, completed: $completed}';
  }
}
