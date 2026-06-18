import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args){
        // array
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        System.out.println(i1 + " " + i2 + " " + i3);
//        int[] arr1;           // 선언
//        arr1 = new int[3];    // 할당
        int[] arr1 = new int[3]; // 선언 + 할당 = 배열 초기화
        // 할당이 되면 그 할당이 된 배열은 더 이상 길이를 바꿀 수 X
        // 완전히 다른 아예 새로운 배열을 할당형으로 대체할 순 있음.
        System.out.println("arr1= " + arr1);
        arr1 = new int[5];
        System.out.println("arr1= " + arr1); // immutable -> 대체
        int arr2[] = new int[10]; // c 스타일, 되긴 하는데 권장하지 X
        System.out.println("arr1[0]= " + arr1[0]); // 기본값 0
        arr1[0] = 10; // 대입, 수정, 호출 -> 인덱스를 기준으로 이루어짐
        System.out.println("arr1[10] = " + arr1[0]);
        System.out.println("arr.length = " + arr1.length);
        // 인덱스는 0부터 시작하기 때문에 일반적으로 호출 가능한 최대 인덱스는 length - 1
//        System.out.println("arr1[arr.length] = " + arr1[arr1.length]);
        //-> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // <= arr.length -1 또는 < arr.length로 범위 지정
        // 배열을 그냥 찍으면 객체의 해시값이 나옴
        // 그럼 내부를 보고 싶으면..?
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // 배열 리터럴 {}
        int[] arr3 = {1, 2, 3};
        System.out.println(Arrays.toString(arr3));

        // 다중배열 선언, 인덱스 호출, to String
//        int[][] arr4 = new int[2][3]; // 앞에 있는게 밖을 감싸는 형태
        // 2개 -> (3개)를 반복하는 형태
        int[][] arr4 = new int[2][3];
        arr4[0][1] = 10;
        arr4[1][2] = 200;
        System.out.println(Arrays.toString(arr4)); // 해시값이 나옴
        System.out.println(Arrays.deepToString(arr4)); // 값이 나옴
        int[][] arr5 = {{1, 2, 3}, {2, 4, 5}};
        System.out.println(Arrays.deepToString(arr5));
    }
}
