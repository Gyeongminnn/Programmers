package aa;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {
//    	 answer = list.stream().mapToInt(Integer::intValue).toArray();
    	int[] array = {1,2};
    	int[] sub_arr = new int[1000];
    	for(int i = 0; i < array.length; i++) {
    		sub_arr[array[i]]++;
    	}
    	int maxCount = 0;
    	int answer = 0;
    	for(int i = 0; i < sub_arr.length; i++) {
    		if(maxCount == sub_arr[i]) {
    			answer = -1;
    		}else if (maxCount < sub_arr[i]) {
    			maxCount = sub_arr[i];
    			answer = i;
    		}
    	}
    	// maxCount보다 sub_arr[i]의 값이 크면 maxCount에 sub_arr[i]값을 대입할 거야
    	// for문으로 반복하니까 더 큰 숫자(더 큰 sub_arr[i]값)가 나오면 maxCount가 바뀌니까
    	// 제일 숫자가 큰(제일 많이 나왔던(=최빈값)) sub_arr[i]값이 최종 maxCount가 될 건데
    	// 그때 i값이 최빈값임!
    	// sub_arr[i] 인덱스 값이 실제 배열 원소값이니까!
    	// 근데 1이랑 2 두 개만 배열에 있다면
    	// sub_arr[i]에는 1 값이 들어가는데 다시 2 비교할 때 sub_arr[i] 값이 1이니까
    	// 1번 케이스 (if문)에 해당하므로 -1이 answer의 값이 된다!
    	System.out.println(answer);
    	
    	
    	
    }

}

