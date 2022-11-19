class ResponseUser{
  var id;
  var username;
  var password;
  var email;
  var created;
  var updated;


  @override
  String toString() {
    return 'User{id: $id, username: $username, password: $password, email: $email, created: $created, updated: $updated}';
  }
}