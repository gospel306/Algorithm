import java.util.Scanner;

public class Solution {
	private static void quickSort(int[] arr) {
		quickSort(arr,0,arr.length -1);
	}
	private static void quickSort(int[] arr, int start, int end) {
		int right = partition(arr, start, end);
		if(start < right - 1) {
			quickSort(arr, start, right - 1);
		}
		if(right < end) {
			quickSort(arr, right, end);
		}
	}
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end)/2];
		while(start <= end) {
			while(arr[start] < pivot) start++;
			while(arr[end] > pivot) end--;
			if(start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		for(int i = 0; i < num;i++)
			nums[i] = sc.nextInt();
		quickSort(nums);
		System.out.println(nums[(num-1)/2]);
	}
}
