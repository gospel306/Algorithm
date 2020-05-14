import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] A,field;
	static ArrayList<ArrayList<ArrayList<Tree>>> trees = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		A = new int[N][N];
		field = new int[N][N];
		for(int i = 0;i < N;i++) {
			trees.add(new ArrayList<>());
			for(int j = 0;j < N;j++) {
				trees.get(i).add(new ArrayList<>());
				A[i][j] = sc.nextInt();
				field[i][j] = 5;
			}
		}
		for(int i = 0;i < M;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			trees.get(x-1).get(y-1).add(new Tree(1,z));
		}
		
		for(int i = 0;i < K;i++) {
			Spring();
			Summer();
			Fall();
			Winter();
		}
		int count = 0;
		for(int i = 0;i <trees.size();i++) {
			for(int j =0;j<trees.get(i).size();j++) {
				count += trees.get(i).get(j).size();
			}
		}
		System.out.println(count);

	}
	static void Spring() {
		for(int i = 0;i < trees.size();i++) {
			for(int j = 0;j < trees.get(i).size();j++) {
				for(int k = 0;k< trees.get(i).get(j).size();k++) {
					if(trees.get(i).get(j).get(k).age>field[i][j]) {
						trees.get(i).get(j).get(k).z = 0;
					}else {
						field[i][j] -= trees.get(i).get(j).get(k).age++;
					}
				}
			}
		}
	}
	static void Summer() {
		for(int i = 0;i<trees.size();i++) {
			for(int j = 0;j < trees.get(i).size();j++) {
				for(int k = 0;k<trees.get(i).get(j).size();k++) {
					if(trees.get(i).get(j).get(k).z == 0) {
						field[i][j] += trees.get(i).get(j).get(k).age/2;
						trees.get(i).get(j).remove(k);
						k--;
					}
				}
			}
		}
	}
	static void Fall() {
		int[][] arr = {{1,0},{1,-1},{1,1},{0,1},{0,-1},{-1,0},{-1,1},{-1,-1}};
		for(int i = 0;i < trees.size();i++) {
			for(int j = 0;j< trees.get(i).size();j++) {
				for(int k = 0;k<trees.get(i).get(j).size();k++) {
					if(trees.get(i).get(j).get(k).age%5 == 0) {
						for(int v=0;v<arr.length;v++) {
							if(i+arr[v][0]>=0 && i+arr[v][0]<trees.size() && j+arr[v][1]>=0 && j+arr[v][1]<trees.get(i).size()) {
								trees.get(i+arr[v][0]).get(j+arr[v][1]).add(0,new Tree(1,1));
							}
						}
					}
				}
			}
		}
	}
	static void Winter() {
		for(int i = 0;i < field.length;i++) {
			for(int j = 0;j < field[i].length;j++) {
				field[i][j] += A[i][j];
			}
		}
	}
	static class Tree{
		int z;
		int age;
		public Tree(int z,int age) {
			this.z = z;//상태
			this.age = age;//나이
		}
	}
}
