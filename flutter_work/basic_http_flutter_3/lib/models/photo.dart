class Photo {
  var albumId;
  var id;
  var title;
  var url;
  var thumbnailUrl;

  Photo({this.albumId, this.id, this.title, this.url, this.thumbnailUrl});

  Photo.init(this.title);

  Photo.formJson(Map<String, dynamic> photoMapData)
      : albumId = photoMapData["albumId"],
        id = photoMapData["id"],
        title = photoMapData["title"],
        url = photoMapData["url"],
        thumbnailUrl = photoMapData["thumbnailUrl"];

  @override
  String toString() {
    return 'Photo{albumId: $albumId, id: $id, title: $title, url: $url, thumbnailUrl: $thumbnailUrl}';
  }
}
