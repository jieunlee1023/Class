class RequestUser {
  var id;
  var username;
  var password;
  var email;
  var created;
  var updated;

  RequestUser(
      {this.id,
      this.username,
      this.password,
      this.email,
      this.created,
      this.updated});

  Map<String, dynamic> toJsonCreate() {
    Map<String, dynamic> data = {};
    data['username'] = username.toString();
    data['password'] = password.toString();
    data['email'] = email.toString();
    return data;
  }

  Map<String, dynamic> toJsonLogin() {
    Map<String, dynamic> data = {};
    data['username'] = username.toString();
    data['password'] = password.toString();
    return data;
  }

  Map<String, dynamic> toJsonUpdate() {
    Map<String, dynamic> data = {};
    data['password'] = password.toString();
    data['email'] = email.toString();
    return data;
  }

  @override
  String toString() {
    return 'User{id: $id, username: $username, password: $password, email: $email, created: $created, updated: $updated}';
  }
}
