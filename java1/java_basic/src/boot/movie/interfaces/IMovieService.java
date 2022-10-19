package boot.movie.interfaces;

import java.util.List;

import boot.movie.dto.RequestMovie;
import boot.movie.dto.ResponseMovie;

public interface IMovieService {

	List<ResponseMovie> selectAllMovieInfo();

	List<ResponseMovie> selectMovieByName(String movieName); // 이름으로 영화 검색

	boolean insertMovie(RequestMovie req);

	void updateMovie(String oldName, String newName);

	void deleteMovie(int movieId);

}
