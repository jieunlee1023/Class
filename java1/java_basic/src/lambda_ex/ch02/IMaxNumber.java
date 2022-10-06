package lambda_ex.ch02;

/**
 * 
 * @author 이지은 두 수중에 큰 수를 반환하는 기능을 만들어주세요 (람다식으로 사용할 예정)
 *
 */
@FunctionalInterface
public interface IMaxNumber {
	int getMax(int x, int y);

}
