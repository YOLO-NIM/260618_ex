import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args){
        // forEach : 향상된 for문 <- js에서 본 get of와 유사, python의 for문이 이 방식
        char[] charArr = {'a', 'b', 'c'};
        for (int i = 0; i < charArr.length; i++) {
            System.out.println("i = " + i);
            System.out.println("charArr[i] = " + charArr[i]);
            // i는 위의 블록 내 혹은 for()안에 있는 변화식에 영향을 받아야 하기 때문에 조작이 가능
        }
        for(char c : charArr){ // iter - iteration
            System.out.println("c = " + c); // 보통은 v를 많이 쓰며, 타입의 이니셜을 사용하기도 한다.
            c -= 32;
            System.out.println("c = " + c);
            // 앞에 배치되면 지역변수는 'readonly' -> 새롭게 만들어져서 대입되는 친구
            System.out.println("Arrays.toString(charArr) = " + Arrays.toString(charArr));
        }
        char[][] charMatrix = {
                {'o', 'o', 'x'},
                {'x', 'o', 'x'},
                {'x', 'o', 'o'},
        };
        int i = 0;
        int j = 0;
        for (char[] row : charMatrix) {
            i++;
            for (char col : row) {
                j++;
                System.out.println("row = " + row); // 인덱스를 못씀
                System.out.println("col = " + col);
            }
        }
        // => 이럴바에야 그냥 for문 사용
    }
}
