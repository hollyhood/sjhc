
public class gugudan {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		// 초기값을 지정 해 줍니다 i값이 단부분, j값이 1~9까지 계산 되어지는 부분입니다.
		while (a <= 9) {
			// i를 2단~9단부터 반복 작업을 시켜줍니다.
			while (b <= 9) {
				// j값을 주어서 각 단의 연산을 하도록 해 줍니다.
				System.out.print(a + " * " + b + " = " + (a * b));
				b++;
				// 초기화나 증가값을 주지 않으면 무한 반복하기 때문에 꼭 넣어 주어야 합니다.
				// j를 1씩 증가시켜주는 연산자입니다.
			}
			b = 1; // j를 1로 초기화 시켜주지 않으면 2단연산 이후의 while문이 돌아가지 않습니다.
			a++;
			// i도 1씩 증가시켜 줍니다.
		}
	}
}
