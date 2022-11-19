import 'package:basic_http_flutter_3/models/company.dart';

class User {
  int? id;
  String? name;
  String? email;
  Company? company;
  String? city;

  User.fromJson(Map<String, dynamic> mapJson)
      : id = mapJson["id"],
        name = mapJson["name"],
        email = mapJson["email"],
        company = Company.fromJson(mapJson["company"]),

        // city 값도 받아서 넣어주세요!
        city = mapJson["address"]["city"];

  @override
  String toString() {
    return 'User{id: $id, name: $name, email: $email, company: $company, city: $city}';
  }
}
