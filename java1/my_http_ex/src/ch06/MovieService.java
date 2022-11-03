package ch06;

import java.util.ArrayList;

public class MovieService {

	String status;
	String status_message;
	Data data;

	public class Data {
		int movie_count;
		int limit;
		int page_number;
		ArrayList<Movies> movies;

		public class Movies {
			int id;
			String url;
			String imdb_code;
			String title;
			String title_english;
			String title_long;
			String slug;
			int year;
			double rating;
			int runtime;
			ArrayList<String> genres;

			String summary;
			String description_full;
			String synopsis;
			String yt_trailer_code;
			String language;
			String mpa_rating;
			String background_image;
			String background_image_original;
			String small_cover_image;
			String medium_cover_image;
			String large_cover_image;
			String state;
			String date_uploaded;
			int date_uploaded_unix;
			@Override
			public String toString() {
				return "Movies [id=" + id + ", url=" + url + ", imdb_code=" + imdb_code + ", title=" + title
						+ ", title_english=" + title_english + ", title_long=" + title_long + ", slug=" + slug
						+ ", year=" + year + ", rating=" + rating + ", runtime=" + runtime + ", genres=" + genres
						+ ", summary=" + summary + ", description_full=" + description_full + ", synopsis=" + synopsis
						+ ", yt_trailer_code=" + yt_trailer_code + ", language=" + language + ", mpa_rating="
						+ mpa_rating + ", background_image=" + background_image + ", background_image_original="
						+ background_image_original + ", small_cover_image=" + small_cover_image
						+ ", medium_cover_image=" + medium_cover_image + ", large_cover_image=" + large_cover_image
						+ ", state=" + state + ", date_uploaded=" + date_uploaded + ", date_uploaded_unix="
						+ date_uploaded_unix + "]"+ "\n";
			}

			
		}// end of Movies

		@Override
		public String toString() {
			return "Data [movie_count=" + movie_count + ", limit=" + limit + ", page_number=" + page_number
					+ ", movies=" + movies + "]" + "\n";
		}
		
	}// end of Data

	@Override
	public String toString() {
		return "MovieService [status=" + status + ", status_message=" + status_message + ", data=" + data + "]"+ "\n";
	}


}
