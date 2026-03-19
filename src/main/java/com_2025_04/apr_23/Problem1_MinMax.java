package com_2025_04.apr_23;
/*
문제 1: 배열에서 최솟값과 최댓값 찾기
설명: 주어진 정수 배열에서 최솟값과 최댓값을 찾아 출력하세요.

입력 예시:
int[] numbers = {3, 7, 1, 9, 4};

출력 예시:
Min: 1
Max: 9
*/
public class Problem1_MinMax {
	public static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            min = Math.min(min, num);
        }
        return min;
    }

    public static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            max = Math.max(max, num);
        }
        return max;
    }
}
