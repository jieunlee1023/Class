class Company {
  var name;
  var catchPhrase;
  var bs;

  Company.fromJson(Map<String, dynamic> companyJson)
      : name = companyJson["name"],
        catchPhrase = companyJson["catchPhrase"],
        bs = companyJson["bs"];

  @override
  String toString() {
    return 'Company{name: $name, catchPhrase: $catchPhrase, bs: $bs}';
  }
}
